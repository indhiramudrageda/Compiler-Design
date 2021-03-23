class ReadList implements Token {
    Name name;
    ReadList readList;

    public ReadList(Name name, ReadList readList) {
        this.name = name;
        this.readList = readList;
    }

    public ReadList(Name name) {
        this.name = name;
    }

    public String toString(int t) {
        if(readList == null) {
            return name.toString(t);
        } else {
            return name.toString(t) + ", " + readList.toString(t);
        }
    }
}