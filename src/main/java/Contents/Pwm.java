package Contents;

import java.util.List;

public class Pwm implements Node  {
    public Pwm pwm;

    public void setReadPwm(Pwm p) {
        pwm = p;
    }

    @Override
    public List<Node> GetChildren() {
        return null;
    }

    @Override
    public void accept(Node v) {v.accept(this);}

}
