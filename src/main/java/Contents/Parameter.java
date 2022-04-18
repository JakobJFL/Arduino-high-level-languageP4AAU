package Contents;

import java.util.ArrayList;
import java.util.List;

public class Parameter implements Node  {
    public Type type;
    public Id id;

    public void setType(Type t) {
        type = t;
    }
    public void setId(Id i) {
        id = i;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.add(type);
        list.add(id);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
