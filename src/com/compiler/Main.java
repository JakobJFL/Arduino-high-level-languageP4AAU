package com.compiler;

import com.compiler.Exceptions.AlreadyDeclared;
import com.compiler.Exceptions.NotDeclared;
import com.compiler.Exceptions.SyntaxException;
import com.compiler.SymbolTbl.SymbolTblListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Started");
        FileHandler fileHandler = new FileHandler("testCode/test3.txt");
        try {
            SymbolTblListener symbolTable = compile(fileHandler.getFileContent());
        } catch (AlreadyDeclared ex) {
            System.out.println("AlreadyDeclared: " + ex.getMessage());
        }
        catch (NotDeclared ex) {
            System.out.println("NotDeclared: " + ex);
        }
        catch (SyntaxException ex) {
            System.out.println("SyntaxException: " + ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println("Read file Exception: " + ex.getMessage());
        }
    }

    public static SymbolTblListener compile(String input) {
        //Syntax analysis
        CharStream stream = CharStreams.fromString(input);
        HlmpLexer lexer = new HlmpLexer(stream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HlmpParser parser = new HlmpParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        ParseTree tree = parser.program();
        //Symbol table generation

        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTblListener symbolTable = new SymbolTblListener();
        walker.walk(symbolTable, tree);
        TypeCheckerVisitor visitor = new TypeCheckerVisitor(symbolTable);
        visitor.visitProgram((HlmpParser.ProgramContext) tree);
        return symbolTable;
    }
}
