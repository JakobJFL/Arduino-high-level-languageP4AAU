import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class SymbolTbl {
    public Scope globalScope = new Scope(null, null);
    public Scope currentScope = globalScope;
    public enum Types {
        NUM,
        BOOL,
        PWM,
        PIN
    }

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
        globalScope.addSubScope(currentScope);
    }

    public void addSymbol(Symbol symbol) {
        if (!currentScope.addSymbol(symbol))
            System.out.println("The symbol is already in dictionary!!!!!");
    }

    public void printAll() {
        for (Scope scope: globalScope.subScopes) {
            currentScope = scope;
            System.out.println("New scope");

            List<String> test = new ArrayList<>();
            test.add("var1");
            test.add("var11");
            test.add("var2");
            test.add("var3");

            for (String key : test) {
                if (getSymbol(key) == null)
                    System.out.println("null");
                else
                    System.out.println(getSymbol(key).getId());
            }
        }
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
                return getSymbolHelper(id, scope.parent);
            }
        }
        return null; //If no parents are left, return null
    }

    public void exitScope() {
        currentScope = currentScope.parent;
    }

    public Types convertToTypes(HlmpParser.ATypeContext ctx) {
        System.out.println(ctx.TYPE().getSymbol());
        System.out.println(ctx.TYPE().getSymbol().getType());

        return null;
    }
}
