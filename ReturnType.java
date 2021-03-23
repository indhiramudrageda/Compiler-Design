class ReturnType implements Token {
    Type type;

    public ReturnType(Type type) {
        this.type = type;
    }

    public ReturnType(String type) {
        this.type = new Type(type);
    }

    public String toString(int t) {
        return type.toString(t);
    }
}