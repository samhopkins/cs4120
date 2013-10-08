package x3;

public class X3TypeIntersection extends X3Type {
  private X3Type t1;
  private X3Type t2;

  public X3TypeIntersection(X3Type t1, X3Type t2) {
    this.t1 = t1;
    this.t2 = t2;
  }

  public X3Type getT1() {
    return t1;
  }

  public X3Type getT2() {
    return t2;
  }

  public void accept(ASTVisitor v) {
    t1.accept(v);
    t2.accept(v);
    v.visitX3TypeIntersection(this);
  }

  public void tokenize(StringBuilder b) {
    t1.tokenize(b);
    b.append("& ");
    t2.tokenize(b);
  }
}