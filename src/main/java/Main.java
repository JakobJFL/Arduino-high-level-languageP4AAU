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
        String data = "";
        try {
            File myObj = new File("C:\\Users\\JFL\\Desktop\\testCodeForGmmar\\test4.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine() + '\n';
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        CharStream stream = CharStreams.fromString(data);
        AhllLexer lexer = new AhllLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AhllParser parser = new AhllParser(tokens);
        AhllParser.ProgramContext CST = parser.program();
        System.out.println("Syntax GOOD");
        // Contextual analysis

    }
}
