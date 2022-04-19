import org.antlr.v4.runtime.tree.ParseTree;

public class  SymbolTblVisitor extends HlmpBaseVisitor<Void> {
    SymbolTbl symbolTbl = new SymbolTbl();

    @Override
    public Void visitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        Symbol symbol = new FuncIdSymbol();
        symbol.setId(ctx.head().id().getText());
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope(ctx);
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        symbolTbl.exitScope();
        return null;
    }

    @Override
    public Void visitVarDeclaration(HlmpParser.VarDeclarationContext ctx) {
        Symbol symbol = new VarIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.addSymbol(symbol);
        return null;
    }




    @Override
    public Void visitParam(HlmpParser.ParamContext ctx) {
        Symbol symbol = new ParamIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.enterScope(ctx);
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        symbolTbl.exitScope();
        return null;
    }

    @Override
    public Void visitOperandId(HlmpParser.OperandIdContext ctx) {
        Symbol symbol = new OperandIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.enterScope(ctx);
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        symbolTbl.exitScope();
        return null;
    }

    @Override
    public Void visitPinLiteralDef(HlmpParser.PinLiteralDefContext ctx) {
        Symbol symbol = new PinLiteralIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.enterScope(ctx);
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        symbolTbl.exitScope();
        return null;
    }

    @Override
    public Void visitAssignExpr(HlmpParser.AssignExprContext ctx) {
        Symbol symbol = new AssignIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.enterScope(ctx);
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        symbolTbl.exitScope();
        return null;
    }

    @Override
    public Void visitFCall(HlmpParser.FCallContext ctx) {
        Symbol symbol = new FCallIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.enterScope(ctx);
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        symbolTbl.exitScope();
        return null;
    }

    @Override
    public Void visitWriteFuncDef(HlmpParser.WriteFuncDefContext ctx) {
        Symbol symbol = new WriteFuncDefIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.enterScope(ctx);
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        symbolTbl.exitScope();
        return null;
    }

    @Override
    public Void visitValue(HlmpParser.ValueContext ctx) {
        Symbol symbol = new ValueIdSymbol();
        symbol.setId(ctx.id().getText());
        symbolTbl.enterScope(ctx);
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        symbolTbl.exitScope();
        return null;
    }

}
