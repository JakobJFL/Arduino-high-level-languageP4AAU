package com.compiler.SymbolTbl.Symbols;

import com.compiler.HlmpParser;

import java.util.ArrayList;
import java.util.List;

public class FuncDefSymbol extends TypeSymbol {
    private HlmpParser.TypeContext type;
    private List<TypeSymbol> parameters = new ArrayList<>();

    public FuncDefSymbol(String id, String uid) {
        super(id, uid);
    }

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
