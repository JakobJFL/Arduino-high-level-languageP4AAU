package Contents;

import java.util.ArrayList;
import java.util.List;

public class ArrayStmt implements Node {
    public Value value;
    public Id id;

    public void setValue(Value v) {
        value = v;
    }
    public void setId(Id i) {
        id = i;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<>();
        list.add(value);
        return list;
    }

    @Override
    public void accept(Node v) {v.accept(this);}
}
