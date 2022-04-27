package com.compiler;

import com.compiler.Exceptions.SyntaxException;
import com.compiler.Exceptions.TypeException;
import com.compiler.SymbolTbl.SymbolTbl;
import com.compiler.SymbolTbl.SymbolTblListener;

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
    public Integer visitExprBinaryOp(HlmpParser.ExprBinaryOpContext ctx) {
        int returnType;
        String left = ctx.left.getText();
        String right = ctx.right.getText();
        System.out.println(left + "|" + right);
        switch (ctx.operator().getRuleIndex()) {
            case HlmpLexer.PLUS, HlmpLexer.MINUS, HlmpLexer.DIVIDE, HlmpLexer.MULT, HlmpLexer.MODULU:
                if (!left.chars().allMatch( Character::isDigit ) || !right.chars().allMatch( Character::isDigit ))
                    throw new TypeException();
                else
                    returnType = HlmpLexer.INT;
                break;
            case HlmpLexer.LOGAND, HlmpLexer.LOGOR:
                if (left != "true" || left != "false" || right != "true" || right != "false")
                    throw new TypeException();
                else
                    returnType = HlmpLexer.BOOL;
                break;
            case HlmpLexer.LESSTHAN, HlmpLexer.GREATERTHAN:
                if (!left.chars().allMatch( Character::isDigit ) || !right.chars().allMatch( Character::isDigit ))
                    throw new TypeException();
                else
                    returnType = HlmpLexer.BOOL;
                break;
            case HlmpLexer.EQUAL, HlmpLexer.NOTEQUAL:
                if (left != right)
                    throw new TypeException();
                else
                    returnType = HlmpLexer.BOOL;
                break;
            default:
                throw new SyntaxException("FUCK Den er hel gal");
        }
        return super.visitExprBinaryOp(ctx);
    }

    @Override
    public Integer visitExprOperand(HlmpParser.ExprOperandContext ctx) {

        return super.visitExprOperand(ctx);
    }

    @Override
    public Integer visitExprReadFunc(HlmpParser.ExprReadFuncContext ctx) {
        return super.visitExprReadFunc(ctx);
    }
}
