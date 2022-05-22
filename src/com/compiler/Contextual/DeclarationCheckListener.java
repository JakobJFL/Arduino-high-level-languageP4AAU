package com.compiler.Contextual;

import com.compiler.HlmpBaseListener;
import com.compiler.HlmpParser;

public class DeclarationCheckListener extends HlmpBaseListener {
    public SymbolTbl symbolTbl;

    public DeclarationCheckListener(SymbolTbl symbolTbl) {
        this.symbolTbl = symbolTbl;
        symbolTbl.currentScope = symbolTbl.globalScope;
    }

    @Override
    public void enterFunctionCall(HlmpParser.FunctionCallContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.updateCurrentScope(ctx);
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterWriteFuncDef(HlmpParser.WriteFuncDefContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.updateCurrentScope(ctx);
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterReadFuncPWM(HlmpParser.ReadFuncPWMContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.updateCurrentScope(ctx);
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterReadFuncAnal(HlmpParser.ReadFuncAnalContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.updateCurrentScope(ctx);
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterReadFuncDig(HlmpParser.ReadFuncDigContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.updateCurrentScope(ctx);
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterOperandId(HlmpParser.OperandIdContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.updateCurrentScope(ctx);
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterStmtAssign(HlmpParser.StmtAssignContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.updateCurrentScope(ctx);
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterWhileWait(HlmpParser.WhileWaitContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.updateCurrentScope(ctx);
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }
}
