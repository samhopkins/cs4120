package x3;
import java.util.*;

class BottomType extends Type {

  boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt) { return true; }

  Type getConstructibleComponent() throws UnimplementedException {
    throw new UnimplementedException();
  }

  Type substitute(List<Type> types, KindContext vars) { return new BottomType(); }

}
