package x3;

public class X3TypeBottom extends X3Type {
  public void accept(ASTVisitor v) {
    v.visitX3TypeBottom(this);
  }

  public void tokenize(StringBuilder b) {
    b.append("Nothing ");
  }

}
