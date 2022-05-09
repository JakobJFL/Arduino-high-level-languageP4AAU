package com.tests;

import com.compiler.Exceptions.AlreadyDeclared;
import com.compiler.SymbolTbl.Scope;
import com.compiler.SymbolTbl.Symbols.Symbol;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTest {

    @Test
    public void definingAlreadyDeclaredSymbol_throws() {
        // Arrange
        Symbol symbol1 = new Symbol("test", "1");
        Symbol symbol2 = new Symbol("test", "2");
        Scope scope =  new Scope(null, null);

        // Act & Assert
        scope.addThisSymbol(symbol1);
        Assertions.assertThrows(AlreadyDeclared.class, () -> scope.addThisSymbol(symbol2));
    }
}