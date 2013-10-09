package x3;
import java.util.*;

class VarType extends Type {

  String v;

  boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt) {
    boolean toReturn = false;
    toReturn = toReturn || this.equals(other);
    toReturn = toReturn || (other instanceof TopType);
    if (other instanceof IntersectionType) {
      IntersectionType otheri = (IntersectionType) other;
      toReturn = toReturn || ( this.isSubtypeOf(otheri.t1, cctxt, kctxt) 
          && this.isSubtypeOf(otheri.t2, cctxt, kctxt));
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

  Type substitute (List<Type> types, KindContext vars) {
    int index = vars.vars.indexOf(this);
    if (index < 0) { return this; }
    else {
      return types.get(index);
    }
  }

}
