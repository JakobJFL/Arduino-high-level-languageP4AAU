package com.compiler.Contextual;

import com.compiler.Exceptions.NotDeclared;
import com.compiler.Exceptions.TypeException;
import com.compiler.Contextual.Symbols.FuncDefSymbol;
import com.compiler.Contextual.Symbols.TypeSymbol;
import com.compiler.HlmpBaseVisitor;
import com.compiler.HlmpLexer;
import com.compiler.HlmpParser;

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
        symbolTbl.updateCurrentScope(ctx);
        super.visitIfStmtDef(ctx);
        symbolTbl.updateCurrentScope(ctx);
        return defaultResult();
    }

    @Override
    public Integer visitElseStmtDef(HlmpParser.ElseStmtDefContext ctx) {
        symbolTbl.updateCurrentScope(ctx);
        super.visitElseStmtDef(ctx);
        symbolTbl.updateCurrentScope(ctx);
        return defaultResult();
    }

    @Override
    public Integer visitWhileExprDef(HlmpParser.WhileExprDefContext ctx){
        symbolTbl.updateCurrentScope(ctx);
        super.visitWhileExprDef(ctx);
        symbolTbl.updateCurrentScope(ctx);
        return defaultResult();
    }

    @Override
    public Integer visitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        Integer funcType = ctx.funcHead().type().start.getType();
        funcType = ifPwmConvertToNum(funcType);
        symbolTbl.updateCurrentScope(ctx);
        if (funcType == visit(ctx.body())) {
            symbolTbl.updateCurrentScope(ctx);
            return defaultResult();
        }
        else {
            throw new TypeException("Expected return type \"" + ctx.funcHead().type().getText() + "\" for \"" + ctx.funcHead().id().getText() + "\"");
        }
    }

    @Override
    public Integer visitBodyReturn(HlmpParser.BodyReturnContext ctx) {
        Integer preType = visit(ctx.returnExpr().get(0));
        for (int i = 1; i < ctx.returnExpr().size(); i++) {
            Integer thisType = visit(ctx.returnExpr().get(i));
            if (!thisType.equals(preType)) {
                return 0;
            }
        }
        preType = ifPwmConvertToNum(preType);
        return preType;
    }

    @Override
    public Integer visitProcDefinition(HlmpParser.ProcDefinitionContext ctx) {
        symbolTbl.updateCurrentScope(ctx);
        super.visitProcDefinition(ctx);
        symbolTbl.updateCurrentScope(ctx);
        return defaultResult();
    }

    @Override
    public Integer visitStmtAssign(HlmpParser.StmtAssignContext ctx) {
        TypeSymbol symbol = (TypeSymbol) symbolTbl.getSymbol(ctx.id().getText());
        Integer type = symbol.getType().start.getType();
        type = ifPwmConvertToNum(type);
        Integer expr = visit(ctx.expr());
        if (expr == type) {
            return type;
        }
        else {
            throw new TypeException("Assignment -\"" + ctx.id().getText() + "\" is not of expected type:" +symbol.getType().getText());
        }
    }

    @Override
    public Integer visitVarDeclaration(HlmpParser.VarDeclarationContext ctx) {
        Integer type = ctx.type().start.getType();
        type = ifPwmConvertToNum(type);
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
            throw new TypeException("In variable declaration assignment - \""+ ctx.expr().getText() + "\" is not of type " + ctx.type().getText());
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
            throw new TypeException("Expected the type: Num");
    }

    @Override
    public Integer visitExprBinaryBool(HlmpParser.ExprBinaryBoolContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);
        if (left == HlmpLexer.NUMTYPE && right == HlmpLexer.NUMTYPE)
            return HlmpLexer.BOOLTYPE;
        throw new TypeException("Expected the type: Num");
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
            throw new TypeException("Expected the operands type to be Num or Bool");
    }

    @Override
    public Integer visitExprBinaryLog(HlmpParser.ExprBinaryLogContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);
        if (left != HlmpLexer.BOOLTYPE || right != HlmpLexer.BOOLTYPE)
            throw new TypeException("Expected the operands type to be Num");
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
            throw new NotDeclared("The identifier could not be found");
        }
        Integer type = symbol.getType().start.getType();
        type = ifPwmConvertToNum(type);
        return type;
    }

    @Override
    public Integer visitValueId(HlmpParser.ValueIdContext ctx) {
        TypeSymbol symbol = (TypeSymbol) symbolTbl.getSymbol(ctx.id().getText());
        if (symbol == null) {
            throw new NotDeclared("The value identifier could not be found");
        }
        Integer type = symbol.getType().start.getType();

        return type;
    }

    @Override
    public Integer visitFunctionCall(HlmpParser.FunctionCallContext ctx) {
        if (ctx.id().getText().equals("whileWait")){
            if (ctx.args().children.size() == 3) { // size should be 3 because ',' is included
                return HlmpLexer.BOOLTYPE;
            }
        }
        if (ctx.args().children != null) {
            visit(ctx.args());
        }
        FuncDefSymbol symbol = (FuncDefSymbol) symbolTbl.getSymbol(ctx.id().getText());
        if (symbol == null) {
            throw new NotDeclared(ctx.id().getText());
        }
        else if (symbol.getType() == null) {
            return null;
        }
        else {
            Integer type = symbol.getType().start.getType();
            type = ifPwmConvertToNum(type);
            return type;
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
            throw new NotDeclared("A function or procedure match could not be found for call");
        }
        List<TypeSymbol> parameters = symbol.getParameters();
        if (parametersType.size() != parameters.size()) {
            throw new TypeException("The amount of formal parameters supplied does not match the actual parameters");
        }
        for (int i = 0; i < parameters.size(); i++) {
            int type = parameters.get(i).getType().start.getType();
            type = ifPwmConvertToNum(type);
            if (type != parametersType.get(i)) {
                throw new TypeException("Expected parameter type: \"" + parameters.get(i).getType().getText()+"\"");
            }
        }
        return parametersType.get(0);
    }

    private Integer ifPwmConvertToNum(Integer type) {
        if (type == HlmpLexer.PWMTYPE)
            return HlmpLexer.NUMTYPE;
        return type;
    }

}
