package Contents;

import java.util.ArrayList;
import java.util.List;

public class Val implements Node {
    public Val val;
    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.add(val);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
