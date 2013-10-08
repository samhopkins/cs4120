package x3;

class VarType extends Type {

  String v;

  boolean isSubtypeOf(Type other) { return false; }

  Type getConstructibleComponent() throws NoConstructibleComponentException {
    throw new NoConstructibleComponentException();
  }

  String getV() { return v; }

  VarType(String v) {
    this.v = v;
  }

}
