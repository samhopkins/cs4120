public class X3AssignmentStatement extends X3Statement {
  private X3Variable variable;
  private X3Expression value;

  public X3AssignmentStatement(X3Variable variable, X3Expression value) {
    this.variable = variable;
    this.value = value;
  }

  public X3Variable getVariable() { return variable; }
  public X3Expression getValue() { return value; }
}
