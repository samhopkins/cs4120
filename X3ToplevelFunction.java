import java.util.*;

public class X3ToplevelFunction extends X3ToplevelItem {
  private X3Variable name;
  private X3Context context;
  private List<X3TypeVariable> typeParamters;
  private X3Type declaredType;
  private X3Statement body;

  public X3ToplevelFunction() { }

  public X3ToplevelFunction(
      X3Variable name, X3TypeScheme s, X3Statement body) {
    this.name = name;
    this.typeParameters = s.typeParameters;
    this.context = s.context;
    this.type = s.type;
    this.body = body;
  }

  public X3Variable getName() { return name; }
  public X3Context getContext() { return context; }
  public List<X3TypeVariable> getTypeParamters {
    return new ArrayList<X3TypeVariable>(typeParamters);
  }
  public X3Type getDeclaredType() { return declaredType; }
  public X3Statement getBody() { return body; }
}
