package com.compiler.SymbolTbl;

import com.compiler.SymbolTbl.Symbols.Symbol;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.ArrayList;
import java.util.List;

public class SymbolTbl {
    public Scope globalScope = new Scope(null, null);
    public Scope currentScope = globalScope;

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

    public Symbol getSymbol(String id) {
        return getSymbolHelper(id, currentScope);
    }

    private Symbol getSymbolHelper(String id, Scope scope) {
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

}
