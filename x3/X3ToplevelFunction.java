package x3;
import java.lang.StringBuilder;
import java.util.*;

public class X3ToplevelFunction extends X3ToplevelItem {
  private X3Variable name;
  private X3Context context;
  private List<X3TypeVariable> typeParameters;
  private X3Type declaredType;
  private X3Statement body;

  public X3ToplevelFunction() { }

  public X3ToplevelFunction(
      X3Variable name, X3TypeScheme s, X3Statement body) {
    this.name = name;
    this.typeParameters = s.getTypeParameters();
    this.context = s.getContext();
    this.declaredType = s.getType();
    this.body = body;
  }

  public X3Variable getName() { return name; }
  public X3Context getContext() { return context; }
  public List<X3TypeVariable> getTypeParamters() {
    return new ArrayList<X3TypeVariable>(typeParameters);
  }
  public X3Type getDeclaredType() { return declaredType; }
  public X3Statement getBody() { return body; }

  public void accept(ASTVisitor v) {
    name.accept(v);
    context.accept(v);
    Utils.acceptList(v, typeParameters);
    declaredType.accept(v);
    body.accept(v);
    v.visitX3ToplevelFunction(this);
  }

  public void tokenize(StringBuilder b) {
    b.append("fun ");
    name.tokenize(b);
    Utils.tokenizeAngleList(b, typeParameters);
    context.tokenize(b);
    b.append(": ");
    declaredType.tokenize(b);
    body.tokenize(b);
  }
}
