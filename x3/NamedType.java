package x3;
import java.util.*;

class NamedType extends Type {
  String name;
  List<Type> parameters;

  boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt) throws UnimplementedException {
    throw new UnimplementedException();
  }

  Type getConstructibleComponent() throws UnimplementedException {
    throw new UnimplementedException();
  }

  NamedType(String s, List<Type> params) {
    name = s;
    parameters = new ArrayList<Type>(params);
  }

  public boolean equals(Object other) {
    if (! (other instanceof NamedType)) {
      return false;
    }
    else {
      NamedType otherT = (NamedType) other;
      return (name.equals(otherT.name) && parameters.equals(otherT.parameters));
    }
  }
}
