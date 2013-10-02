import java.util.*;

public class X3TypeName extends X3Type {
  private String name;
  private List<X3Type> typeArguments;

  public X3TypeName(String name, List<X3Type> typeArguments) {
    this.name = name;
    this.typeArguments = typeArguments;
  }

  public String getName() {
    return name;
  }

  public List<X3Type> getTypes() {
    return new ArrayList<X3Type>(typeArguments);
  }
}
