import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Parser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Started");
        //Syntax analysis
        FileHandler fileHandler = new FileHandler("syntaxTestCode\\test1.txt");
/*
        CharStream stream = CharStreams.fromString(fileHandler.getFileContent());
        AhllLexer lexer = new AhllLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AhllParser parser = new AhllParser(tokens);
        AhllParser.ContentContext CST = parser.program().content();
*/
        //ParseTree tree = CST.getChild(0);
        //System.out.println(CST.getChild(0).getClass().);
        //System.out.println(walk(current, tree));

        String source_code = fileHandler.getFileContent();

        CodePointCharStream stream_from_string = CharStreams.fromString(source_code);
        AhllLexer lexer = new AhllLexer(new ANTLRInputStream(source_code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AhllParser parser = new AhllParser(tokens);

        String parserName = "AhllParser";
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        Class<? extends Parser> parserClass = null;
        try {
            parserClass = cl.loadClass(parserName).asSubclass(Parser.class);
        } catch (ClassNotFoundException e) {
            System.out.println("FUCKKKKKKK");
            e.printStackTrace();
        }

        String startRuleName = "content"; //as specified in my CPP14.g4 file
        Method startRule = null;
        try {
            startRule = parserClass.getMethod(startRuleName);
        } catch (NoSuchMethodException e) {
            System.out.println("FUCKKKKKKK");
            e.printStackTrace();
        }
        ParserRuleContext tree = null;
        try {
            tree = (ParserRuleContext)startRule.invoke(parser, (Object[])null);
        } catch (IllegalAccessException e) {
            System.out.println("FUCKKKKKKK");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            System.out.println("FUCKKKKKKK");
            e.printStackTrace();
        }
        System.out.println(tree.toStringTree(parser));


        // Contextual analysis
        /*
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.visit(CST);
        */
    }

    public static void traversePreOrder(ParseTree CST) {
        if (CST.getChildCount() > 0)  {
            // visit(node.value);
            System.out.println(CST.getClass().getSimpleName());

            for (int i = 0; i < CST.getChildCount(); i++) {
                traversePreOrder(CST.getChild(i));
            }
        }
    }
}
