public abstract class X3Expression {
  private X3Type mType;

  public final X3Type getType(X3Context context) throws NoSuchTypeException {
    if (mType == null) {
      mType = this.calculateType(context);
    }
    return mType;
  }

  protected abstract X3Type calculateType(X3Context context) throws NoSuchTypeException ;
}
