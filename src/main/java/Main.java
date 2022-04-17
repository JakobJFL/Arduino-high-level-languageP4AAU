import Contents.Node;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.Trees;

public class Main {
    public static void main(String[] args) {
        System.out.println("Started");
        //Syntax analysis
        FileHandler fileHandler = new FileHandler("syntaxTestCode\\test1.txt");

        CharStream stream = CharStreams.fromString(fileHandler.getFileContent());
        AhllLexer lexer = new AhllLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AhllParser parser = new AhllParser(tokens);
        AhllParser.ContentContext CST = parser.program().content();

        ASTConverter converter = new ASTConverter();
        Node AST = converter.visitContent(CST);


        ///arseTree root = parser.yourOwnRule();

        //traverseCST(CST);
        for (Node n : AST.GetChildren()) {
            System.out.println(n.getClass().getSimpleName());

        }
        //traverseAST(AST);

        //ParseTree tree = CST.getChild(0);
        //System.out.println(CST.getChild(0).getClass().);
        //System.out.println(walk(current, tree));


        // Contextual analysis
        /*
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.visit(CST);
        */
    }

    public static void traverseAST(Node tree) {
        if(tree != null) {
            for (Node n : tree.GetChildren()) {
                if (n != null) {
                    System.out.println(n.getClass().getSimpleName());
                    traverseAST(n);
                } else {
                    System.out.println("null");
                }
            }
        }
    }

    public static void traverseCST(ParseTree tree) {
        if(tree != null) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                System.out.println(tree.getChild(i).getClass().getSimpleName());
                traverseCST(tree.getChild(i));
            }
        }
    }
    /*
    public static void printLeafNodes(Node node) {
        // base case
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            System.out.printf("%d ", node.value);
        }

        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }
*/
}
/*
if (CST.getChildCount() > 0)  {
        // visit(node.value);
        System.out.println(CST.getClass().getSimpleName());

        for (int i = 0; i < CST.getChildCount(); i++) {
        traversePreOrder(CST.getChild(i));
        }
        }
*/

