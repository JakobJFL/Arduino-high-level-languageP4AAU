package com.tests;

import com.compiler.Exceptions.AlreadyDeclared;
import com.compiler.SymbolTbl.Scope;
import com.compiler.SymbolTbl.SymbolTbl;
import com.compiler.SymbolTbl.Symbols.Symbol;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.compiler.Main.compile;

public class UnitTest {

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
        SymbolTbl symbolTbl = new SymbolTbl();
        Scope scope = new Scope(null, null);

        // Act
        scope.addThisSymbol(symbol);

        // Assert
        Assertions.assertEquals(scope.getThisSymbol("test"), symbol);
    }

    @Test
    public void enterScope_shouldCreateNewScope() { //help
        // Arrange
        String id = "testFunction";
        Scope globalScope = new Scope(null, null);
        Scope currentScope = globalScope;
        List<Scope> actualScopes = new ArrayList<>();
        List<Scope> expectedScopes = new ArrayList<>();
        Scope expectedScope = new Scope(globalScope, "testFunction");

        // Act
        expectedScopes.add(expectedScope);

        for (Scope s: currentScope.getSubScopes()) {
            if (s.id == id) {
                currentScope = s;
                return;
            }
        }
        Scope scope = new Scope(currentScope, id);
        currentScope.addSubScope(scope);
        currentScope = scope;
        actualScopes.add(currentScope);
        System.out.println(expectedScopes);
        System.out.println(actualScopes);

        // Assert
        Assertions.assertEquals(expectedScopes, actualScopes);
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
    public void accessGlobalSymbolFromInner() { //nono right?
        // Arrange
        Symbol symbol = new Symbol("test", "1");
        Scope globalScope = new Scope(null, "globalScope");
        Scope subScope = new Scope(globalScope, "subScope");

        // Act
        globalScope.addSubScope(subScope);
        globalScope.addThisSymbol(symbol);

        // Assert
        Assertions.assertEquals(subScope.parent.getThisSymbol("test"), symbol);
    }
}
