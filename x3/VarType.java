package x3;

class VarType extends Type {

  String v;

  boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt) {
    return (this.equals(other) || (other instanceof TopType));
  }

  Type getConstructibleComponent() throws NoConstructibleComponentException {
    throw new NoConstructibleComponentException();
  }

  String getV() { return v; }

  VarType(String v) {
    this.v = v;
  }

  public boolean equals(Object other) {
    if (!(other instanceof VarType)) {
      return false;
    } else {
      return v.equals(((VarType) other).v);
    }
  }

}
