package Contents;

public class ElseStmt {
    public ElseStmt elseStmt;
    public Body body;
    public IfStmt ifStmt;

    public void addBody(Body b) {
        body = b;
    }

    public void addIfStmt(IfStmt i) {
        ifStmt = i;
    }
}
