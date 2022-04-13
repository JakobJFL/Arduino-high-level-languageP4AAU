package Contents;

import java.util.ArrayList;
import java.util.List;

public class Body implements Node {
    public List<Stmt> stmt;
    public List<FuncDef> funcDef;

    public Body() {
        this.stmt = new ArrayList<>();
        this.funcDef = new ArrayList<>();
    }

    public void addFuncDef(FuncDef f) {
        funcDef.add(f);
    }

    public void addStmt(Stmt c) {
        stmt.add(c);
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.addAll(stmt);
        list.addAll(funcDef);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
