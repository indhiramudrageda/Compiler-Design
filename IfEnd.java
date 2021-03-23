class IfEnd extends Stmt implements Token
{
    Stmt stmt;
    public IfEnd(Stmt stmt)
    {
        this.stmt = stmt;
    }

    public IfEnd()
    {
        this.stmt = null;
    }

    public String toString(int t)
    {
        String tabs = "";
        for (int i = 0; i < t; ++i) tabs += "\t";
        return tabs + "else" + "\n" + stmt.toString(t+1);
    }
}
