public class X3TypeVariable extends X3Type {
  private String variable;

  public X3TypeVariable(String variable) {
    this.variable = variable;
  }

  public String getVariable() {
    return variable;
  }

  public void accept(ASTVisitor v) {
    v.visitX3TypeVariable(this);
  }
}
