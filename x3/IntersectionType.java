package x3;
import java.util.*;

class IntersectionType extends Type {
  Type t1;
  Type t2;

  IntersectionType(Type t1, Type t2) {
    this.t1 = t1;
    this.t2 = t2;
  }

  boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt) 
      throws NoSuchTypeException {
    return t1.isSubtypeOf(other, cctxt, kctxt) || t2.isSubtypeOf(other, cctxt, kctxt);
  }

  Type getConstructibleComponent() throws UnimplementedException { throw new UnimplementedException(); }

  Type substitute(List<Type> types, KindContext vars) {
    return new IntersectionType(t1.substitute(types, vars), t2.substitute(types, vars));
  }

  Type isValidConstructible(ClassContext cctxt, KindContext kctxt) {
    Type t1constructible = t1.isValidConstructible(cctxt, kctxt);
    Type t2constructible = t2.isValidConstructible(cctxt, kctxt);

    if (t1 == null || t2 == null || !(Utils.isTopLike(t2))) {
      return null;
    }
    Type join = t1.join(t2);
    if (!(isTopLike(join))) { return null; }

    // check no overlapping method names, which requires types to get all their methods under
    // current context, which requires typechecking of method signatures.

    return t1constructible;
  }

  boolean isValid(ClassContext cctxt, KindContext kctxt) {
    Type c = this.isValidConstructible(cctxt, kctxt);
    return (c != null);
  }

  Type join(Type other) {
    Type newt1 = t1.join(other, cctxt, kctxt);
    Type newt2 = t2.join(other, cctxt, kctxt);
    return new IntersectionType(newt1, newt2);
  }

  boolean collapsesToTop() {
    if (t1 instanceof TopType && t2 instanceof TopType) {
      return true;
    } else if (t1 instanceof TopType) {
      if (t2 instanceof IntersectionType) {
        return t2.collapsesToTop();
      } else {
        return false;
      }
    } else if (t2 instanceof TopType) {
      if (t1 instanceof IntersectionType) {
        return t1.collapsesToTop();
      } else {
        return false;
      }
    } else if (t1 instanceof IntersectionType && t2 instanceof IntersectionType) {
      return t1.collapsesToTop() && t2.collapsesToTop();
    } else {
      return false;
    }
  }
}
