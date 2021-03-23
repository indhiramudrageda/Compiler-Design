class Args implements Token {
    Expr expr;
    Args args;

    public Args(Expr expr, Args args) {
        this.expr = expr;
        this.args = args;
    }

    public Args(Expr expr) {
        this.expr = expr;
        this.args = null;
    }

    public Args() {
        this.expr = null;
        this.args = null;
    }

    public String toString(int t) {
        if(args != null) {
            return expr.toString(t) + ", " + args.toString(t);
        } else if(expr != null) {
            return expr.toString(t);
        } else {
            return "";
        }
    }
}