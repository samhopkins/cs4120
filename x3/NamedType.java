package x3;
import java.util.*;

class NamedType extends Type {
  String name;
  List<Type> parameters;

  boolean isSubtypeOf(Type other) throws UnimplementedException {
    throw new UnimplementedException();
  }

  Type getConstructibleComponent() throws UnimplementedException {
    throw new UnimplementedException();
  }

  NamedType(String s, List<Type> params) {
    name = s;
    parameters = new ArrayList<Type>(params);
  }
}
