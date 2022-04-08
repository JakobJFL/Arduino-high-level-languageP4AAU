import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Started");
        //Syntax analysis
        FileHandler fileHandler = new FileHandler("syntaxTestCode\\test1.txt");

        CharStream stream = CharStreams.fromString(fileHandler.getFileContent());
        AhllLexer lexer = new AhllLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AhllParser parser = new AhllParser(tokens);
        AhllParser.ContentContext content = parser.program().content();
        for (int i = 0; i < content.children.size(); i++) {
            if (content.getChild(i).getChildCount() != 0) {
                for (int j = 0; j < content.getChild(i).getChildCount(); j++) {
                    System.out.println(content.getChild(i).getChild(j).getText());
                }
            }
            else {
                System.out.println(content.getChild(i).getText());
            }
        }


        AhllParser.ProgramContext CST = parser.program();


        // Contextual analysis
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.visit(CST);
    }
}
