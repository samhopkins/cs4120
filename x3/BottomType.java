package x3;

class BottomType extends Type {

  boolean isSubtypeOf(Type other) { return true; }

  Type getConstructibleComponent() throws UnimplementedException {
    throw new UnimplementedException();
  }

}
