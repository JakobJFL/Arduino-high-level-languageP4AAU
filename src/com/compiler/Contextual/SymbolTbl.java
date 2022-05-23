package com.compiler.Contextual;

import com.compiler.Exceptions.AlreadyDeclared;
import com.compiler.Exceptions.NotDeclared;
import com.compiler.Contextual.Symbols.FuncDefSymbol;
import com.compiler.Contextual.Symbols.Symbol;
import com.compiler.Contextual.Symbols.TypeSymbol;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

public class SymbolTbl {
    public Scope globalScope = new Scope(null, null);
    public Scope currentScope = globalScope;

    public ParseTreeProperty<Scope> scopesProperty = new ParseTreeProperty<Scope>();
    public ParseTreeProperty<String> idProperty = new ParseTreeProperty<>();

    public SymbolTbl() {
        FuncDefSymbol symbol = new FuncDefSymbol("whileWait", "default1");
        globalScope.addThisSymbol(symbol);
    }

    public void enterScope(String id, ParseTree tree) {
        for (Scope s: currentScope.getSubScopes()) {
            if (s.id == id) {
                currentScope = s;
                return;
            }
        }

        //No match in loop, so we need to add a new scope
        Scope scope = new Scope(currentScope, id);
        currentScope.addSubScope(scope);
        currentScope = scope;
        scopesProperty.put(tree, currentScope);
    }

    public void exitScope() {
        currentScope = currentScope.parent;
    }

    public void addSymbol(Symbol symbol) {
        if (!isSymbol(symbol.getId(), currentScope)) {
            currentScope.addThisSymbol(symbol);
        }
        else {
            throw new AlreadyDeclared(symbol.getId());
        }
    }

    public void checkId(String id) {
        if (!isSymbol(id, currentScope)) {
            throw new NotDeclared(id);
        }
    }

    public void updateCurrentScope(ParseTree tree) {
        if (scopesProperty.get(tree) != null) {
            currentScope = scopesProperty.get(tree);
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

    public Scope getScope(String id) {
        return getScopeHelper(id, globalScope);
    }

    public Scope getInnerScope(String id, Scope scope) {
        return getScopeHelper(id, scope);

    }

    private Scope getScopeHelper(String id, Scope scope) {
        if (scope.id != null && scope.id.equals(id)) {
            return scope;
        }
        else {
            for (Scope s : scope.getSubScopes()) {
                Scope retScope = getScopeHelper(id, s);
                if (retScope != null)
                    return retScope;
            }
        }
        return null;
    }

    public List<TypeSymbol> getParamsVarsFromScope(Scope scope) {
        List<TypeSymbol> result = new ArrayList<>();
        return getParamsVarsFromScopeHelper(scope, result);
    }

    private List<TypeSymbol> getParamsVarsFromScopeHelper(Scope scope, List<TypeSymbol> result) {
        if (scope != globalScope) {
            result.addAll(scope.getAllTypeSymbols());
            if (scope.parent != null) {
                return getParamsVarsFromScopeHelper(scope.parent, result);
            }
        }
        return result;
    }
}
