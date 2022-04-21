package Contents;

import java.util.ArrayList;
import java.util.List;

public class VarDecl implements Node {
    public Expr expr;
    public PinLiteral pinLiteral;
    public ArrayDef arrayDef;

    public void setExpr(Expr e) {
        expr = e;
    }

    public void setPinLiteral(PinLiteral p) {
        pinLiteral = p;
    }

    public void setArrayDef(ArrayDef a) {
        arrayDef = a;
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.add(expr);
        list.add(pinLiteral);
        list.add(arrayDef);
        return list;
    }

    @Override
    public void accept(Node v) {v.accept(this);}

}
