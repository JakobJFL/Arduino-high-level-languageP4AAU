package Contents;

import java.util.List;

public class PinLiteral implements Node {

    public enum pinModes {
        OUTPUT,
        INPUT
    }

    public int pinNum;
    public Id id;
    public pinModes pinMode;

    public void setPinNum(int i) {
        pinNum = i;
    }
    public void setId(Id i) {
        id = i;
    }
    public void setPinMode(pinModes i) {
        pinMode = i;
    }
    @Override
    public List<Node> GetChildren() {
        return null;
    }

    @Override
    public void accept(Node v) {v.accept(this);}
}
