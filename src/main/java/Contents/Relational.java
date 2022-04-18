package Contents;

import java.util.ArrayList;
import java.util.List;

public class Relational implements Node {
    public String strVal;

    public void setStrVal(String s) {
        strVal = s;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> child = new ArrayList<>();
        child.add(strVal);
        return child;;
    }

    @Override
    public void accept(Node v) {v.accept(this);}
}
