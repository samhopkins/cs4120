public class X3ForStatement extends X3Statement {
  private X3Variable variable;
  private X3Expression iter;
  private X3Statement body;

  public X3ForStatement(X3Variable variable, X3Expression iter, X3Statement
      body) {
    this.variable = variable;
    this.iter = iter;
    this.body = body;
  }

  public X3Variable getVariable() { return variable; }
  public X3Expression getIter() { return iter; }
  public X3Statement getBody() { return body; }

  public void accept(ASTVisitor v) {
    variable.accept(v);
    iter.accept(v);
    body.accept(v);
    v.visitX3ForStatement(this);
  }

  public void tokenize(StringBuilder b) {
    b.append("for ( ");
    variable.tokenize(b);
    b.append("in ");
    iter.tokenize(b);
    b.append
}
