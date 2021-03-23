class PrintLine extends Stmt implements Token
{
    PrintLineList printLineList;

    public PrintLine(PrintLineList printLineList)
    {
        this.printLineList = printLineList;
    }

    public String toString(int t)
    {
        String tabs = "";
        for (int i = 0; i < t; ++i) tabs += "\t";
        return tabs + "print (" + printLineList.toString(t) + ");" + super.toString(t);
    }
}
