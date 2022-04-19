import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class SymbolTblVisitor extends HlmpBaseVisitor<Void> {
    SymbolTbl symbolTbl = new SymbolTbl();

    @Override
    public Void visitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        Symbol symbol = new VarIdSymbol();
        symbol.setId(ctx.head().id().getText());
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope(ctx);
        for (ParseTree c : ctx.children) {
            c.accept(this);
        }
        symbolTbl.exitScope();
        return null;
    }


    public void visitVarDecl(HlmpParser.FuncDefinitionContext ctx) {
        symbolTbl.addSymbol(ctx.head().id());
    }


    @Override
    public void exitFuncDefinition(HlmpParser.FuncDefinitionContext ctx) {
        closeScope();
    }

    private void defineFunctionDefinitionSymbol(HlmpParser.HeadContext HeadCtx) {
        // Gets lists of parameters and converts them into a list of types
        ArrayList<Integer> argumentList = getFuncDefParamTypes(HeadCtx);
        FuncdefSymbol symbol = new FuncdefSymbol(HeadCtx.id().getText(), HeadCtx.type().start.getType(), argumentList);
        currentScope.defineSymbol(symbol);

    }

    @Override
    public void exitParams(HlmpParser.ParamsContext  ctx) {
        List<HlmpParser.ParameterContext> params = ctx.parameter();
        for (HlmpParser.ParameterContext param : params)
            defineParamSymbol(param);
    }

    public void defineParamSymbol(TypeAndIdContext ctx) {
        Integer paramType = ctx.type().start.getType();
        Symbol paramSymbol = new Symbol(ctx.ID().getText(), paramType);
        try {
            currentScope.defineSymbol(paramSymbol);
        } catch (Exception e) {
            errorListener.ThrowError(e.getMessage(), ctx.ID().getSymbol());
        }

        attachScope(ctx, currentScope);
    }

    private void closeScope() {
        currentScope = currentScope.getEnclosingScope();
    }

    private ArrayList<Integer> getFuncDefParamTypes(HlmpParser.HeadContext ctx) {
        ArrayList<Integer> argumentList = new ArrayList<>();
        if (ctx != null) {
            for (HlmpParser.ParameterContext param: ctx.parameter()) {
                argumentList.add(param.getStart().getType());
            };
        }
        return argumentList;
    }

    private void makeAndAttachNewScope(ParserRuleContext ctx) {
        Scope newScope = new BaseScope(currentScope);
        attachScope(ctx, newScope);
        currentScope = newScope;
    }

    private void attachScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }
}
