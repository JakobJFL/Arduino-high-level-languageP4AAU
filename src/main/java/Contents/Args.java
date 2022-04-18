package Contents;

import java.util.ArrayList;
import java.util.List;

public class Args implements Node {
    public List<Expr> expr;

    public Args() {
        expr = new ArrayList<>();
    }
    public void addExpr(Expr e) {
        expr.add(e);
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> child = new ArrayList<>();
        child.addAll(expr);
        return child;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
