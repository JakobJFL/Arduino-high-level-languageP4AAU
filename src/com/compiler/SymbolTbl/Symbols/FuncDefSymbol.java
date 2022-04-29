package com.compiler.SymbolTbl.Symbols;

import com.compiler.HlmpParser;

import java.util.ArrayList;
import java.util.List;

public class FuncDefSymbol extends TypeSymbol {
    public HlmpParser.TypeContext type;
    public List<TypeSymbol> parameters = new ArrayList<>();

    public void setType(HlmpParser.TypeContext type) {
        this.type = type;
    }
    public HlmpParser.TypeContext getType() {
        return type;
    }

    public void addParameter(TypeSymbol symbol) {
        parameters.add(symbol);
    }
    public List<TypeSymbol> getParameters() {
        return parameters;
    }
}
