package com.compiler.SymbolTbl;

import com.compiler.SymbolTbl.Symbols.Symbol;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scope {
    Map<String, Symbol> symbolDictionary = new HashMap<String, Symbol>();
    public List<Scope> subScopes = new ArrayList<>();
    public Scope parent;
    public String id;

    public Scope(Scope parent, String id) {
        this.parent = parent;
        this.id = id;
    }

    public void addSubScope(Scope scope) {
        subScopes.add(scope);
    }

    public List<Scope> getSubScopes() {
        return subScopes;
    }

    public boolean addSymbol(Symbol symbol) {
        if (!containsId(symbol.getId())) {
            symbolDictionary.put(symbol.getId(), symbol);
            return true;
        }
        return false;
    }

    public Symbol getSymbol(String id) {
        return symbolDictionary.get(id);
    }

    public boolean containsId(String id) {
        return symbolDictionary.containsKey(id);
    }
}
