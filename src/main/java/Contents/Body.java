package Contents;

import java.util.ArrayList;
import java.util.List;

public class Body {
    public List<Stmt> stmt;
    public List<Body> body;
    public List<FuncDef> funcDef;

    public Body() {
        this.stmt = new ArrayList<>();
        this.body = new ArrayList<>();
        this.funcDef = new ArrayList<>();
    }

    public void addFuncDef(FuncDef f) {
        funcDef.add(f);
    }

    public void addStmt(Stmt c) {
        stmt.add(c);
    }

    public void addBody(Body b) {
        body.add(b);
    }

}
