import Contents.Program;

public class AnltrToProgram extends AhllBaseVisitor<Program> {

    @Override
    public Program visitProgram(AhllParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }
}
