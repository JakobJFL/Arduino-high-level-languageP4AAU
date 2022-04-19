import org.antlr.v4.runtime.tree.ParseTree;

public class SymbolTbl {
    public Scope globalScope; //--skal vel defineres
    public Scope currentScope = globalScope;
//--Add method to reset symbol table, when we shift between visitors

    public void enterScope(ParseTree node) {
        for (Scope s: currentScope.getSubScopes()) {
            if (node == s.associatedNode) {
                currentScope = s;
                return;
            }
        }
        //No match in loop, so we need to add a new scope
        Scope scope = new Scope(currentScope, node);
        currentScope.addSubScope(scope);
        currentScope = scope;
    }

    public void addSymbol(Symbol symbol){
        if (!currentScope.addSymbol(symbol))
            System.out.println("The symbol is already in dictionary!!!!!");
    }

    public Symbol getSymbol(String id) {
        return getSymbolHelper(id, currentScope);
    }

    public Symbol getSymbolHelper(String id, Scope scope) {
        if (scope.containsId(id)) {
            return scope.getSymbol(id);
        }
        else {
            if (scope.parent != null) {
                getSymbolHelper(id, scope.parent);
            }
        }
        return null; //If no parents are left, return null
    }

    public void exitScope() {
        currentScope = currentScope.parent;
    }
}
