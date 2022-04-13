package Contents;

public class Operand extends Expr {
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


}
