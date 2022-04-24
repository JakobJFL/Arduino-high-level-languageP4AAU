package com.compiler;

import com.compiler.SymbolTbl.SymbolTblListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Started");
        FileHandler fileHandler = new FileHandler("testCode/test1.txt");
        //Syntax analysis

        CharStream stream = CharStreams.fromString(fileHandler.getFileContent());
        HlmpLexer lexer = new HlmpLexer(stream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HlmpParser parser = new HlmpParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        ParseTree tree = parser.program();
        //SymbolTbl.SymbolTbl.Symbol table generation

        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTblListener symbolTable = new SymbolTblListener();
        walker.walk(symbolTable, tree);

    }

    public static void traverseCST(ParseTree tree) {
        if(tree != null) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                System.out.println(tree.getChild(i).getClass().getSimpleName());
                traverseCST(tree.getChild(i));
            }
        }
    }
}