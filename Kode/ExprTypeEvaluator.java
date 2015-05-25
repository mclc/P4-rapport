public class ExpressionTypeEvaluator extends DepthFirstAdapter {
    private Stack<SymbolType> stack;
    
    public void outAIntegerExpr(AIntegerExpr node) {
        super.outAIntegerExpr(node);
        stack.push(SymbolType.Int());
    }

    public void outATrueExpr(ATrueExpr node) {
        super.outATrueExpr(node);
        stack.push(SymbolType.Boolean());
    }

    public void outACompareGreaterExpr(ACompareGreaterExpr node) {
        super.outACompareGreaterExpr(node);
        checkComparison(node, node.getLeft(), node.getRight());
    }
    
    private void checkComparison(Node node, PExpr left, PExpr right) {
        SymbolType arg2 = stack.pop(), arg1 = stack.pop();

        if (arg1.equals(SymbolType.Type.Int) && arg2.equals(SymbolType.Type.Int)) {
            stack.push(SymbolType.Boolean());
        } // ...
        } else if (arg1.equals(SymbolType.Type.Decimal) && arg2.equals(SymbolType.Type.Int)) {
            // Promote right
            right.replaceBy(new ATypeCastExpr(new ADoubleTypeSpecifier(), (PExpr) right.clone())); // ...
        } else {
            throw new IncompaitbleTypesException(node, arg1, arg2);
        }
    }
}