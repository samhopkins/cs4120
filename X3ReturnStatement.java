public class X3ReturnStatement extends X3Statement {
  private X3Expression toReturn;

  public X3ReturnStatement(X3Expression toReturn) {
    this.toReturn = toReturn;
  }

  public X3Expression getToReturn() { return toReturn; }
}
