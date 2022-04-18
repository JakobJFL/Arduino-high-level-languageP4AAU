import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class SymbolTblListener extends HlmpBaseListener {
    public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    public BaseScope globalScope = new BaseScope();
    Scope currentScope;

    public void enterProgram(HlmpParser.ProgramContext ctx) {
        currentScope = globalScope;
    }
}
