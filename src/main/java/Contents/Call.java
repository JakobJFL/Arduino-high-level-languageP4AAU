package Contents;

import java.util.ArrayList;
import java.util.List;

public class Call implements Node {
    public Args args;
    public void setArgs(Args e) {
        args = e;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> child = new ArrayList<>();
        child.add(args);
        return child;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
