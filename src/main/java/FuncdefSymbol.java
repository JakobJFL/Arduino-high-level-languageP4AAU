import java.util.ArrayList;

public class FuncdefSymbol extends Symbol {
    private final ArrayList<Integer> parameterTypes;

    public FuncdefSymbol(String name, Integer symbol, ArrayList<Integer> parameterTypes) {
        super(name, symbol);
        this.parameterTypes = parameterTypes;
    }

    /**
     * Returns a list of integers matching the types of the functions parameters.
     *
     * @return A list of types represented as integers
     */
    public ArrayList<Integer> getParameterTypes() {
        return parameterTypes;
    }
}
