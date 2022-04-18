public class BaseScope implements Scope {
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
