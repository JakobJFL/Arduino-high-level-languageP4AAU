package Contents;

import java.util.ArrayList;
import java.util.List;

public class Head implements Node  {
    public List<Parameter> parameters;

    public Head() {
        parameters = new ArrayList<>();
    }

    public void addParameter(Parameter p) {
        parameters.add(p);
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.addAll(parameters);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
