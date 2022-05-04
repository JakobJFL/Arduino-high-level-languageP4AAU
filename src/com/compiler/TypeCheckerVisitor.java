package com.compiler;

import com.compiler.Exceptions.NotDeclared;
import com.compiler.Exceptions.TypeException;
import com.compiler.SymbolTbl.SymbolTbl;
import com.compiler.SymbolTbl.Symbols.FuncDefSymbol;
import com.compiler.SymbolTbl.Symbols.TypeSymbol;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class TypeCheckerVisitor extends HlmpBaseVisitor<Integer> {
    SymbolTbl symbolTbl;

    public TypeCheckerVisitor(SymbolTbl symbolTbl) {
        this.symbolTbl = symbolTbl;
        this.symbolTbl.currentScope = this.symbolTbl.globalScope;
    }

    @Override
    public Integer visitIfStmtDef(HlmpParser.IfStmtDefContext ctx) {
        symbolTbl.currentScope = symbolTbl.scopesProperty.get(ctx);
        super.visitIfStmtDef(ctx);
        symbolTbl.currentScope = symbolTbl.currentScope.parent;
        return null;
    }

    @Override
    public Integer visitElseStmtDef(HlmpParser.ElseStmtDefContext ctx) {
        symbolTbl.currentScope = symbolTbl.scopesProperty.get(ctx);
        super.visitElseStmtDef(ctx);
        symbolTbl.currentScope = symbolTbl.currentScope.parent;
        return null;
    }

    @Override
    public Integer visitWhileExprDef(HlmpParser.WhileExprDefContext ctx) {
        symbolTbl.currentScope = symbolTbl.scopesProperty.get(ctx);
        super.visitWhileExprDef(ctx);
        symbolTbl.currentScope = symbolTbl.currentScope.parent;
        return null;
    }

    @Override
    public Integer visitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        String returnType = ctx.funcHead().type().start.getText();
        String returnTypeStmt = ctx.body().start.getText();

        System.out.println(returnType + returnTypeStmt);

        if (returnType.equals(returnTypeStmt)) {
            symbolTbl.currentScope = symbolTbl.scopesProperty.get(ctx);
            super.visitFuncDefinition(ctx);
            symbolTbl.currentScope = symbolTbl.currentScope.parent;
            return null;
        }
        else {
            throw new TypeException("ReturnType");
        }
    }

    @Override
    public Integer visitProcDefinition(HlmpParser.ProcDefinitionContext ctx) {
        symbolTbl.currentScope = symbolTbl.scopesProperty.get(ctx);
        super.visitProcDefinition(ctx);
        symbolTbl.currentScope = symbolTbl.currentScope.parent;
        return null;
    }

    @Override
    public Integer visitStmtAssign(HlmpParser.StmtAssignContext ctx) {
        TypeSymbol symbol = (TypeSymbol) symbolTbl.getSymbol(ctx.id().getText());
        Integer type = symbol.getType().start.getType();
        Integer expr = visit(ctx.expr());
        if (expr == type) {
            return type;
        }
        else {
            throw new TypeException("StmtAssign");
        }
    }

    @Override
    public Integer visitVarDeclaration(HlmpParser.VarDeclarationContext ctx) {
        Integer type = ctx.type().start.getType();
        if (ctx.expr() != null) {
            Integer expr = visit(ctx.expr());
            if (expr == type) {
                return type;
            }
            else {
                throw new TypeException("VarDeclaration");
            }
        }
        else {
            return type;
        }
    }

    @Override
    public Integer visitExprParenthesised(HlmpParser.ExprParenthesisedContext ctx) {
        return super.visitExprParenthesised(ctx);
    }

    @Override
    public Integer visitExprBinaryFloat(HlmpParser.ExprBinaryFloatContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);
        if (left == HlmpLexer.NUMTYPE && right == HlmpLexer.NUMTYPE) {
            return HlmpLexer.NUMTYPE;
        }
        else
            throw new TypeException();
    }

    @Override
    public Integer visitExprBinaryBool(HlmpParser.ExprBinaryBoolContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);

        if (left == HlmpLexer.NUMTYPE && right == HlmpLexer.NUMTYPE)
            return HlmpLexer.BOOLTYPE;
        throw new TypeException();
    }

    @Override
    public Integer visitExprBinaryBoolEqual(HlmpParser.ExprBinaryBoolEqualContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);
        if (left == HlmpLexer.NUMTYPE || right == HlmpLexer.NUMTYPE)
            return HlmpLexer.BOOLTYPE;
        else if (left == HlmpLexer.BOOLTYPE || right == HlmpLexer.BOOLTYPE)
            return HlmpLexer.BOOLTYPE;
        else
            throw new TypeException();
    }

    @Override
    public Integer visitExprBinaryLog(HlmpParser.ExprBinaryLogContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);
        if (left != HlmpLexer.BOOLTYPE || right != HlmpLexer.BOOLTYPE)
            throw new TypeException();
        else
            return HlmpLexer.BOOLTYPE;
    }

    @Override
    public Integer visitExprUnaryNeg(HlmpParser.ExprUnaryNegContext ctx) { return HlmpLexer.BOOLTYPE;}

    @Override
    public Integer visitOperandSFloat(HlmpParser.OperandSFloatContext ctx) {
        return HlmpLexer.NUMTYPE;
    }

    @Override
    public Integer visitOperandBool(HlmpParser.OperandBoolContext ctx) {
        return HlmpLexer.BOOLTYPE;
    }

    @Override
    public Integer visitExprReadFunc(HlmpParser.ExprReadFuncContext ctx) {
        return super.visitExprReadFunc(ctx);
    }

    @Override
    public Integer visitOperandId(HlmpParser.OperandIdContext ctx) {
        TypeSymbol symbol = (TypeSymbol) symbolTbl.getSymbol(ctx.id().getText());
        if (symbol == null) {
            throw new NotDeclared();
        }
        return symbol.getType().start.getType();
    }

    @Override
    public Integer visitFunctionCall(HlmpParser.FunctionCallContext ctx) {
        if (ctx.args().children != null)
            visit(ctx.args());
        FuncDefSymbol symbol = (FuncDefSymbol) symbolTbl.getSymbol(ctx.id().getText());
        if (symbol == null) {
            throw new NotDeclared();
        }
        else if (symbol.getType() == null) {
            return null;
        }
        else {
            return symbol.getType().start.getType();
        }
    }

    @Override
    public Integer visitArguments(HlmpParser.ArgumentsContext ctx) {
        List<Integer> parametersType = new ArrayList<>();
        for (ParseTree i : ctx.expr()) {
            if (i instanceof HlmpParser.ExprContext)
                parametersType.add(visit(i));
        }
        String id = ctx.getParent().children.get(0).getText();
        FuncDefSymbol symbol = (FuncDefSymbol) symbolTbl.getSymbol(id);
        if (symbol == null) {
            return null;
        }
        List<TypeSymbol> parameters = symbol.getParameters();
        if (parametersType.size() != parameters.size()) {
            throw new TypeException();
        }
        for (int i = 0; i < parameters.size(); i++) {
            if (parameters.get(i).getType().start.getType() != parametersType.get(i)) {
                throw new TypeException();
            }
        }
        return parametersType.get(0);
    }
}
