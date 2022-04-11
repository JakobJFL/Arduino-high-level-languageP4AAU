package Contents;

public abstract class Stmt {
    public ReturnExpr returnExpr;
    public Assign assign;
    public VarDecl varDecl;
    public FuncCall funcCall;
    public WriteFunc writeFunc;
    public ReadFunc readFunc;
    public IfStmt ifStmt;
    public WhileExpr whileExpr;

    public Stmt() {
    }

    public void addReturnExpr(ReturnExpr r) {
        returnExpr = r;
    }

    public void addAssign(Assign a) {
        assign = a;
    }

    public void addVarDecl(VarDecl v) {
        varDecl = v;
    }

    public void addFuncCall(FuncCall f) {
        funcCall = f;
    }

    public void addWriteFunc(WriteFunc w) {
        writeFunc = w;
    }

    public void addReadFunc(ReadFunc r) {
        readFunc = r;
    }

    public void addIfStmt(IfStmt i) {
        ifStmt = i;
    }

    public void addWhileExpr(WhileExpr r) {
        whileExpr = r;
    }
}
