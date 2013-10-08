package x3;
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
  public List<X3TypeVariable> getTypeParameters() { 
    return new ArrayList<X3TypeVariable>(typeParameters);
  }
  public X3Type getSuperType() { return superType; }
  public X3Context getConstructorArguments() { return constructorArguments; }
  public List<X3Method> getMethods() { return methods; }
  public List<X3Statement> getConstructorBody() { return constructorBody; }
  public List<X3Expression> getSuperCallArguments() { return superCallArguments; }

  public void accept(ASTVisitor v) {
    name.accept(v);
    Utils.acceptList(v, typeParameters);
    superType.accept(v);
    constructorArguments.accept(v);
    Utils.acceptList(v, methods);
    Utils.acceptList(v, constructorBody);
    Utils.acceptList(v, superCallArguments);
    v.visitX3Class(this);
  }

  public void tokenize(StringBuilder b) {
    b.append("class ");
    // if we call name.tokenize we get an extra < > pair
    b.append(name.getName());
    b.append(" ");
    Utils.tokenizeAngleList(b, typeParameters);
    constructorArguments.tokenize(b);
    b.append("extends ");
    superType.tokenize(b);
    b.append("{ ");
    for (X3Statement s : constructorBody) {
      s.tokenize(b);
    }
    b.append("super ");
    Utils.tokenizeParenList(b, superCallArguments);
    b.append("; ");
    for (X3Method m : methods) {
      m.tokenize(b);
    }
    b.append("} ");
  }
}