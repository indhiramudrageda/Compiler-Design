class MethodDecl implements Token {
    ReturnType type;
    String id;
    ArgDecls argDecls;
    FieldDecls fielddecls;
    Stmts stmts;
    OptionalSemi optSemi;
    public MethodDecl(ReturnType type, String id, ArgDecls argDecls, FieldDecls fielddecls, Stmts stmts, OptionalSemi optSemi) {
        this.type = type;
        this.id = id;
        this.argDecls = argDecls;
        this.fielddecls = fielddecls;
        this.stmts = stmts;
        this.optSemi = optSemi;
    }

    public String toString(int t) {
        String tabs = "";
        for (int i = 0; i < t; ++i) tabs += "\t";
        return tabs + type.toString(t) + " " + id +"(" +argDecls.toString(t) + ")" + "{\n" +fielddecls.toString(t+1)+ stmts.toString(t+1) + tabs + "}" + optSemi.toString(t) + "\n";
    }
}