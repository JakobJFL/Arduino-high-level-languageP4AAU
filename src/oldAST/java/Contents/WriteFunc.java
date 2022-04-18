package Contents;

import java.util.ArrayList;
import java.util.List;

public class WriteFunc implements Node {
    public Val value;

    public void setVal(Val w) {
        value = w;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> child = new ArrayList<>();
        child.add(value);
        return child;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
