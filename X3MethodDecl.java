public class X3MethodDecl extends X3Method {
  
  public X3MethodDecl() { }

  public X3MethodDecl(X3Variable name, X3TypeScheme s) {
    this.name = name;
    this.typeParameters = s.typeParameters;
    this.context = s.context;
    this.type = s.type;
  }
}
