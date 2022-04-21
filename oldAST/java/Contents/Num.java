package Contents;

import java.util.ArrayList;
import java.util.List;

public class Num implements Node {
    public float floatVal;
    public void setFloat(float b) {
        this.floatVal = b;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        //list.add(floatVal);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}

