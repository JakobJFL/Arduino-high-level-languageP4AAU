package Contents;

import java.util.ArrayList;
import java.util.List;

public class Assign implements Node {
    public Id id;
    public Expr expr;

    public void setId(Id id) {this.id = id;}
    public void setExpr(Expr e) {
        this.expr = e;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.add(id);
        list.add(expr);
        return list;
    }

    @Override
    public void accept(Node a) {
        a.accept(this);
    }
}
