package x3;
import java.util.*;

class TopType extends Type {

  boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt) { return false; }

  Type getConstructibleComponent() throws UnimplementedException {
    throw new UnimplementedException();
  }

  Type substitute(List<Type> types, KindContext vars) {
    return new TopType();
  }

}
