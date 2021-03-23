class Expr implements Token
{
  int thisId;
  Name name;
  String methodName;
  Args args;
  int intLit;
  char charLit;
  String strLit;
  float floatLit;
  boolean bool;
  Expr expr;
  Type type;
  Expr expr1;
  Expr expr2;
  Expr expr3;
  BinaryOp binOp;
  public Expr(Name name) {
    this.name = name;
    thisId = 0;
  }
  public Expr(String methodName, Args args) {
    this.methodName = methodName;
    this.args = args;
    thisId = 1;
  }
  public Expr(int i)
  {
    intLit = i;
    thisId = 2;
  }
  public Expr(char ch)
  {
    charLit = ch;
    thisId = 3;
  }
  public Expr(String i)
  {
    strLit = i;
    thisId = 4;
  }
  public Expr(float f)
  {
    floatLit = f;
    thisId = 5;
  }
  public Expr(boolean b)
  {
    bool = b;
    thisId = 6;
  }
  public Expr(Expr e, int id)
  {
    expr = e;
    thisId = id;
  }
  public Expr(Expr e, Type t, int id)
  {
    expr = e;
    type = t;
    thisId = id;
  }
  public Expr(BinaryOp b)
  {
    binOp = b;
    thisId = 12;
  }
  public Expr(Expr e1, Expr e2, Expr e3, int id)
  {
    expr1 = e1;
    expr2 = e2;
    expr3 = e3;
    thisId = id;
  }

  public String toString(int t)
  {
    String ret = "";
    if(thisId == 0) {
      ret = name.toString(t);
    } else if(thisId == 1) {
      ret = methodName + "(" + args.toString(t) + ")";
    } else if (thisId == 2) {
      ret = Integer.toString(intLit);
    } else if (thisId == 3) {
      ret = charLit+"";
    } else if (thisId == 4) {
      ret = strLit;
    } else if (thisId == 5) {
      ret = Float.toString(floatLit);
    } else if (thisId == 6) {
      ret = Boolean.toString(bool);
    } else if (thisId == 7) {
      ret = "(" + expr.toString(t) + ")";
    } else if (thisId == 8) {
      ret = "~" + expr.toString(t);
    } else if (thisId == 9) {
      ret = "-" + expr.toString(t);
    } else if (thisId == 10) {
      ret = "+" + expr.toString(t);
    } else if (thisId == 11) {
      ret = "(" + type.toString(t) + ")" + expr.toString(t);
    } else if (thisId == 12) {
      ret =  binOp.toString(t);
    } else if (thisId == 13) {
      ret = "(" + expr1.toString(t) + " ? " + expr2.toString(t) + " : " + expr3.toString(t) + ")";
    } 
    
    return ret;
  }
}
