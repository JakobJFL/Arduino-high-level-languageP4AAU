package Contents;

public class Expr {
    public Operand operand;
    public Operator operator;
    public ReadFunc readFunc;
    public ArrayStmt arrayStmt;

    public void addOperand(Operand o) {
        operand = o;
    }

    public void addOperator(Operator o) {
        operator = o;
    }

    public void addReadFunc(ReadFunc r) {
        readFunc = r;
    }

    public void addArrayStmt(ArrayStmt a) {
        arrayStmt = a;
    }
}
