import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Started");
        //Syntax analysis
        CharStream stream = CharStreams.fromString("sdsd");
        AhllLexer lexer = new AhllLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AhllParser parser = new AhllParser(tokens);
        AhllParser.ProgramContext CST = parser.program();

        // Contextual analysis

    }
}
