package Contents;

public class FuncCall {
    public Call call;
    public FuncCall funcCall;

    public void addFuncCall(FuncCall f) {
        funcCall = f;
    }

    public void addCall(Call c) {
        call = c;
    }
}
