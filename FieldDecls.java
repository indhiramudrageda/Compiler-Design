class FieldDecls implements Token {
    FieldDecl fielddecl;
    FieldDecls fielddecls;

    public FieldDecls(FieldDecl fielddecl, FieldDecls fielddecls) {
        this.fielddecl = fielddecl;
        this.fielddecls = fielddecls;
    }

    public FieldDecls() {
        this.fielddecl = null;
        this.fielddecls = null;
    }

    public String toString(int t) {
        if(fielddecl != null) {
            return fielddecl.toString(t) + fielddecls.toString(t);
        } else {
            return "";
        }
    }
}