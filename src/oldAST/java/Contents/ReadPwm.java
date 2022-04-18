package Contents;

import java.util.List;

public class ReadPwm implements Node {


    @Override
    public List<Node> GetChildren() {
        return null;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
