import Exceptions.NotSupportedException;

public class ASTConverter {
    class BuildAstVisitor extends AhllBaseVisitor<ExpressionNode>
    {
        /*
        @Override
        public ExpressionNode VisitCompileUnit(AhllParser.CompileUnitContext context)
        {
            return Visit(context.expr());
        }

        @Override
        public ExpressionNode VisitNumberExpr(AhllParser.NumberExprContext context)
        {
            return new Node.NumberNode
            {
                Value = parseDouble(context.value.Text, NumberStyles.AllowDecimalPoint | NumberStyles.AllowExponent);
            };
        }

        @Override
        public ExpressionNode VisitParensExpr(AhllParser.ParensExprContext context)
        {
            return Visit(context.expr());
        }

        @Override
        public ExpressionNode VisitInfixExpr(AhllParser.ExprContext context) throws NotSupportedException {
            InfixExpressionNode node;

            switch (context)
            {
                case AhllLexer.PLUS:
                    node = new Node.AdditionNode();
                    break;

                case AhllLexer.MINUS:
                    node = new Node.SubtractionNode();
                    break;

                case AhllLexer.MULT:
                    node = new Node.MultiplicationNode();
                    break;

                case AhllLexer.DIVIDE:
                    node = new Node.DivisionNode();
                    break;

                case AhllLexer.MODULU:
                    node = new Node.ModuluNode();
                    break;

                default:
                    throw new NotSupportedException();
            }

            node.Left = Visit(context.left);
            node.Right = Visit(context.right);

            return node;
        }

        @Override
        public ExpressionNode VisitUnaryExpr(AhllParser.UnaryExprContext context) throws NotSupportedException {
            switch (context.op.Type)
            {
                case AhllLexer.OP_ADD:
                    return Visit(context.expr());

                case AhllLexer.OP_SUB:
                    return new NegateNode
                {
                    Node.NegateNode kat = new Node.NegateNode();
                    kat.setInnerNode(Visit(context.expr()));
                };

                default:
                    throw new NotSupportedException();
            }
        }

         */
    }
}
