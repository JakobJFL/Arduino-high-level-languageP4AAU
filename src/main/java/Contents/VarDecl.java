package Contents;

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
        return null;
    }

    @Override
    public void accept(Node v) {

    }
}
