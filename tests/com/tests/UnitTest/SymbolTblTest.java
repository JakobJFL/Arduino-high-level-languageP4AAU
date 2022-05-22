package com.tests.UnitTest;

import com.compiler.Exceptions.AlreadyDeclared;
import com.compiler.Contextual.Scope;
import com.compiler.Contextual.SymbolTbl;
import com.compiler.Contextual.Symbols.Symbol;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class SymbolTblTest {

    @Test
    public void definingAlreadyDeclaredSymbol_throws() {
        // Arrange
        Symbol symbol1 = new Symbol("test", "1");
        Symbol symbol2 = new Symbol("test", "2");
        SymbolTbl symbolTbl = new SymbolTbl();

        // Act & Assert
        symbolTbl.addSymbol(symbol1);
        Assertions.assertThrows(AlreadyDeclared.class, () -> symbolTbl.addSymbol(symbol2));
    }

    @Test
    public void getSymbolDefinedInScope_shouldGet() {
        // Arrange
        Symbol symbol = new Symbol("test", "1");
        Scope scope = new Scope(null, null);

        // Act
        scope.addThisSymbol(symbol);

        // Assert
        Assertions.assertEquals(scope.getThisSymbol("test"), symbol);
    }

    @Test
    public void enterScope_idDoesNotExist_shouldCreateNewScope() {
        // Arrange
        SymbolTbl symbolTbl = new SymbolTbl();
        String id = "func";
        symbolTbl.enterScope(id, null);

        Assertions.assertEquals(id, symbolTbl.currentScope.id);
    }

    @Test
    public void enterScope_idAlreadyExist_shouldReturnSameScope() {
        // Arrange
        SymbolTbl symbolTbl = new SymbolTbl();
        String id = "func";
        symbolTbl.enterScope(id, null);
        Scope preScope = symbolTbl.currentScope;
        symbolTbl.enterScope(id, null);

        Assertions.assertEquals(preScope.id, symbolTbl.currentScope.id);
    }

    @Test
    public void getDefinedSubScopes_shouldGet() {
        // Arrange
        Scope scope = new Scope(null, null);
        Scope subScope = new Scope(scope, "subScope");
        Scope subScope2 = new Scope(scope, "subScope2");
        List<Scope> subScopesList = new ArrayList<>();

        // Act
        scope.addSubScope(subScope);
        scope.addSubScope(subScope2);

        subScopesList.add(subScope);
        subScopesList.add(subScope2);

        // Assert
        Assertions.assertEquals(scope.getSubScopes(), subScopesList);
    }

    @Test
    public void accessGlobalSymbolFromInner() {
        // Arrange
        SymbolTbl symbolTbl = new SymbolTbl();
        String symbolId = "test";
        Symbol symbol = new Symbol(symbolId, "1");

        // Act
        symbolTbl.addSymbol(symbol);
        symbolTbl.enterScope("func", null);

        // Assert
        Assertions.assertEquals(symbolTbl.getSymbol(symbolId), symbol);
    }
}
