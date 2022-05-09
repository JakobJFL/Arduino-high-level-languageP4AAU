package com.compiler.SymbolTbl.Symbols;

import com.compiler.HlmpParser;

import java.util.ArrayList;

public class TypeSymbol extends Symbol {
    private HlmpParser.TypeContext type;

    public TypeSymbol(String id, String uid) {
        super(id, uid);
    }

    public void setType(HlmpParser.TypeContext type) {
        this.type = type;
    }
    public HlmpParser.TypeContext getType() {
        return type;
    }
}
