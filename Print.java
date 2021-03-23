class Print extends Stmt implements Token
{
    PrintList printList;

    public Print(PrintList printList)
    {
        this.printList = printList;
    }

    public String toString(int t)
    {
        String tabs = "";
        for (int i = 0; i < t; ++i) tabs += "\t";
        return tabs + "print (" + printList.toString(t) + ");" + super.toString(t);
    }
}
