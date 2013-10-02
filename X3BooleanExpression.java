public class X3BooleanExpression extends X3Expression {
  private boolean value;
  
  public X3BooleanExpression(boolean value) {
    this.value = value;
  }

  public boolean getValue() {
    return value;
  }

  protected X3Type calculateType(X3Context context) throws NoSuchTypeException {
    throw new NoSuchTypeException();
  }

  public void accept(ASTVisitor v) {
    v.visitX3BooleanExpression(this);
  }
}


