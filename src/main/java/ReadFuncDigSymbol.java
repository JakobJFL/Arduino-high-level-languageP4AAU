public class ReadFuncDigSymbol implements Symbol {
    public String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setType(SymbolTbl.Types type) {

    }

    @Override
    public SymbolTbl.Types getType() {
        return null;
    }
}
