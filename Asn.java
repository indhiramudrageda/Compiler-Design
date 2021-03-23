class Asn extends Stmt implements Token
{
  Name name;
  Expr expr;

  public Asn(Name name, Expr expr)
  {
    this.name = name;
    this.expr = expr;
  }

  public String toString(int t)
  {
    String tabs = "";
    for (int i = 0; i < t; ++i)
      tabs += "\t";
    return tabs + name.toString(t) + " = " + expr.toString(t) + ";" + super.toString(t);
  }
}
