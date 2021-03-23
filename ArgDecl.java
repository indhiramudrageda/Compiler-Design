class ArgDecl implements Token {
    Type type;
    String id;
    boolean isArray;

    public ArgDecl(Type type, String id, boolean isArray) {
        this.type = type;
        this.id = id;
        this.isArray = isArray;
    }

    public String toString(int t) {
        if(isArray) {
            return type.toString(t) + id + "[]";
        } else {
            return type.toString(t) + id + "";
        }
        
    }
}