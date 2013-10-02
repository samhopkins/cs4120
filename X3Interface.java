import java.util.*;

public class X3Interface extends X3ToplevelItem {
  private X3TypeName name;
  private List<X3TypeVariable> typeParameters;
  private X3Type superType;
  private List<X3Method> methods;

  public X3Interface(X3TypeName name, List<X3TypeVariable> typeParameters,
      X3Type superType, List<X3Method> methods) {
    this.name = name;
    this.typeParameters = typeParameters;
    this.superType = superType;
    this.methods = methods;
  }

  public X3TypeName getName() { return name; }
  public List<X3TypeName> getTypeParamters() { return typeParamters; }
  public X3Type getSuperType() { return superType; }
  public List<X3Method> getMethods() { return methods; }
}
