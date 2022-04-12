package Contents;

import java.util.ArrayList;
import java.util.List;

public class ArrayDef implements Node {
    public int size;
    public ArrayDef arrayDef;

    public void addArrayDef(ArrayDef arrayDef) {
        this.arrayDef = arrayDef;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> child = new ArrayList<>();
        child.add(arrayDef);
        return child;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
