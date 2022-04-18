package Contents;

import java.util.ArrayList;
import java.util.List;

public class ElseStmt implements Node {
    public Body body;
    public IfStmt ifStmt;

    public void setBody(Body b) {
        body = b;
    }

    public void setIfStmt(IfStmt i) {
        ifStmt = i;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> child = new ArrayList<>();
        child.add(ifStmt);
        child.add(body);
        return child;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
