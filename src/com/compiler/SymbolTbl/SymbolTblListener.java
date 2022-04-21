package com.compiler.SymbolTbl;

import com.compiler.HlmpBaseListener;
import com.compiler.HlmpParser;
import com.compiler.SymbolTbl.Symbols.FuncDefSymbol;
import com.compiler.SymbolTbl.Symbols.Symbol;

public class SymbolTblListener extends HlmpBaseListener {
    public SymbolTbl symbolTbl = new SymbolTbl();

/*
    public Boolean isFloat(String s) {
        if (Float.parseFloat(s) == true)
            return true;
        else return false;
    }

    public Boolean isFloat(String s) {
        if (Float.parseFloat(s) == true)
            return true;
        else return false;
    }
    */

    @Override
    public void enterFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        symbolTbl.enterScope(ctx);
        FuncDefSymbol symbol = new FuncDefSymbol();
        symbol.setId(ctx.head().id().getText());
        symbol.setType(ctx.head().type());
        symbolTbl.addSymbol(symbol);
    }
    @Override
    public void exitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterVarDeclaration(HlmpParser.VarDeclarationContext ctx) {
        FuncDefSymbol symbol = new FuncDefSymbol();
        symbol.setId(ctx.id().getText());
        symbol.setType(ctx.type());
        symbolTbl.addSymbol(symbol);
    }

/*
    @Override
    public Void visitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        SymbolTbl.SymbolTbl.Symbol symbol = new SymbolTbl.SymbolTbl.Symbols.FuncSymbol();
        symbol.setId(ctx.head().id().getText());
        symbol.setType(SymbolTbl.SymbolTbl.Types.BOOL);
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope(ctx);
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        symbolTbl.exitScope();
        return null;
    }

    @Override
    public Void visitParam(HlmpParser.ParamContext ctx) {
        SymbolTbl.SymbolTbl.Symbol symbol = new ParamIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitOperandId(HlmpParser.OperandIdContext ctx) {
        SymbolTbl.SymbolTbl.Symbol symbol = new OperandIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitPinLiteralDef(HlmpParser.PinLiteralDefContext ctx) {
        SymbolTbl.SymbolTbl.Symbol symbol = new PinLiteralIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitAssignExpr(HlmpParser.AssignExprContext ctx) {
        SymbolTbl.SymbolTbl.Symbol symbol = new AssignIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitFCall(HlmpParser.FCallContext ctx) {
        SymbolTbl.SymbolTbl.Symbol symbol = new FCallIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitWriteFuncDef(HlmpParser.WriteFuncDefContext ctx) {
        SymbolTbl.SymbolTbl.Symbol symbol = new WriteFuncDefIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitValue(HlmpParser.ValueContext ctx) {
        SymbolTbl.SymbolTbl.Symbol symbol = new ValueIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitReadFuncPWM(HlmpParser.ReadFuncPWMContext ctx) {
        SymbolTbl.SymbolTbl.Symbol symbol = new ReadFuncPWMIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitReadFuncAnal(HlmpParser.ReadFuncAnalContext ctx) {
        SymbolTbl.SymbolTbl.Symbol symbol = new ReadFuncAnalIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitReadFuncDig(HlmpParser.ReadFuncDigContext ctx) {
        SymbolTbl.SymbolTbl.Symbol symbol = new ReadFuncDig();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }
    */

}
