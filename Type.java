class Type implements Token {
    String type;
    public Type(String type) {
        this.type = type;
    }

    public String toString(int t) {
        return type;
    }
}