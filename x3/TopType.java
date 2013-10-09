package x3;

class TopType extends Type {

  boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt) { return false; }

  Type getConstructibleComponent() throws UnimplementedException {
    throw new UnimplementedException();
  }

}
