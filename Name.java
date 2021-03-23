class Name implements Token {
    String id;
    Expr expr;

    public Name(String id) {
        this.id = id;
    }

    public Name(String id, Expr expr) {
        this.id = id;
        this.expr = expr;
    }

    public String toString(int t) {
        if(expr == null) {
            return id;
        } else {
            return id + "[" + expr.toString(t) + "]";
        }
    }
}