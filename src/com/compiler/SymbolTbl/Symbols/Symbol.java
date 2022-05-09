package com.compiler.SymbolTbl.Symbols;

public class Symbol {
    private String id;
    private String uniqueId;

    public String getUniqueId() {
        return uniqueId;
    }

    public Symbol(String id, String uniqueId) {
        this.uniqueId = uniqueId;
        this.id = id;
    }
    public String getId() {
        return id;
    }
}
