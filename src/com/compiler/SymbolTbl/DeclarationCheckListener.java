package com.compiler.SymbolTbl;

import com.compiler.HlmpBaseListener;
import com.compiler.HlmpParser;
import org.antlr.v4.runtime.tree.ParseTree;
s
public class DeclarationCheckListener extends HlmpBaseListener {
    public SymbolTbl symbolTbl;

    public DeclarationCheckListener(SymbolTbl symbolTbl) {
        this.symbolTbl = symbolTbl;
        symbolTbl.currentScope = symbolTbl.globalScope;
    }

    private void enterScope(ParseTree ctx) {
        symbolTbl.currentScope = symbolTbl.scopesProperty.get(ctx);
    }

    private void exitScope() {
        symbolTbl.currentScope = symbolTbl.currentScope.parent;
    }

    @Override
    public void enterFunctionCall(HlmpParser.FunctionCallContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
        symbolTbl.checkId(id);
    }

    @Override
    public void enterWriteFuncDef(HlmpParser.WriteFuncDefContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
        symbolTbl.checkId(id);
    }

    @Override
    public void enterReadFuncPWM(HlmpParser.ReadFuncPWMContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
        symbolTbl.checkId(id);
    }

    @Override
    public void enterReadFuncAnal(HlmpParser.ReadFuncAnalContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
        symbolTbl.checkId(id);
    }

    @Override
    public void enterReadFuncDig(HlmpParser.ReadFuncDigContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
        symbolTbl.checkId(id);
    }

    @Override
    public void enterOperandId(HlmpParser.OperandIdContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
        symbolTbl.checkId(id);
    }

    @Override
    public void enterStmtAssign(HlmpParser.StmtAssignContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
        symbolTbl.checkId(id);
    }


    @Override
    public void enterIfStmtDef(HlmpParser.IfStmtDefContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void exitIfStmtDef(HlmpParser.IfStmtDefContext ctx) {
        exitScope();
    }

    @Override
    public void enterElseStmtDef(HlmpParser.ElseStmtDefContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void exitElseStmtDef(HlmpParser.ElseStmtDefContext ctx) {
        exitScope();
    }

    @Override
    public void enterWhileExprDef(HlmpParser.WhileExprDefContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void exitWhileExprDef(HlmpParser.WhileExprDefContext ctx) {
        exitScope();
    }

    @Override
    public void enterValueId(HlmpParser.ValueIdContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void enterFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void exitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        exitScope();
    }

    @Override
    public void enterProcDefinition(HlmpParser.ProcDefinitionContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void exitProcDefinition(HlmpParser.ProcDefinitionContext ctx) {
        exitScope();
    }
}
