import java.util.*;

public class X3Class extends X3ToplevelItem {
  private X3TypeName name;
  private List<X3TypeVariable> typeParameters;
  private X3Type superType;
  private X3Context constructorArguments;
  private List<X3Method> methods;
  private List<X3Statement> constructorBody;
  private List<X3Expression> superCallArguments;

  public X3Class(X3TypeName name, List<X3TypeVariable> typeParameters,
      X3Type superType, X3Context constructorArguments, List<X3Statement>
      constructorBody, List<X3Expression> superCallArguments, List<X3Method>
      methods) {
    this.name = name;
    this.typeParameters = typeParameters;
    this.superType = superType;
    this.constructorArguments = constructorArguments;
    this.constructorBody = constructorBody;
    this.superCallArguments = superCallArguments;
    this.methods = methods;
  }

  public X3TypeName getName() { return name; }
  public List<X3TypeVariable> getTypeParamters() { 
    return new ArrayList<X3TypeVariable>(typeParameters);
  }
  public X3Type getSuperType() { return superType; }
  public X3Context getConstructorArguments() { return constructorArguments; }
  public List<X3Method> getMethods() { return methods; }
  public List<X3Statement> getConstructorBody() { return constructorBody; }
  public List<X3Expression> getSuperCallArguments() { return superCallArguments; }

  public void accept(ASTVisitor v) {
    name.accept(v);
    superType.accept(v);
    constructorArguments.accept(v);
    v.visitX3Class(this);
  }
}
