class OptionalSemi implements Token {
    String optSemi;

    public OptionalSemi(String optSemi) {
        this.optSemi = optSemi;
    }

    public String toString(int t) {
        return optSemi;
    }
}