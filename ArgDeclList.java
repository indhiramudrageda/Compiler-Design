class ArgDeclList implements Token {
    ArgDecl argDecl;
    ArgDeclList argDeclList;

    public ArgDeclList(ArgDecl argDecl, ArgDeclList argDeclList) {
        this.argDecl = argDecl;
        this.argDeclList = argDeclList;
    }

    public ArgDeclList(ArgDecl argDecl) {
        this.argDecl = argDecl;
        this.argDeclList = null;
    }

    public String toString(int t) {
        if(argDeclList != null) {
            return argDecl.toString(t) + ", " + argDeclList.toString(t);
        } else {
            return argDecl.toString(t);
        }
    }
}