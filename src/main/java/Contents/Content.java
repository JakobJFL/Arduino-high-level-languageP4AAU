package Contents;

import java.util.ArrayList;
import java.util.List;

public class Content implements Node {
    public List<FuncDef> funcDefs;
    public List<VarDecl> varDecl;

    public Content() {
        this.funcDefs = new ArrayList<>();
        this.varDecl = new ArrayList<>();
    }


    public void addFuncDefs(FuncDef f) {
        funcDefs.add(f);
    }

    public void addVarDecl(VarDecl f) {
        varDecl.add(f);
    }

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.addAll(funcDefs);
        list.addAll(varDecl);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
