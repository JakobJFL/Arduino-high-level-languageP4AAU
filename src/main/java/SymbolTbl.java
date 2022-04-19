import org.antlr.v4.runtime.tree.ParseTree;

public class SymbolTbl {
    public Scope globalScope; //skal vel defineres
    public Scope currentScope = globalScope;
//Add method to reset symbol table, when we shift between visitors

    public void enterScope(ParseTree node) {
        for (Scope s: currentScope.subScopes) {
            if (node == s.associatedNode) {
                currentScope = s;
                return;
            }
        }
        Scope scope = new Scope(currentScope, node);
        currentScope.subScopes.add(scope); //No match in loop, so we need to add a new scope
        currentScope = scope;
    }

    public void addSymbol(Symbol symbol){
        currentScope.addSymbol(symbol);
    }

    public Symbol getSymbol(String id) { //overvej dictionary
        for (String : currentScope.symbolList) {

        }
        currentScope.parent.symbolList;
    }

    public Symbol res(Scope scope) { //If no parents are left, throw error or return null
        for (Symbol s: scope.parent.symbolList) {
            if ()
                return s;
        }
        if (scope.parent != null)
            res(scope.parent);
        else return null;
    }

    public void exitScope() { //nice
        currentScope = currentScope.parent;
    }
}
