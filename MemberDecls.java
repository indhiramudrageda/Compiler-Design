class MemberDecls implements Token {
    FieldDecls fieldDecls;
    MethodDecls methodDecls;
    public MemberDecls(FieldDecls fieldDecls, MethodDecls methodDecls) {
        this.fieldDecls = fieldDecls;
        this.methodDecls = methodDecls;
    }

    public MemberDecls() {
        this.fieldDecls = null;
        this.methodDecls = null;
    }

    public String toString(int t) {
        return fieldDecls.toString(t) + methodDecls.toString(t);
    }
}