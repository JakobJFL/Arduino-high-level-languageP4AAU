package Contents;

import java.util.ArrayList;
import java.util.List;

public class SetupDef implements Node {
    public Body body;

    public void setBody(Body b) {
        body = b;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> child = new ArrayList<>();
        child.add(body);
        return child;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
