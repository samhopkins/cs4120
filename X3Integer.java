public class X3Integer extends X3Expression {
  private int value;

  public X3Integer(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  protected X3Type calculateType(X3Context context) throws NoSuchTypeException {
    throw new NoSuchTypeException();
  }
}
