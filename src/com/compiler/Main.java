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
import org.stringtemplate.v4.ST;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("testCode/GiiCode/task1LookAtCode.txt");
        try {
            System.out.println("Compiling...");
            String compiledCode = compile(fileHandler.getFileContent());
            fileHandler.makeFileFromStr(compiledCode);
        } catch (NotDeclared ex) {
            System.out.println("ERROR: \"" + ex.getMessage() + "\" is not declared");
        }
        catch (AlreadyDeclared ex) {
            System.out.println("ERROR: \"" + ex.getMessage() + "\" is already declared");
        }
        catch (SyntaxException ex) {
            System.out.println("ERROR SyntaxException: " + ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println("Read file Exception: " + ex.getMessage());
        }
        catch (TypeException ex) {
            System.out.println("ERROR TypeException: " + ex.getMessage());
        }
    }

    public static String compile(String input) {
        ParseTree tree = DoSyntax(input);
        SymbolTblListener symbolTable = DoContextual(tree);
        ArduinoGenVisitor codeGen = new ArduinoGenVisitor(symbolTable.symbolTbl);
        String result = codeGen.visitProgram((HlmpParser.ProgramContext) tree);
        return result;
    }

    public static SymbolTblListener DoContextual(ParseTree tree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTblListener symbolTable = new SymbolTblListener();
        walker.walk(symbolTable, tree);
        DeclarationCheckListener DeclarationChecker = new DeclarationCheckListener(symbolTable.symbolTbl);
        walker.walk(DeclarationChecker, tree);
        TypeCheckerVisitor visitor = new TypeCheckerVisitor(symbolTable.symbolTbl);
        visitor.visitProgram((HlmpParser.ProgramContext) tree);
        return symbolTable;
    }

    public static ParseTree DoSyntax(String input) {
        CharStream stream = CharStreams.fromString(input);
        HlmpLexer lexer = new HlmpLexer(stream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HlmpParser parser = new HlmpParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        ParseTree tree = parser.program();
        return tree;
    }
}
