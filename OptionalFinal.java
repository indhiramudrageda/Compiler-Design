class OptionalFinal implements Token {
    String optfinal;

    public OptionalFinal(String str) {
        optfinal = str;
    }

    public String toString(int t) {
        return optfinal.equals("") ? optfinal : optfinal+" ";
    }
} 