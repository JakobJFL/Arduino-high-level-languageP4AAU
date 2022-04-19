import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class Scope {
    List<Symbol> symbolList = new ArrayList<>();
    public List<Scope> subScopes = new ArrayList<>();
    public Scope parent;
    public ParseTree associatedNode;


    public Scope(Scope parent, ParseTree node) {
        this.parent = parent;
        this.associatedNode = node;
    }

    public void addSubScopes() {

    }

    public void addSymbol(Symbol symbol) {
        //if (symbol is already there)
        symbolList.add(symbol);
    }

}
