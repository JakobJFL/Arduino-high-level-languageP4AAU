package Contents;

import java.util.ArrayList;
import java.util.List;

public class Operator implements Node {
    public Relational relational;
    public Arithmetic arithmetic;
    public Logical logical;

    public void addRelational(Relational r) {
        relational = r;
    }
    public void addArithmetic(Arithmetic a) {
        arithmetic = a;
    }
    public void addLogical(Logical l) {
        logical = l;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.add(relational);
        list.add(arithmetic);
        list.add(logical);
        return list;
    }

    @Override
    public void accept(Node v) {v.accept(this);}
}
