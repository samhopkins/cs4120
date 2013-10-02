public class X3MethodDecl extends X3Method {
  
  public X3MethodDecl(X3Variable name, X3TypeScheme s) {
    super(name, s.getContext(), s.getTypeParameters(), s.getType());
  }

}
