import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Started");
        //Syntax analysis
        FileHandler fileHandler = new FileHandler("syntaxTestCode\\test5.txt");

        CharStream stream = CharStreams.fromString(fileHandler.getFileContent());
        AhllLexer lexer = new AhllLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AhllParser parser = new AhllParser(tokens);
        AhllParser.ProgramContext CST = parser.program();

        System.out.println("Syntax GOOD");

        // Contextual analysis

    }
}
