package com.compiler;

import com.compiler.Exceptions.AlreadyDeclared;
import com.compiler.Exceptions.NotDeclared;
import com.compiler.Exceptions.SyntaxException;
import com.compiler.Exceptions.TypeException;
import com.compiler.SymbolTbl.DeclarationCheckListener;
import com.compiler.SymbolTbl.SymbolTblListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("testCode/test5.txt");
        try {
            SymbolTblListener symbolTable = compile(fileHandler.getFileContent());
        } catch (NotDeclared ex) {
            System.out.println("NotDeclared: " + ex.getMessage());
        }
        catch (AlreadyDeclared ex) {
            System.out.println("AlreadyDeclared: " + ex.getMessage());
        }
        catch (SyntaxException ex) {
            System.out.println("SyntaxException: " + ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println("Read file Exception: " + ex.getMessage());
        }
        catch (TypeException ex) {
            System.out.println("TypeException: " + ex.getMessage());
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
        DeclarationCheckListener DeclarationChecker = new DeclarationCheckListener(symbolTable.symbolTbl);
        walker.walk(DeclarationChecker, tree);
        TypeCheckerVisitor visitor = new TypeCheckerVisitor(symbolTable.symbolTbl);
        visitor.visitProgram((HlmpParser.ProgramContext) tree);
        ArduinoGenVisitor codeGen = new ArduinoGenVisitor(symbolTable.symbolTbl);
        System.out.println(codeGen.visitProgram((HlmpParser.ProgramContext) tree));
        return symbolTable;
    }
}
