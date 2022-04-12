package Contents;

import java.util.List;

public class FuncDef implements Node {
    public Head head;
    public Body body;
    public Parameters parameters;

    public void addHead(Head h) {
        head = h;
    }

    public void addBody(Body b) {
        body = b;
    }

    public void addParameters(Parameters p) {
        parameters = p;
    }

    @Override
    public List<Node> GetChildren() {
        return null;
    }

    @Override
    public void accept(Node v) {

    }
}
