package Contents;

public class FuncDef extends Content {
    public Head head;
    public Body body;
    public Parameters parameters;

    public void addHead(Head h) {
        head = h;
    }

    public void addBody(Body b) {
        body = b;
    }

    public void addParameters(Parameters p) {
        parameters = p;
    }
}
