package Contents;

import java.util.List;

public interface Node {
    List<Node> GetChildren();

    void accept(Node v);

}
