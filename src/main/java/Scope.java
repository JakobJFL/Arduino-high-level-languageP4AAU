public interface Scope {
    Scope getEnclosingScope();

    void setEnclosingScope(Scope scope);

    void defineSymbol(Symbol symbol);

    Symbol getSymbol(String name);
}
