class Return extends Stmt implements Token
{
    ReturnVal returnVal;
    public Return(ReturnVal returnVal)
    {
        this.returnVal = returnVal;
    }

    public String toString(int t)
    {
        String tabs = "";
        for (int i = 0; i < t; ++i)
            tabs += "\t";
        return tabs + "return " + returnVal.toString(t) + ";" + super.toString(t);
    }
}
