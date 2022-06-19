package com.compiler.Contextual;

import com.compiler.Contextual.Symbols.Symbol;
import com.compiler.Contextual.Symbols.TypeSymbol;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scope {
    Map<String, Symbol> symbolDictionary = new HashMap<>();
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

    public void addThisSymbol(Symbol symbol) {
        symbolDictionary.put(symbol.getId(), symbol);
    }

    public Symbol getThisSymbol(String id) {
        return symbolDictionary.get(id);
    }

    public List<TypeSymbol> getAllTypeSymbols() {
        List<TypeSymbol> result = new ArrayList<>();
        for (String key : symbolDictionary.keySet()) {
            Symbol symbol = symbolDictionary.get(key);
            if (symbol.getClass() == TypeSymbol.class) {
                result.add((TypeSymbol) symbol);
            }
        }
        return result;
    }

    public boolean containsId(String id) {
        return symbolDictionary.containsKey(id);
    }
}
