package x3;
import java.util.*;

class IntersectionType extends Type {
  Type t1;
  Type t2;

  IntersectionType(Type t1, Type t2) {
    this.t1 = t1;
    this.t2 = t2;
  }

  boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt) 
      throws NoSuchTypeException {
    return t1.isSubtypeOf(other, cctxt, kctxt) || t2.isSubtypeOf(other, cctxt, kctxt);
  }

  Type getConstructibleComponent() throws UnimplementedException { throw new UnimplementedException(); }

  Type substitute(List<Type> types, KindContext vars) {
    return new IntersectionType(t1.substitute(types, vars), t2.substitute(types, vars));
  }
}

