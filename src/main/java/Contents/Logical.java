package Contents;

import java.util.ArrayList;
import java.util.List;

public class Logical implements Node{

    @Override
    public List<Node> GetChildren() {
        return null;
    }

    @Override
    public void accept(Node v) {v.accept(this);}
}
