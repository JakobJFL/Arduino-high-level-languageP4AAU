public class Node {


    public static class AdditionNode extends InfixExpressionNode
    {

    }

    public static class SubtractionNode extends InfixExpressionNode
    {

    }

    public static class MultiplicationNode extends InfixExpressionNode
    {
    }

    public static class DivisionNode extends InfixExpressionNode
    {
    }

    public static class ModuluNode extends InfixExpressionNode
    {
    }

    static class NegateNode extends ExpressionNode
    {
        public ExpressionNode InnerNode;

        public ExpressionNode InnerNode() {
            return InnerNode;
        }
        public void setInnerNode(ExpressionNode innerNode) {
            InnerNode = innerNode;
        }
        public ExpressionNode getInnerNode() {
            return InnerNode;
        }
    }

    class FunctionNode extends ExpressionNode
    {
        public ExpressionNode Argument;

        public void setValue(ExpressionNode argument) {
            Argument = argument;
        }
        public ExpressionNode getValue() {
            return Argument;
        }
    }

    class NumberNode extends ExpressionNode
    {
        public double Value;
        public void setValue(double value) {
            Value = value;
        }
        public double getValue() {
            return Value;
        }
    }


}
