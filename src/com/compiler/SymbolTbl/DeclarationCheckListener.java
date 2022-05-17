package com.compiler.SymbolTbl;

import com.compiler.HlmpBaseListener;
import com.compiler.HlmpParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class DeclarationCheckListener extends HlmpBaseListener {
    public SymbolTbl symbolTbl;

    public DeclarationCheckListener(SymbolTbl symbolTbl) {
        this.symbolTbl = symbolTbl;
        symbolTbl.currentScope = symbolTbl.globalScope;
    }

    private void enterScope(ParseTree ctx) {
        if (symbolTbl.scopesProperty.get(ctx) != null) {
            symbolTbl.currentScope = symbolTbl.scopesProperty.get(ctx);
        }
    }

    private void exitScope() {
        if (symbolTbl.currentScope.parent != null) {
            symbolTbl.currentScope = symbolTbl.currentScope.parent;
        }
    }

    @Override
    public void enterFunctionCall(HlmpParser.FunctionCallContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterWriteFuncDef(HlmpParser.WriteFuncDefContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterReadFuncPWM(HlmpParser.ReadFuncPWMContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterReadFuncAnal(HlmpParser.ReadFuncAnalContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterReadFuncDig(HlmpParser.ReadFuncDigContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterOperandId(HlmpParser.OperandIdContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterStmtAssign(HlmpParser.StmtAssignContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterWhileWait(HlmpParser.WhileWaitContext ctx) {
        String id = ctx.id().getText();
        symbolTbl.checkId(id);
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(id).getUniqueId());
    }

    @Override
    public void enterValueId(HlmpParser.ValueIdContext ctx) {
        enterScope(ctx);
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
    public void enterSetupDefinition(HlmpParser.SetupDefinitionContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void exitSetupDefinition(HlmpParser.SetupDefinitionContext ctx) {
        exitScope();
    }

    @Override
    public void enterLoopDefinition(HlmpParser.LoopDefinitionContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void exitLoopDefinition(HlmpParser.LoopDefinitionContext ctx) {
        exitScope();
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
