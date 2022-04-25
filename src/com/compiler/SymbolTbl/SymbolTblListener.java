package com.compiler.SymbolTbl;

import com.compiler.HlmpBaseListener;
import com.compiler.HlmpBaseVisitor;
import com.compiler.HlmpParser;
import com.compiler.SymbolTbl.Symbols.FuncDefSymbol;
import com.compiler.SymbolTbl.Symbols.Symbol;
import com.compiler.SymbolTbl.Symbols.TypeSymbol;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class SymbolTblListener extends HlmpBaseListener {
    public SymbolTbl symbolTbl = new SymbolTbl();

    @Override
    public void enterFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        System.out.println("---------enterFuncDefinition---------");
        symbolTbl.enterScope(ctx.head().id().getText());
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
    public Void visitProgram(HlmpParser.ProgramContext ctx) {
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        return null;
    }

    @Override
    public Void visitCntFuncDef(HlmpParser.CntFuncDefContext ctx) {
        if (ctx.children == null) {
            System.out.println(ctx);
            return null;
        }
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        return null;
    }

    @Override
    public Void visitStandardFunc(HlmpParser.StandardFuncContext ctx) {
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        System.out.println("dsds");

        return null;
    }

    @Override
    public Void visitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        TypeSymbol symbol = new TypeSymbol();
        symbol.setId(ctx.head().id().getText());
        symbol.setType(ctx.head().type());
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope(ctx);
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        symbolTbl.exitScope();
        return null;
    }
    */

/*
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
