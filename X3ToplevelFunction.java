import java.util.*;

public class X3ToplevelFunction extends X3ToplevelItem {
  public X3Variable name;
  public X3Context context;
  public List<X3TypeVariable> typeParamters;
  public X3Type type;
  public X3Statement body;

  public X3ToplevelFunction() { }

  public X3ToplevelFunction(
      X3Variable name, X3TypeScheme s, X3Statement body) {
    this.name = name;
    this.typeParameters = s.typeParameters;
    this.context = s.context;
    this.type = s.type;
    this.body = body;
  }
}
