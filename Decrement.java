class Decrement extends Stmt implements Token
{
    Name name;
    public Decrement(Name name)
    {
        this.name = name;
    }

    public String toString(int t)
    {
        String tabs = "";
        for (int i = 0; i < t; ++i)
            tabs += "\t";
        return tabs + name.toString(t) +  "--;" + super.toString(t);
    }
}
