public class X3WhileStatement extends X3Statement {
  private X3Expression test;
  private X3Statement body;

  public X3WhileStatement(X3Expression test, X3Statement body) {
    this.test = test;
    this.body = body;
  }

  public X3Expression getTest() { return test; }
  public X3Statement getBody() { return body; }
}
