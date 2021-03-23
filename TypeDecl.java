class TypeDecl implements Token {

    Type type;
    String id;
    public TypeDecl(Type type, String id) {
        this.type = type;
        this.id = id;
    }

    public String toString(int t) {
        return type.toString(t) + " " + id;
    }
}