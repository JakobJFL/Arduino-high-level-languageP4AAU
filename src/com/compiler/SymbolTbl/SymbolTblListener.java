package com.compiler.SymbolTbl;

import com.compiler.HlmpBaseListener;
import com.compiler.HlmpLexer;
import com.compiler.HlmpParser;
import com.compiler.SymbolTbl.Symbols.FuncDefSymbol;
import com.compiler.SymbolTbl.Symbols.Symbol;
import com.compiler.SymbolTbl.Symbols.TypeSymbol;
import com.compiler.TypeCheckerVisitor;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class SymbolTblListener extends HlmpBaseListener {
    public SymbolTbl symbolTbl = new SymbolTbl();
    private int id = 0;

    private String getUniqueId() {
        return "uId"+id++;
    }

    @Override
    public void enterFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        FuncDefSymbol symbol = new FuncDefSymbol(ctx.funcHead().id().getText());
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
        FuncDefSymbol symbol = new FuncDefSymbol(ctx.procHead().id().getText());
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope(ctx.procHead().id().getText(), ctx);
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
        String id = ctx.getParent().children.get(1).getText(); // Get name of function. Will always be number 1 element.
        FuncDefSymbol funcDefSymbol = (FuncDefSymbol) symbolTbl.getSymbol(id);
        funcDefSymbol.addParameter(symbol);
    }

    @Override
    public void enterPinLiteralDef(HlmpParser.PinLiteralDefContext ctx) {
        Symbol symbol = new Symbol(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
    }

    @Override
    public void enterIfStmtDef(HlmpParser.IfStmtDefContext ctx) {
        String thisId = getUniqueId();
        Symbol symbol = new FuncDefSymbol(thisId);
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope(thisId, ctx);
    }

    @Override
    public void exitIfStmtDef(HlmpParser.IfStmtDefContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterElseStmtDef(HlmpParser.ElseStmtDefContext ctx) {
        String thisId = getUniqueId();
        Symbol symbol = new FuncDefSymbol(thisId);
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope(thisId, ctx);
    }

    @Override
    public void exitElseStmtDef(HlmpParser.ElseStmtDefContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterWhileExprDef(HlmpParser.WhileExprDefContext ctx) {
        String thisId = getUniqueId();
        Symbol symbol = new FuncDefSymbol(thisId);
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope(thisId, ctx);
    }

    @Override
    public void exitWhileExprDef(HlmpParser.WhileExprDefContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterValueId(HlmpParser.ValueIdContext ctx) {
        Symbol symbol = new Symbol(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
    }
}
