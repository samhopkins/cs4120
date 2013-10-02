import java.util.*;

public abstract class X3Method {
  private X3Variable name;
  private X3Context context;
  private List<X3TypeVariable> typeParameters;
  private X3Type type;

  public X3Variable getName() { return name; }
  public X3Context getContext() { return context; }
  public List<X3TypeVariable> getTypeParamters() { return typeParameters; }
  public X3Type getType() { return type; }
}
