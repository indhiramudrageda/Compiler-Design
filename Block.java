class Block extends Stmt implements Token
{
    FieldDecls fieldDecls;
    Stmts stmts;
    OptionalSemi optionalSemi;
    public Block(FieldDecls fieldDecls, Stmts stmts, OptionalSemi optionalSemi)
    {
        this.fieldDecls = fieldDecls;
        this.stmts = stmts;
        this.optionalSemi = optionalSemi;
    }

    public String toString(int t)
    {
        String tabs = "";
        for (int i = 0; i < t; ++i) tabs += "\t";
        return tabs + "{\n" + fieldDecls.toString(t+1) + stmts.toString(t+1) + tabs + "}" + optionalSemi.toString(t) + super.toString(t);
    }
}
