package x3;

public class X3MethodImpl extends X3Method {
  private X3Statement body;

  public X3MethodImpl(
      X3Variable name, X3TypeScheme s, X3Statement body) {
    super(name, s.getContext(), s.getTypeParameters(), s.getType());
    this.body = body;
  }

  public X3Statement getBody() { return body; }

  public void accept(ASTVisitor v) {
    body.accept(v);
    super.accept(v);
  }

  public void tokenize(StringBuilder b) {
    super.tokenize(b);
    body.tokenize(b);
  }
}
