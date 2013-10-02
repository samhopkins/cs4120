import java.util.*;

public class X3Class extends X3ToplevelItem {
  private X3TypeName name;
  private List<X3TypeVariable> typeParameters;
  private X3Type superType;
  private X3Context constructorArguments;
  private X3Constructor constructor;
  private List<X3Method> methods;

  public X3Class() { 
    methods = new ArrayList<X3Method>();
  }

  public X3Class(X3TypeName name, List<X3TypeVariable> typeParameters,
      X3Type superType, X3Context constructorArguments, X3Constructor
      constructor, List<X3Method> methods) {
    this.name = name;
    this.typeParamters = typeParamters;
    this.superType = superType;
    this.constructorArguments = constructorArguments;
    this.constructor = constructor;
    this.methods = methods;
  }

  public X3TypeName getName() { return name; }
  public List<X3TypeVariable> getTypeParamters() { return typeParamters; }
  public X3Type getSuperType() { return superType; }
  public X3Context getConstructorArguments() { return constructorArguments; }
  public X3Constructor getConstructor() { return constructor; }
  public List<X3Method> getMethods() { return methods; }
}
