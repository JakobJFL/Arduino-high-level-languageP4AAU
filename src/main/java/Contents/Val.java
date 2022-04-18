package Contents;

import java.util.ArrayList;
import java.util.List;

public class Val implements Node {
    public int intVal;
    public Id id;

    public void setInt(int i) {
        intVal = i;
    }

    public void setId(Id i) {
        id = i;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.add(intVal);
        list.add(id);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
