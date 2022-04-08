
abstract class InfixExpressionNode extends ExpressionNode
{
    public ExpressionNode Left;
    public ExpressionNode Right;

    public ExpressionNode getLeft() {
        return Left;
    }
    public ExpressionNode getRight() {
        return Right;
    }
    public void setRight(ExpressionNode right) {
        Right = right;
    }
    public void setLeft(ExpressionNode left) {
        Left = left;
    }
}
