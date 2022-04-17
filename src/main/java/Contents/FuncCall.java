package Contents;

import java.util.ArrayList;
import java.util.List;

public class FuncCall implements Node {
    public Call call;
    public FuncCall funcCall;

    public void setFuncCall(FuncCall f) {
        funcCall = f;
    }

    public void setCall(Call c) {
        call = c;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> child = new ArrayList<>();
        child.add(funcCall);
        child.add(call);
        return child;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
