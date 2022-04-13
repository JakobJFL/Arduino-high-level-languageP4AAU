package Contents;

import java.util.ArrayList;
import java.util.List;

public class Id implements Node {
    public Id id;
    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.add(id);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
