package Contents;

import java.util.ArrayList;
import java.util.List;

public class Parameter implements Node  {
    public Parameter parameter;

    public void setParameter(Parameter p) {
        parameter = p;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
