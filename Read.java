class Read extends Stmt implements Token
{
    ReadList readList;

    public Read(ReadList readList)
    {
        this.readList = readList;
    }

    public String toString(int t)
    {
        String tabs = "";
        for (int i = 0; i < t; ++i) tabs += "\t";
        return tabs + "read (" + readList.toString(t) + ");" + super.toString(t);
    }
}
