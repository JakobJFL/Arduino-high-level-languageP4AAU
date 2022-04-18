package Contents;

import java.util.ArrayList;
import java.util.List;

public class Content implements Node {
    public List<FuncDef> funcDef;
    public List<VarDecl> varDecl;
    public SetupDef setupDef;
    public LoopDef loopDef;
    public List<Content> content;

    public Content() {
        this.funcDef = new ArrayList<>();
        this.varDecl = new ArrayList<>();
        this.setupDef = new SetupDef();
        this.loopDef = new LoopDef();
        this.content = new ArrayList<>();
    }

    public void addFuncDefs(FuncDef f) {
        this.funcDef.add(f);
    }

    public void addVarDecl(VarDecl f) { this.varDecl.add(f); }

    public void setSetupDef(SetupDef f) {
        this.setupDef = f;
    }

    public void setLoopDef(LoopDef f) { this.loopDef = f; }

    public void addContent(Content c) { this.content.add(c);}

    @Override
    public List<Node> GetChildren() {
        List<Node> list = new ArrayList<Node>();
        list.addAll(funcDef);
        list.addAll(varDecl);
        list.add(setupDef);
        list.add(loopDef);
        list.addAll(content);
        return list;
    }

    @Override
    public void accept(Node v) {
        v.accept(this);
    }
}
