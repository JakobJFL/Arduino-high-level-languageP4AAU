package Contents;

import java.util.ArrayList;
import java.util.List;

public class Args implements Node {
    public Expr expr;
    public void addExpr(Expr e) {
        expr = e;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> child = new ArrayList<>();
        child.add((Node) expr);
        return child;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
