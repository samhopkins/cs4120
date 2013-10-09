package x3;
import java.util.*;

class NamedType extends Type {
  String name;
  List<Type> parameters;

  boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt) throws UnimplementedException {
    if (this.name.equals("Iterable")) {
      return this.checkIterableSubtype(other, cctxt, kctxt);
    } else if (other instanceof IntersectionType) {
      IntersectionType otheri = (IntersectionType) other;
      return ( this.isSubtypeOf(other.t1, cctxt, kctxt) &&
          this.isSubtypeOf(other.t2, ctxt, ktxt));
    } else if (other instanceof NamedType) {
      NamedType othern = (NamedType) other;
      if (other.name.equals(this.name)) {
        // can assume here that this.parameters and other.parameters have same length
        // since we should have already done some type validation
        for (int i = 0; i < parameters.size(); i++) {
          if (!(
              parameters.get(i).isSubtypeOf(other.parameters.get(i))
              && other.parameters.get(i).isSubtypeOf(parameters.get(i)))) {
            return false;
          }
        }
        return true;
      } else {
        Type declaredSuper = cctxt.getDeclaredSuper(this);
        // do the right substitution into variables of declaredSuper
        // check declaredSuper <: other
      }
    }
  }

  Type getConstructibleComponent() throws UnimplementedException {
    throw new UnimplementedException();
  }

  NamedType(String s, List<Type> params) {
    name = s;
    parameters = new ArrayList<Type>(params);
  }

  public boolean equals(Object other) {
    if (! (other instanceof NamedType)) {
      return false;
    }
    else {
      NamedType otherT = (NamedType) other;
      return (name.equals(otherT.name) && parameters.equals(otherT.parameters));
    }
  }
}
