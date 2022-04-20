public class SymbolTblListener extends HlmpBaseListener {
    SymbolTbl symbolTbl = new SymbolTbl();

    @Override
    public void enterFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        symbolTbl.enterScope(ctx);
        Symbol symbol = new FuncSymbol();
        symbol.setId(ctx.head().id().getText());
        symbol.setType(SymbolTbl.Types.BOOL);
        symbolTbl.addSymbol(symbol);
    }
    @Override
    public void exitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        symbolTbl.exitScope();
    }

    @Override
    public void enterVarDeclaration(HlmpParser.VarDeclarationContext ctx) {
        Symbol symbol = new VarSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
    }

/*
    @Override
    public Void visitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        Symbol symbol = new FuncSymbol();
        symbol.setId(ctx.head().id().getText());
        symbol.setType(SymbolTbl.Types.BOOL);
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
        Symbol symbol = new ParamIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitOperandId(HlmpParser.OperandIdContext ctx) {
        Symbol symbol = new OperandIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitPinLiteralDef(HlmpParser.PinLiteralDefContext ctx) {
        Symbol symbol = new PinLiteralIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitAssignExpr(HlmpParser.AssignExprContext ctx) {
        Symbol symbol = new AssignIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitFCall(HlmpParser.FCallContext ctx) {
        Symbol symbol = new FCallIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitWriteFuncDef(HlmpParser.WriteFuncDefContext ctx) {
        Symbol symbol = new WriteFuncDefIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitValue(HlmpParser.ValueContext ctx) {
        Symbol symbol = new ValueIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitReadFuncPWM(HlmpParser.ReadFuncPWMContext ctx) {
        Symbol symbol = new ReadFuncPWMIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitReadFuncAnal(HlmpParser.ReadFuncAnalContext ctx) {
        Symbol symbol = new ReadFuncAnalIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }

    @Override
    public Void visitReadFuncDig(HlmpParser.ReadFuncDigContext ctx) {
        Symbol symbol = new ReadFuncDig();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }
    */

}
