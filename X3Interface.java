public class X3Interface extends X3ToplevelItem {
  public X3TypeName name;
  public List<X3TypeVariable> typeParameters;
  public X3Type superType;
  public List<X3Method> methods;

  public X3Interface(X3TypeName name, List<X3TypeVariable> typeParameters,
      X3Type superType, List<Method> methods) {
    this.name = name;
    this.typeParameters = typeParameters;
    this.superType = superType;
    this.methods = methods;
  }

  public X3Interface() { }
}
