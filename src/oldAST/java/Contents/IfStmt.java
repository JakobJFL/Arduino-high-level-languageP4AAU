package Contents;

import java.util.ArrayList;
import java.util.List;

public class IfStmt implements Node {
    public Body body;
    public ElseStmt elseStmt;

    public void setBody(Body b) {
        body = b;
    }

    public void setElseStmt(ElseStmt e) {
        elseStmt = e;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> child = new ArrayList<>();
        child.add(body);
        child.add(elseStmt);
        return child;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
