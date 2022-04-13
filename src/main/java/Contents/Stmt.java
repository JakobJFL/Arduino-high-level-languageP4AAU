package Contents;

import java.util.List;

public class Stmt implements Node {
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

    public void setReturnExpr(ReturnExpr r) {
        returnExpr = r;
    }

    public void setAssign(Assign a) {
        assign = a;
    }

    public void setVarDecl(VarDecl v) {
        varDecl = v;
    }

    public void setFuncCall(FuncCall f) {
        funcCall = f;
    }

    public void setWriteFunc(WriteFunc w) {
        writeFunc = w;
    }

    public void setReadFunc(ReadFunc r) {
        readFunc = r;
    }

    public void setIfStmt(IfStmt i) {
        ifStmt = i;
    }

    public void setWhileExpr(WhileExpr r) {
        whileExpr = r;
    }

    @Override
    public List<Node> GetChildren() {
        return null;
    }

    public void accept(Node v) {
        v.accept(this);
    }
}
