package Contents;

import java.util.ArrayList;
import java.util.List;

public class SInt  implements Node {
    public int sInt;
    public SInt(int i) {
        this.sInt = i;
    }

    @Override
    public List<Node> GetChildren() {
        return null;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
