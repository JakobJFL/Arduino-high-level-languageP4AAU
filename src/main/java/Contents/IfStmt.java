package Contents;

public class IfStmt {
    public Body body;
    public ElseStmt elseStmt;

    public void addBody(Body b) {
        body = b;
    }

    public void addElseStmt(ElseStmt e) {
        elseStmt = e;
    }
}
