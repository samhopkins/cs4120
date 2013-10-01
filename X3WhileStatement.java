public class X3WhileStatement extends X3Statement {
  public X3Expression test;
  public X3Statement body;

  public X3WhileStatement(X3Expression test, X3Statement body) {
    this.test = test;
    this.body = body;
  }
}
