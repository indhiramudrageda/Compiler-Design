class MethodCall extends Stmt implements Token
{
    String id;
    Args args;
    public MethodCall(String id, Args args)
    {
        this.id = id;
        this.args = args;
    }

    public String toString(int t)
    {
        String tabs = "";
        for (int i = 0; i < t; ++i) tabs += "\t";
        return tabs + id + "(" + args.toString(t) + ");" + super.toString(t);
    }
}
