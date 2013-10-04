import java.lang.StringBuilder;
public class X3TypeTop extends X3Type {
  public void accept(ASTVisitor v) {
    v.visitX3TypeTop(this);
  }

  public void tokenize(StringBuilder b) {
    b.append("Thing ");
  }
}
