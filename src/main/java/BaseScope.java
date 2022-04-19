public class BaseScope implements Scope {

    //For the global scope
    public BaseScope() {
    }

    public BaseScope(Scope enclosingScope) {
        setEnclosingScope(enclosingScope);
    }

    @Override
    public Scope getEnclosingScope() {
        return null;
    }

    @Override
    public void setEnclosingScope(Scope scope) {

    }

    @Override
    public void defineSymbol(Symbol symbol) {

    }

    @Override
    public Symbol getSymbol(String name) {
        return null;
    }
}
