package com.compiler.SymbolTbl;

import com.compiler.SymbolTbl.Symbols.Symbol;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scope {
    Map<String, Symbol> symbolDictionary = new HashMap<String, Symbol>();
    private List<Scope> subScopes = new ArrayList<>();
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
/* SLET OMG
    public Scope getSubScope(String id) {
        for (Scope s : subScopes) {
            if (s.id.equals(id)) {
                return s;
            }
        }
        return null;
    }
*/
    public void addThisSymbol(Symbol symbol) {
        symbolDictionary.put(symbol.getId(), symbol);
    }

    public Symbol getThisSymbol(String id) {
        return symbolDictionary.get(id);
    }

    public boolean containsId(String id) {
        return symbolDictionary.containsKey(id);
    }
}
