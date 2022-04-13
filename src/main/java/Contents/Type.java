package Contents;

import java.util.ArrayList;
import java.util.List;

public class Type implements Node {

    public Type type;
    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.add(type);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
