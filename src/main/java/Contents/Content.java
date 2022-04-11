package Contents;

import java.util.ArrayList;
import java.util.List;

public abstract class Content {
    public List<FuncDef> funcDefs;
    public List<VarDecl> varDecl;
    public List<Content> content;

    public Content() {
        this.funcDefs = new ArrayList<>();
        this.varDecl = new ArrayList<>();
        this.content = new ArrayList<>();
    }

    public void addContent(Content c) {
        content.add(c);
    }

    public void addFuncDefs(FuncDef f) {
        funcDefs.add(f);
    }

    public void addVarDecl(VarDecl f) {
        varDecl.add(f);
    }
}
