package Contents;

import java.util.ArrayList;
import java.util.List;

public class FuncDef implements Node {
    public Head head;
    public Body body;

    public void setHead(Head h) {
        head = h;
    }

    public void setBody(Body b) {
        body = b;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> child = new ArrayList<>();
        child.add(head);
        child.add(body);
        return child;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}