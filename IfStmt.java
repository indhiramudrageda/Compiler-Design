class IfStmt extends Stmt implements Token
{
    Expr expr;
    Stmt stmt;
    IfEnd ifEnd;
    public IfStmt(Expr expr, Stmt stmt, IfEnd ifEnd)
    {
        this.expr = expr;
        this.stmt = stmt;
        this.ifEnd = ifEnd;
    }

    public String toString(int t)
    {
        String tabs = "";
        for (int i = 0; i < t; ++i) tabs += "\t";
        return tabs + "if(" + expr.toString(t) + ") " + "\n" + stmt.toString(t+1) + ifEnd.toString(t);
    }
}
