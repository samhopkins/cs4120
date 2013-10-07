package x3;
import java.lang.StringBuilder;

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

  public void tokenize(StringBuilder b) {
    b.append(variable);
    b.append(' ');
  }
}
