public interface Symbol {
    void setId(String id);
    String getId();

    void setType(SymbolTbl.Types type);
    SymbolTbl.Types getType();
}
