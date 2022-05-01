package com.compiler.SymbolTbl;

import com.compiler.Exceptions.AlreadyDeclared;
import com.compiler.Exceptions.NotDeclared;
import com.compiler.SymbolTbl.Symbols.Symbol;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class SymbolTbl {
    public Scope globalScope = new Scope(null, null);
    public Scope currentScope = globalScope;
    private String exitId;

    public void enterScope(String id) {
        System.out.println("------"+id+"------");

        for (Scope s: currentScope.getSubScopes()) {
            System.out.println("if:"+s.id + "==" + exitId);
            if (s.id == exitId) {
                currentScope = s;
                System.out.println("reuse Scope");
                return;
            }
        }
        System.out.println("new Scope");
        //No match in loop, so we need to add a new scope
        Scope scope = new Scope(currentScope, id);
        currentScope.addSubScope(scope);
        currentScope = scope;
    }

    public void exitScope() { 
        currentScope = currentScope.parent;
        exitId = currentScope.id;
    }

    public void addSymbol(Symbol symbol) {
        if (!isSymbol(symbol.getId(), currentScope)) {
            currentScope.addThisSymbol(symbol);
        }
        else {
            throw new AlreadyDeclared();
        }
    }

    public void checkId(String id)   {
        if (!isSymbol(id, currentScope)) {
            throw new NotDeclared();
        }
    }

    private boolean isSymbol(String id, Scope scope) {
        if (scope.containsId(id)) {
            return true;
        }
        else {
            if (scope.parent != null) {
                return isSymbol(id, scope.parent);
            }
            else {
                return false;
            }
        }
    }

    public Symbol getSymbol(String id) {
        return getSymbolHelper(id, currentScope);
    }

    private Symbol getSymbolHelper(String id, Scope scope) {
        if (scope.containsId(id)) {
            return scope.getThisSymbol(id);
        }
        else {
            if (scope.parent != null) {
                return getSymbolHelper(id, scope.parent);
            }
        }
        return null; //If no parents are left, return null
    }
}
