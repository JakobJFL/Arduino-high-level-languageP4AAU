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
    private SymbolTbl symbolTbl;

    public TypeCheckerVisitor(SymbolTbl symbolTbl) {
        this.symbolTbl = symbolTbl;
        this.symbolTbl.currentScope = this.symbolTbl.globalScope;
    }

    @Override
    public Integer visitIfStmtDef(HlmpParser.IfStmtDefContext ctx) {
        symbolTbl.currentScope = symbolTbl.scopesProperty.get(ctx);
        super.visitIfStmtDef(ctx);
        symbolTbl.currentScope = symbolTbl.currentScope.parent;
        return defaultResult();
    }

    @Override
    public Integer visitElseStmtDef(HlmpParser.ElseStmtDefContext ctx) {
        symbolTbl.currentScope = symbolTbl.scopesProperty.get(ctx);
        super.visitElseStmtDef(ctx);
        symbolTbl.currentScope = symbolTbl.currentScope.parent;
        return defaultResult();
    }

    @Override
    public Integer visitWhileExprDef(HlmpParser.WhileExprDefContext ctx){
        symbolTbl.currentScope = symbolTbl.scopesProperty.get(ctx);
        super.visitWhileExprDef(ctx);
        symbolTbl.currentScope = symbolTbl.currentScope.parent;
        return defaultResult();
    }

    @Override
    public Integer visitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        Integer funcType = ctx.funcHead().type().start.getType();
        if (funcType == HlmpLexer.PWMTYPE)
            funcType = HlmpLexer.NUMTYPE;
        symbolTbl.currentScope = symbolTbl.scopesProperty.get(ctx);
        if (funcType == visit(ctx.body())) {
            symbolTbl.currentScope = symbolTbl.currentScope.parent;
            return defaultResult();
        }
        else {
            throw new TypeException("ReturnType");
        }
    }

    @Override
    public Integer visitBodyReturn(HlmpParser.BodyReturnContext ctx) {
        Integer preType = visit(ctx.returnExpr().get(0));
        for (int i = 1; i < ctx.returnExpr().size(); i++) {
            Integer thisType = visit(ctx.returnExpr().get(i));
            if (thisType == preType) {
                preType = thisType;
            }
            else {
                return 0;
            }
        }
        return preType;
    }

    @Override
    public Integer visitProcDefinition(HlmpParser.ProcDefinitionContext ctx) {
        symbolTbl.currentScope = symbolTbl.scopesProperty.get(ctx);
        super.visitProcDefinition(ctx);
        symbolTbl.currentScope = symbolTbl.currentScope.parent;
        return defaultResult();
    }

    @Override
    public Integer visitStmtAssign(HlmpParser.StmtAssignContext ctx) {
        TypeSymbol symbol = (TypeSymbol) symbolTbl.getSymbol(ctx.id().getText());
        Integer type = symbol.getType().start.getType();
        if (type == HlmpLexer.PWMTYPE)
            type = HlmpLexer.NUMTYPE;
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
        if (type == HlmpLexer.PWMTYPE)
            type = HlmpLexer.NUMTYPE;
        return type;
    }

    @Override
    public Integer visitVarDeclarationAssign(HlmpParser.VarDeclarationAssignContext ctx) {
        Integer type = ctx.type().start.getType();
        if (type == HlmpLexer.PWMTYPE)
            type = HlmpLexer.NUMTYPE;
        if (visit(ctx.expr()) == type) {
            return type;
        }
        else {
            throw new TypeException("VarDeclaration");
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
            throw new TypeException("visitExprBinaryFloat");
    }

    @Override
    public Integer visitExprBinaryBool(HlmpParser.ExprBinaryBoolContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);
        if (left == HlmpLexer.NUMTYPE && right == HlmpLexer.NUMTYPE)
            return HlmpLexer.BOOLTYPE;
        throw new TypeException("visitExprBinaryBool");
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
            throw new TypeException("visitExprBinaryBoolEqual");
    }

    @Override
    public Integer visitExprBinaryLog(HlmpParser.ExprBinaryLogContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);
        if (left != HlmpLexer.BOOLTYPE || right != HlmpLexer.BOOLTYPE)
            throw new TypeException("visitExprBinaryLog");
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
    public Integer visitReadFuncPWM(HlmpParser.ReadFuncPWMContext ctx) {
        return HlmpLexer.NUMTYPE;
    }

    @Override
    public Integer visitReadFuncAnal(HlmpParser.ReadFuncAnalContext ctx) {
        return HlmpLexer.NUMTYPE;
    }

    @Override
    public Integer visitReadFuncDig(HlmpParser.ReadFuncDigContext ctx) {
        return HlmpLexer.BOOLTYPE;
    }

    @Override
    public Integer visitOperandId(HlmpParser.OperandIdContext ctx) {
        TypeSymbol symbol = (TypeSymbol) symbolTbl.getSymbol(ctx.id().getText());
        if (symbol == null) {
            throw new NotDeclared();
        }
        Integer type = symbol.getType().start.getType();
        if (type == HlmpLexer.PWMTYPE)
            type = HlmpLexer.NUMTYPE;
        return type;
    }

    @Override
    public Integer visitValueId(HlmpParser.ValueIdContext ctx) {
        TypeSymbol symbol = (TypeSymbol) symbolTbl.getSymbol(ctx.id().getText());
        if (symbol == null) {
            throw new NotDeclared();
        }
        Integer type = symbol.getType().start.getType();
        if (type == HlmpLexer.PWMTYPE)
            type = HlmpLexer.NUMTYPE;
        return type;
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
        for (HlmpParser.ExprContext i : ctx.expr()) {
            parametersType.add(visit(i));
        }
        String id = ctx.getParent().children.get(0).getText();
        FuncDefSymbol symbol = (FuncDefSymbol) symbolTbl.getSymbol(id);
        if (symbol == null) {
            return defaultResult();
        }
        List<TypeSymbol> parameters = symbol.getParameters();
        if (parametersType.size() != parameters.size()) {
            throw new TypeException("visitArguments1");
        }
        for (int i = 0; i < parameters.size(); i++) {
            int type = parameters.get(i).getType().start.getType();
            if (type == HlmpLexer.PWMTYPE)
                type = HlmpLexer.NUMTYPE;
            if (type != parametersType.get(i)) {
                throw new TypeException("visitArguments2");
            }
        }
        return parametersType.get(0);
    }
}
