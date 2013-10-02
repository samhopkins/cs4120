public class X3MethodImpl extends X3Method {
  private X3Statement body;

  public X3MethodImpl() { }

  public X3MethodImpl(
      X3Variable name, X3TypeScheme s, X3Statement body) {
    this.name = name;
    this.typeParameters = s.typeParameters;
    this.context = s.context;
    this.type = s.type;
    this.body = body;
  }

  public X3Statement getBody() { return body; }
}
