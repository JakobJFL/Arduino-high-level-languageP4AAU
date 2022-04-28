package com.compiler;

import com.compiler.Exceptions.NotDeclared;
import com.compiler.Exceptions.SyntaxException;
import com.compiler.Exceptions.TypeException;
import com.compiler.SymbolTbl.SymbolTbl;
import com.compiler.SymbolTbl.SymbolTblListener;
import com.compiler.SymbolTbl.Symbols.Symbol;
import com.compiler.SymbolTbl.Symbols.TypeSymbol;

import javax.print.DocFlavor;

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

        if (left != HlmpLexer.NUMTYPE || right != HlmpLexer.NUMTYPE)
            throw new TypeException();
        else if (left != right)
            throw new TypeException();
        else
            return HlmpLexer.BOOL;
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
    public Integer visitExprOperand(HlmpParser.ExprOperandContext ctx) {

        return super.visitExprOperand(ctx);
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
}
