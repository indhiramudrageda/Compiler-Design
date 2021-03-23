class ReturnVal implements Token {
    Expr expr;

    public ReturnVal(Expr expr) {
        this.expr = expr;
    }

    public ReturnVal() {
        this.expr = null;
    }

    public String toString(int t) {
        if(expr != null) {
            return expr.toString(t);
        } else {
            return "";
        }
    }

}