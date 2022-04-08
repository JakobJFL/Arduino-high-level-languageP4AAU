
public class TypeChecker extends AhllBaseVisitor<Integer> {
    @Override
    public Integer visitProgram(AhllParser.ProgramContext ctx) {

        return null;
    }

    @Override
    public Integer visitRecursive(MegaParser.RecursiveContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);

        System.out.println("Checking expression.");

        if(left != INTDCL || right != INTDCL) {
            System.out.println("nej");
        }

        return INTDCL;
    }
}
