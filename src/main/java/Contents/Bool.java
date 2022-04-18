package Contents;

import java.util.ArrayList;
import java.util.List;

public class Bool implements Node {
    public boolean bool;
    public void setBool(boolean b) {
        this.bool = b;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.add(bool);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
