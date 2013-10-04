import java.lang.StringBuilder;

public class X3VariableExpression extends X3Expression {
  private X3Variable variable;

  public X3VariableExpression(X3Variable variable) {
    this.variable = variable;
  }

  public X3Variable getVariable() {
    return variable;
  }

  protected X3Type calculateType(X3Context context) throws NoSuchTypeException {
    throw new NoSuchTypeException();
  }

  public void accept(ASTVisitor v) {
    variable.accept(v);
    v.visitX3VariableExpression(this);
  }

  public void tokenize(StringBuilder b) {
    variable.tokenize(b);
  }
}
