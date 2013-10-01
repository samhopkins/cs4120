public class X3ReturnStatement extends X3Statement {
  public X3Expression toReturn;

  public X3ReturnStatement(X3Expression toReturn) {
    this.toReturn = toReturn;
  }
}
