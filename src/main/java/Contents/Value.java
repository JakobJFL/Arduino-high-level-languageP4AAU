package Contents;

import java.util.ArrayList;
import java.util.List;

public class Value implements Node {
    public SInt sInt;
    public Id id;

    public void setSInt(SInt i) {
        sInt = i;
    }

    public void setId(Id i) {
        id = i;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> child = new ArrayList<>();
        child.add(sInt);
        child.add(id);
        return child;
    }

    @Override
    public void accept(Node v) {v.accept(this);}

}
