package Contents;

import java.util.ArrayList;
import java.util.List;

public class ArrayDef implements Node {
    public SInt size;
    public Type type;
    public Id id;

    public void setSize(SInt i) {
        this.size = i;
    }
    public void setType(Type t) {
        this.type = t;
    }
    public void setId(Id i) {
        this.id = i;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> child = new ArrayList<>();
        child.add(size);
        child.add(type);
        child.add(id);

        return child;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }

}
