package x3;

class TopType extends Type {

  boolean isSubtypeOf(Type other) { return false; }

  Type getConstructibleComponent() throws UnimplementedException {
    throw new UnimplementedException();
  }

}
