package x3;
import java.lang.StringBuilder;

public class X3AssignmentStatement extends X3Statement {
  private X3Variable variable;
  private X3Expression value;

  public X3AssignmentStatement(X3Variable variable, X3Expression value) {
    this.variable = variable;
    this.value = value;
  }

  public X3Variable getVariable() { return variable; }
  public X3Expression getValue() { return value; }

  public void accept(ASTVisitor v) {
    variable.accept(v);
    value.accept(v);
    v.visitX3AssignmentStatement(this);
  }

  public void tokenize(StringBuilder b) {
    variable.tokenize(b);
    b.append(":= ");
    value.tokenize(b);
    b.append("; ");
  }
}
