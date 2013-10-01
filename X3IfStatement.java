public class X3IfStatement extends X3Statement {
  public X3Expression test;
  public X3Statement ifBranch;
  public X3Statement elseBranch;

  public X3IfStatement(X3Expression test, X3Statement ifBranch, X3Statement
      elseBranch) {
    this.test = test;
    this.ifBranch = ifBranch;
    this.elseBranch = elseBranch;
  }

  public X3IfStatement() { }
}
