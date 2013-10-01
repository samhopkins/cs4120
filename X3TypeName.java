import java.util.*;

public class X3TypeName extends X3Type {
  private String name;
  public List<X3Type> typeArguments;

  public X3TypeName(String name) {
    this.name = name;
    this.typeArguments = new ArrayList<X3Type>();
  }

  public String getName() {
    return name;
  }

  public List<X3Type> getTypes() {
    return typeArguments;
  }

  public void addTypeArgument(X3Type arg) {
    typeArguments.add(arg);
  }
}
