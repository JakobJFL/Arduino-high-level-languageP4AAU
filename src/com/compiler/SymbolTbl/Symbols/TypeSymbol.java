package com.compiler.SymbolTbl.Symbols;

import com.compiler.HlmpParser;

import java.util.ArrayList;

public class TypeSymbol extends Symbol {
    public HlmpParser.TypeContext type;

    public TypeSymbol(String text) {
        super(text);
    }

    public void setType(HlmpParser.TypeContext type) {
        this.type = type;
    }
    public HlmpParser.TypeContext getType() {
        return type;
    }
}
