package x3;

class IntersectionType {
  Type t1;
  Type t2;

  boolean isSubtypeOf(Type other) throws UnimplementedException {
    return t1.isSubtypeOf(other) && t2.isSubtypeOf(other);
  }

  Type getConstructibleComponent() throws UnimplementedException { throw new UnimplementedException(); }
}

