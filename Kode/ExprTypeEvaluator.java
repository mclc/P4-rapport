public class ExpressionTypeEvaluator extends DepthFirstAdapter {
    private Stack<SymbolType> stack;
    
    // Constants
    @Override
    public void outAIntegerExpr(AIntegerExpr node) {
        super.outAIntegerExpr(node);
        stack.push(SymbolType.Int());
    }

    @Override
    public void outADecimalExpr(ADecimalExpr node) {
        super.outADecimalExpr(node);
        stack.push(SymbolType.Decimal());
    }

    @Override
    public void outATrueExpr(ATrueExpr node) {
        super.outATrueExpr(node);
        stack.push(SymbolType.Boolean());
    }

    @Override
    public void outAFalseExpr(AFalseExpr node) {
        super.outAFalseExpr(node);
        stack.push(SymbolType.Boolean());
    }
}