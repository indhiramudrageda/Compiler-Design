class ArgDecls implements Token {
    ArgDeclList argDeclList;

    public ArgDecls(ArgDeclList argDeclList) {
        this.argDeclList = argDeclList;
    }

    public ArgDecls() {
        this.argDeclList = null;
    }

    public String toString(int t) {
        if(argDeclList != null) {
            return argDeclList.toString(t);
        } else {
            return "";
        }
        
    }
}