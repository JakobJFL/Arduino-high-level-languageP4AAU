package com.compiler.SymbolTbl;

import com.compiler.HlmpBaseListener;
import com.compiler.HlmpLexer;
import com.compiler.HlmpParser;
import com.compiler.SymbolTbl.Symbols.FuncDefSymbol;
import com.compiler.SymbolTbl.Symbols.Symbol;
import com.compiler.SymbolTbl.Symbols.TypeSymbol;

public class SymbolTblListener extends HlmpBaseListener {
    public SymbolTbl symbolTbl = new SymbolTbl();

    private int id = 0;

    private String getUniqueId() {
        return "uId"+id++;
    }

    @Override
    public void enterFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        symbolTbl.enterScope(ctx.funcHead().id().getText());
        FuncDefSymbol symbol = new FuncDefSymbol(ctx.funcHead().id().getText());
        symbol.setType(ctx.funcHead().type());
        symbolTbl.addSymbol(symbol);
    }

    @Override
    public void exitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterProcDefinition(HlmpParser.ProcDefinitionContext ctx) {
        symbolTbl.enterScope(ctx.procHead().id().getText());
        FuncDefSymbol symbol = new FuncDefSymbol(ctx.procHead().id().getText());
        symbolTbl.addSymbol(symbol);
    }

    @Override
    public void exitProcDefinition(HlmpParser.ProcDefinitionContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterVarDeclaration(HlmpParser.VarDeclarationContext ctx) {
        TypeSymbol symbol = new TypeSymbol(ctx.id().getText());
        symbol.setType(ctx.type());
        symbolTbl.addSymbol(symbol);
    }

    @Override
    public void enterParam(HlmpParser.ParamContext ctx) {
        TypeSymbol symbol = new TypeSymbol(ctx.id().getText());
        symbol.setType(ctx.type());
        String id = ctx.getParent().children.get(1).getText();
        FuncDefSymbol funcDefSymbol = (FuncDefSymbol) symbolTbl.getSymbol(id);

        funcDefSymbol.addParameter(symbol);
    }

    @Override
    public void enterOperandId(HlmpParser.OperandIdContext ctx) {
        symbolTbl.checkId(ctx.id().getText());
    }

    @Override
    public void enterPinLiteralDef(HlmpParser.PinLiteralDefContext ctx) {
        Symbol symbol = new Symbol(ctx.id().getText());
        //symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
    }

    @Override
    public void enterStmtAssign(HlmpParser.StmtAssignContext ctx) {
        symbolTbl.checkId(ctx.id().getText());
    }




    @Override
    public void enterIfStmtDef(HlmpParser.IfStmtDefContext ctx) {
        String thisId = getUniqueId();
        symbolTbl.enterScope(thisId);
        Symbol symbol = new FuncDefSymbol(thisId);
        symbolTbl.addSymbol(symbol);
    }

    @Override
    public void exitIfStmtDef(HlmpParser.IfStmtDefContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterElseStmtDef(HlmpParser.ElseStmtDefContext ctx) {
        String thisId = getUniqueId();
        symbolTbl.enterScope(thisId);
        Symbol symbol = new FuncDefSymbol(thisId);
        symbolTbl.addSymbol(symbol);
    }

    @Override
    public void exitElseStmtDef(HlmpParser.ElseStmtDefContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterWhileExprDef(HlmpParser.WhileExprDefContext ctx) {
        String thisId = getUniqueId();
        symbolTbl.enterScope(thisId);
        Symbol symbol = new FuncDefSymbol(thisId);
        symbolTbl.addSymbol(symbol);
    }

    @Override
    public void exitWhileExprDef(HlmpParser.WhileExprDefContext ctx) {
        symbolTbl.exitScope();
    }



    @Override
    public void enterFunctionCall(HlmpParser.FunctionCallContext ctx) {
        //symbolTbl.checkId(ctx.id().getText());
    }

    @Override
    public void enterWriteFuncDef(HlmpParser.WriteFuncDefContext ctx) {
        symbolTbl.checkId(ctx.id().getText());
    }

    @Override
    public void enterReadFuncPWM(HlmpParser.ReadFuncPWMContext ctx) {
        symbolTbl.checkId(ctx.id().getText());
    }

    @Override
    public void enterReadFuncAnal(HlmpParser.ReadFuncAnalContext ctx) {
        symbolTbl.checkId(ctx.id().getText());
    }

    @Override
    public void enterReadFuncDig(HlmpParser.ReadFuncDigContext ctx) {
        symbolTbl.checkId(ctx.id().getText());
    }

    @Override
    public void enterValueId(HlmpParser.ValueIdContext ctx) {
        Symbol symbol = new Symbol(ctx.id().getText());
        //symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
    }
}
