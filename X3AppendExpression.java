public class X3AppendExpression extends X3Expression {
  private X3Expression left;
  private X3Expression right;

  public X3AppendExpression(X3Expression left, X3Expression right) {
    this.left = left;
    this.right = right;
  }

  public X3Expression getLeft() {
    return left;
  }

  public X3Expression right() {
    return right;
  }

  protected X3Type calculateType(X3Context context) throws NoSuchTypeException {
    throw new NoSuchTypeException();
  }
}
