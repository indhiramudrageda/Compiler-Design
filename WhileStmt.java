class WhileStmt extends Stmt implements Token
{
    Expr expr;
    Stmt stmt;

    public WhileStmt(Expr expr, Stmt stmt)
    {
        this.expr = expr;
        this.stmt = stmt;
    }

    public String toString(int t)
    {
        String tabs = "";
        for (int i = 0; i < t; ++i)
            tabs += "\t";
        return tabs + "while(" + expr.toString(t) + ") " + stmt.toString(t) + super.toString(t);
    }
}
