import java.util.*;

public class X3Method extends ASTNode {
  private X3Variable name;
  private X3Context context;
  private List<X3TypeVariable> typeParameters;
  private X3Type declaredType;

  protected X3Method(X3Variable name, X3Context context, List<X3TypeVariable>
      typeParameters, X3Type type) {
    this.name = name;
    this.typeParameters = typeParameters;
    this.context = context;
    this.declaredType= type;
  }


  public X3Variable getName() { return name; }
  public X3Context getContext() { return context; }
  public List<X3TypeVariable> getTypeParamters() { return typeParameters; }
  public X3Type getDeclaredType() { return declaredType; }

  public void accept(ASTVisitor v) {
    name.accept(v);
    context.accept(v);
    declaredType.accept(v);
    v.visitX3Method(this);
  }
}
