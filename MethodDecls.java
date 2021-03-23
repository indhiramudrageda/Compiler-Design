class MethodDecls implements Token {
    MethodDecl methodDecl;
    MethodDecls methodDecls;
    public MethodDecls(MethodDecl methodDecl, MethodDecls methodDecls) {
        this.methodDecl = methodDecl;
        this.methodDecls = methodDecls;
    }

    public MethodDecls() {
        this.methodDecl = null;
        this.methodDecls = null;
    }

    public String toString(int t) {
        if(methodDecl != null) {
            return methodDecl.toString(t) + methodDecls.toString(t);
        } else {
            return "";
        }
        
    }
 }