class Program implements Token
{
  String id;
  MemberDecls memberDecls;
  public Program(String id, MemberDecls memberDecls)
  {
    this.id = id;
    this.memberDecls = memberDecls;
  }

  public String toString(int t)
  {
    return ("Program:\n" + "class " + id + "{\n" + memberDecls.toString(t+1) + "}");
  }
}
