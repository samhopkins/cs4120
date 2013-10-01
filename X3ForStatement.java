public class X3ForStatement extends X3Statement {
  public X3Variable variable;
  public X3Expression iter;
  public X3Statement body;

  public X3ForStatement(X3Variable variable, X3Expression iter, X3Statement
      body) {
    this.variable = variable;
    this.iter = iter;
    this.body = body;
  }
}
