package x3;

class IntersectionType {
  Type t1;
  Type t2;

  boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt) throws UnimplementedException {
    return t1.isSubtypeOf(other, cctxt, kctxt) && t2.isSubtypeOf(other, cctxt, kctxt);
  }

  Type getConstructibleComponent() throws UnimplementedException { throw new UnimplementedException(); }
}

