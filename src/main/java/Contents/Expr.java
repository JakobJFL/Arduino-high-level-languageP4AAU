package Contents;

import java.util.ArrayList;
import java.util.List;

public class Expr implements Node {
    public Operand operand;
    public Operator operator;
    public ReadFunc readFunc;
    public ArrayStmt arrayStmt;

    public void setOperand(Operand o) {
        operand = o;
    }

    public void setOperator(Operator o) {
        operator = o;
    }

    public void setReadFunc(ReadFunc r) {
        readFunc = r;
    }

    public void setArrayStmt(ArrayStmt a) {
        arrayStmt = a;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<>();
        list.add(operand);
        list.add(operator);
        list.add(readFunc);
        list.add(arrayStmt);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
