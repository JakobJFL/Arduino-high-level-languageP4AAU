package com.compiler.Contextual;

import com.compiler.HlmpBaseListener;
import com.compiler.HlmpParser;
import com.compiler.Contextual.Symbols.FuncDefSymbol;
import com.compiler.Contextual.Symbols.Symbol;
import com.compiler.Contextual.Symbols.TypeSymbol;

public class SymbolTblListener extends HlmpBaseListener {
    public SymbolTbl symbolTbl = new SymbolTbl();
    private int id = 0;
    private int uniqueId = 0;

    private String makeUniqueId() {
        return "uid"+uniqueId++;
    }

    private String makeId() {
        return "id"+id++;
    }

    @Override
    public void enterFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        FuncDefSymbol symbol = new FuncDefSymbol(ctx.funcHead().id().getText(), makeUniqueId());
        symbol.setType(ctx.funcHead().type());
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope(ctx.funcHead().id().getText(), ctx);
    }

    @Override
    public void exitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterProcDefinition(HlmpParser.ProcDefinitionContext ctx) {
        FuncDefSymbol symbol = new FuncDefSymbol(ctx.procHead().id().getText(), makeUniqueId());
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope(ctx.procHead().id().getText(), ctx);
    }

    @Override
    public void exitProcDefinition(HlmpParser.ProcDefinitionContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterFuncHead(HlmpParser.FuncHeadContext ctx) {
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(ctx.id().getText()).getUniqueId());
    }

    @Override
    public void enterProcHead(HlmpParser.ProcHeadContext ctx) {
        symbolTbl.idProperty.put(ctx, symbolTbl.getSymbol(ctx.id().getText()).getUniqueId());
    }

    @Override
    public void enterVarDeclaration(HlmpParser.VarDeclarationContext ctx) {
        TypeSymbol symbol = new TypeSymbol(ctx.id().getText(), makeUniqueId());
        symbol.setType(ctx.type());
        symbolTbl.addSymbol(symbol);
        symbolTbl.idProperty.put(ctx, symbol.getUniqueId());
    }

    @Override
    public void enterVarDeclarationAssign(HlmpParser.VarDeclarationAssignContext ctx) {
        TypeSymbol symbol = new TypeSymbol(ctx.id().getText(), makeUniqueId());
        symbol.setType(ctx.type());
        symbolTbl.addSymbol(symbol);
        symbolTbl.idProperty.put(ctx, symbol.getUniqueId());
    }

    @Override
    public void enterParam(HlmpParser.ParamContext ctx) {
        TypeSymbol symbol = new TypeSymbol(ctx.id().getText(), makeUniqueId());
        symbol.setType(ctx.type());
        if ((ctx.getParent().children.get(0).getText()).equals("func ")) {
            String id = ctx.getParent().children.get(2).getText(); // Get name of function. Will always be number 2 element functions.
            FuncDefSymbol funcDefSymbol = (FuncDefSymbol) symbolTbl.getSymbol(id);
            funcDefSymbol.addParameter(symbol);
            symbolTbl.addSymbol(symbol);
        }
        else {
            String id = ctx.getParent().children.get(1).getText(); // Get name of procedure. Will always be number 1 element for procedures.
            FuncDefSymbol funcDefSymbol = (FuncDefSymbol) symbolTbl.getSymbol(id);
            funcDefSymbol.addParameter(symbol);
            symbolTbl.addSymbol(symbol);
        }
    }

    @Override
    public void enterPinLiteralDef(HlmpParser.PinLiteralDefContext ctx) {
        Symbol symbol = new Symbol(ctx.id().getText(), makeUniqueId());
        symbolTbl.idProperty.put(ctx, symbol.getUniqueId());
        symbolTbl.addSymbol(symbol);
    }

    @Override
    public void enterIfStmtDef(HlmpParser.IfStmtDefContext ctx) {
        String thisId = makeId();
        Symbol symbol = new FuncDefSymbol(thisId, makeUniqueId());
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope(thisId, ctx);
    }

    @Override
    public void exitIfStmtDef(HlmpParser.IfStmtDefContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterElseStmtDef(HlmpParser.ElseStmtDefContext ctx) {
        String thisId = makeId();
        Symbol symbol = new FuncDefSymbol(thisId, makeUniqueId());
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope(thisId, ctx);
    }

    @Override
    public void exitElseStmtDef(HlmpParser.ElseStmtDefContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterWhileExprDef(HlmpParser.WhileExprDefContext ctx) {
        String thisId = makeId();
        Symbol symbol = new FuncDefSymbol(makeUniqueId(), makeUniqueId());
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope(thisId, ctx);
    }

    @Override
    public void exitWhileExprDef(HlmpParser.WhileExprDefContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterSetupDefinition(HlmpParser.SetupDefinitionContext ctx) {
        FuncDefSymbol symbol = new FuncDefSymbol("setup", makeUniqueId());
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope("setup", ctx);
    }

    @Override
    public void exitSetupDefinition(HlmpParser.SetupDefinitionContext ctx) {symbolTbl.exitScope();}

    @Override
    public void enterLoopDefinition(HlmpParser.LoopDefinitionContext ctx) {
        FuncDefSymbol symbol = new FuncDefSymbol("loop", makeUniqueId());
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope("loop", ctx);
    }

    @Override
    public void exitLoopDefinition(HlmpParser.LoopDefinitionContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterFunctionCall(HlmpParser.FunctionCallContext ctx) {
        symbolTbl.scopesProperty.put(ctx, symbolTbl.currentScope);
    }

    @Override
    public void enterWriteFuncDef(HlmpParser.WriteFuncDefContext ctx) {
        symbolTbl.scopesProperty.put(ctx, symbolTbl.currentScope);
    }

    @Override
    public void enterReadFuncPWM(HlmpParser.ReadFuncPWMContext ctx) {
        symbolTbl.scopesProperty.put(ctx, symbolTbl.currentScope);
    }

    @Override
    public void enterReadFuncAnal(HlmpParser.ReadFuncAnalContext ctx) {
        symbolTbl.scopesProperty.put(ctx, symbolTbl.currentScope);
    }

    @Override
    public void enterReadFuncDig(HlmpParser.ReadFuncDigContext ctx) {
        symbolTbl.scopesProperty.put(ctx, symbolTbl.currentScope);
    }

    @Override
    public void enterOperandId(HlmpParser.OperandIdContext ctx) {
        symbolTbl.scopesProperty.put(ctx, symbolTbl.currentScope);
    }

    @Override
    public void enterStmtAssign(HlmpParser.StmtAssignContext ctx) {
        symbolTbl.scopesProperty.put(ctx, symbolTbl.currentScope);

    }

    @Override
    public void enterWhileWait(HlmpParser.WhileWaitContext ctx) {
        symbolTbl.scopesProperty.put(ctx, symbolTbl.currentScope);
    }
}
