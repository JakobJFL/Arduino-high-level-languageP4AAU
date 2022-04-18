package Contents;

import java.util.ArrayList;
import java.util.List;

public class Operand implements Node {
    public FuncCall funcCall;
    public SInt sInt;
    public Id id;
    public Bool bool;

    public void setFuncCall(FuncCall f) {
        funcCall = f;
    }
    public void setSInt(SInt i) {
        sInt = i;
    }
    public void setBool(Bool b) {
        bool = b;
    }
    public void setId(Id i) {
        id = i;
    }


    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<>();
        list.add(funcCall);
        list.add(sInt);
        list.add(id);
        list.add(bool);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
