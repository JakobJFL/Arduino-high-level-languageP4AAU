package com.compiler.Contextual.Symbols;

import com.compiler.HlmpParser;

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
