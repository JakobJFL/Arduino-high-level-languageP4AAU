package Contents;

import java.util.ArrayList;
import java.util.List;

public class WhileExpr implements Node {
    public Expr expr;
    public Body body;

    public void setExpr(Expr e) {
        expr = e;
    }
    public void setBody(Body b) {
        body = b;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.add(expr);
        list.add(body);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
