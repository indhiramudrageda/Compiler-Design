class FieldDecl implements Token {
    OptionalFinal optionalFinal;
    Type type;
    String id;
    OptionalExpr optionalExpr;
    int size;
    public FieldDecl(OptionalFinal optionalFinal, Type type, String id, OptionalExpr optionalExpr) {
        this.optionalFinal = optionalFinal;
        this.type = type;
        this.id = id;
        this.optionalExpr = optionalExpr;
        this.size = -1;
    }

    public FieldDecl(Type type, String id, OptionalExpr optionalExpr) {
        this.optionalFinal = new OptionalFinal("");
        this.type = type;
        this.id = id;
        this.optionalExpr = optionalExpr;
        this.size = -1;
    }

    public FieldDecl(Type type, String id, int size) {
        this.id = id;
        this.type = type;
        this.size = size;
    }

    public String toString(int t) {
        String tabs = "";
        for (int i = 0; i < t; ++i) tabs += "\t";
        if(size == -1) {
            return tabs + optionalFinal.toString(t) + type.toString(t) + " " + id + optionalExpr.toString(t) +";" + "\n";
        } else {
            return tabs + type.toString(t) + " " + id + "[" + size + "];" + "\n";
        }
    }
}