class PrintLineList implements Token
{
    PrintList printList;

    public PrintLineList(PrintList printList)
    {
        this.printList = printList;
    }

    public PrintLineList()
    {
        this.printList = null;
    }

    public String toString(int t)
    {
        if(printList == null) {
            return "";
        } else {
            return printList.toString(t);
        }
    }
}
