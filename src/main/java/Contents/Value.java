package Contents;

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
        return null;
    }

    @Override
    public void accept(Node v) {v.accept(this);}

}
