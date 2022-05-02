package com.compiler;

import com.compiler.Exceptions.NotDeclared;
import com.compiler.Exceptions.TypeException;
import com.compiler.SymbolTbl.SymbolTblListener;
import com.compiler.SymbolTbl.Symbols.FuncDefSymbol;
import com.compiler.SymbolTbl.Symbols.TypeSymbol;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.ArrayList;
import java.util.List;

public class TypeCheckerVisitor extends HlmpBaseVisitor<Integer> {
    SymbolTblListener symbolTbl;

    public TypeCheckerVisitor(SymbolTblListener symbolTbl) {
        this.symbolTbl = symbolTbl;
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

        if (left == HlmpLexer.NUMTYPE || right == HlmpLexer.NUMTYPE)
            return HlmpLexer.BOOL;
        throw new TypeException();
    }

    @Override
    public Integer visitExprBinaryBoolEqual(HlmpParser.ExprBinaryBoolEqualContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);

        if (left == HlmpLexer.NUMTYPE || left == HlmpLexer.BOOL)
            if (right == HlmpLexer.NUMTYPE || right == HlmpLexer.BOOL)
                return HlmpLexer.BOOL;
        throw new TypeException();
    }

    @Override
    public Integer visitExprBinaryLog(HlmpParser.ExprBinaryLogContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);
        if (left != HlmpLexer.NUMTYPE || right != HlmpLexer.NUMTYPE)
            throw new TypeException();
        else
            return HlmpLexer.BOOL;
    }

    @Override
    public Integer visitExprUnaryNeg(HlmpParser.ExprUnaryNegContext ctx) { return HlmpLexer.BOOL;}

    @Override
    public Integer visitOperandSFloat(HlmpParser.OperandSFloatContext ctx) {
        return HlmpLexer.NUMTYPE;
    }

    @Override
    public Integer visitOperandBool(HlmpParser.OperandBoolContext ctx) {
        return HlmpLexer.BOOL;
    }

    @Override
    public Integer visitExprReadFunc(HlmpParser.ExprReadFuncContext ctx) {
        return super.visitExprReadFunc(ctx);
    }

    @Override
    public Integer visitOperandId(HlmpParser.OperandIdContext ctx) {
        TypeSymbol symbol = (TypeSymbol) symbolTbl.symbolTbl.getSymbol(ctx.id().getText());
        if (symbol == null) {
            throw new NotDeclared();
        }
        return symbol.type.start.getType();
    }

    @Override
    public Integer visitFunctionCall(HlmpParser.FunctionCallContext ctx) {
        visit(ctx.args());

        System.out.println();
        FuncDefSymbol symbol = (FuncDefSymbol) symbolTbl.symbolTbl.getSymbol(ctx.id().getText());
        if (symbol == null) {
            throw new NotDeclared();
        }
        return symbol.getType().start.getType();
    }

    @Override
    public Integer visitArguments(HlmpParser.ArgumentsContext ctx) {
        List<Integer> parametersType = new ArrayList<>();
        for (ParseTree i :ctx.expr()) {
            if (i instanceof HlmpParser.ExprContext)
                parametersType.add(visit(i));
        }
        String id = ctx.getParent().children.get(0).getText();
        FuncDefSymbol symbol = (FuncDefSymbol) symbolTbl.symbolTbl.getSymbol(id);
        if (symbol == null) {
            System.out.println("Vi har et probmal");
            return null;
        }
        List<TypeSymbol> parameters = symbol.getParameters();

        for (int i = 0; i < parameters.size(); i++) {
            System.out.println(parameters.get(i).type + "==" + parametersType.get(i));
        }

        return null;
    }
}
