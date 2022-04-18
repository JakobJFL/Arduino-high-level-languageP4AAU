package Contents;

import java.util.ArrayList;
import java.util.List;

public class Type implements Node {

    public Node type;

    public void setType(Node t) throws Exception {
        if (t instanceof Pwm || t instanceof Num || t instanceof Bool) {
            type = t;
        } else {
            throw new Exception("NEJ NEJ NEJ - den er ikke Pwm, Num ellr Bool ");
        }
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.add(type);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
