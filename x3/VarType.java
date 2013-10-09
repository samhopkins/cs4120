package x3;

class VarType extends Type {

  String v;

  boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt) {
    boolean toReturn = false;
    toReturn = toReturn || this.equals(other);
    toReturn = toReturn || (other instanceof TopType);
    if (other instanceof IntersectionType) {
      IntersectionType otheri = (IntersectionType) other;
      toReturn = toReturn || ( this.isSubtypeOf(other.t1, cctxt, kctxt) 
          && this.isSubtypeOf(other.t2, ctxt, ktxt));
    }
    return toReturn;
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
