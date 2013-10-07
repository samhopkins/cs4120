package x3;

public class X3IfStatement extends X3Statement {
  private X3Expression test;
  private X3Statement ifBranch;
  private X3Statement elseBranch;

  public X3IfStatement(X3Expression test, X3Statement ifBranch, X3Statement
      elseBranch) {
    this.test = test;
    this.ifBranch = ifBranch;
    this.elseBranch = elseBranch;
  }

  public X3Expression getTest() { return test; }
  public X3Statement getIfBranch() { return ifBranch; }
  public X3Statement getElseBranch() { return elseBranch; }

  public X3IfStatement() { }

  public void accept(ASTVisitor v) {
    test.accept(v);
    ifBranch.accept(v);
    elseBranch.accept(v);
    v.visitX3IfStatement(this);
  }

  public void tokenize(StringBuilder b) {
    b.append("if ( ");
    test.tokenize(b);
    b.append(") ");
    ifBranch.tokenize(b);
    b.append("else ");
    elseBranch.tokenize(b);
  }
}
