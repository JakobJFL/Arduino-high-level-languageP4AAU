package Contents;

public class VarDecl {
    public Expr expr;
    public PinLiteral pinLiteral;
    public ArrayDef arrayDef;

    public void addExpr(Expr e) {
        expr = e;
    }

    public void addPinLiteral(PinLiteral p) {
        pinLiteral = p;
    }

    public void addArrayDef(ArrayDef a) {
        arrayDef = a;
    }
}
