class PrintList implements Token {
    Expr expr;
    PrintList printList;

    public PrintList(Expr expr, PrintList printList) {
        this.expr = expr;
        this.printList = printList;
    }

    public PrintList(Expr expr) {
        this.expr = expr;
    }

    public String toString(int t) {
        if(printList == null) {
            return expr.toString(t);
        } else {
            return expr.toString(t) + ", " + printList.toString(t);
        }
    }
}