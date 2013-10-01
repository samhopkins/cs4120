public class X3Interface {
  public X3TypeName name;
  public List<X3TypeVariable> typeParameters;
  public X3Type superClass;
  public List<X3Function> functions;

  public X3Interface(X3TypeName name, List<X3TypeVariable> typeParameters,
      X3Type superClass, List<X3Function> functions) {
    this.name = name;
    this.typeParameters = typeParameters;
    this.superClass = superClass;
    this.functions = functions;
  }

  public X3Interface() { }
}
