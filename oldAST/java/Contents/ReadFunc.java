package Contents;

import java.util.List;

public class ReadFunc implements Node {
    public ReadPwm readPwm;
    public ReadAnalog readAnalog;
    public ReadDigital readDigital;
    public Id id;


    public void setReadPwm(ReadPwm p) {readPwm = p;}
    public void setId(Id i) {id = i;}

    public void setReadAnalog(ReadAnalog r) {
        readAnalog = r;
    }
    public void setReadDigital(ReadDigital r) {
        readDigital = r;
    }

    @Override
    public List<Node> GetChildren() {
        return null;
    }

    @Override
    public void accept(Node v) {v.accept(this);}

}
