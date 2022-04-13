package Contents;

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
        return null;
    }

    @Override
    public void accept(Node v) {

    }
}
