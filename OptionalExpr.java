class OptionalExpr implements Token {
    Expr exp;

    public OptionalExpr(Expr exp) {
        this.exp = exp;
    }

    public OptionalExpr() {
        this.exp = null;
    }

    public String toString(int t) {
        if(exp != null) {
            return " = "+ exp.toString(t);
        } else {
            return "";
        }
        
    }
}