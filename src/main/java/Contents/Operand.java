package Contents;

public class Operand extends Expr {
    public FuncCall funcCall;
    public SInt sInt;

    public void addFuncCall(FuncCall f) {
        funcCall = f;
    }
    public void addSInt(SInt i) {
        sInt = i;
    }

}
