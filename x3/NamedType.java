package x3;
import java.util.*;

class NamedType extends Type {
  String name;
  List<Type> parameters;

  NamedType(String name, List<Type> params) {
    this.name = name;
    this.parameters = new ArrayList<Type>(params);
  }

  boolean checkIterableSubtype(NamedType other, ClassContext cctxt, KindContext kctxt) 
      throws NoSuchTypeException {
    return this.parameters.get(0).isSubtypeOf(other.parameters.get(0), cctxt, kctxt);
  }

  boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt) 
      throws NoSuchTypeException {
    if (other instanceof TopType) {
      return true;
    } else if (other instanceof IntersectionType) {
      IntersectionType otheri = (IntersectionType) other;
      return ( this.isSubtypeOf(otheri.t1, cctxt, kctxt) &&
          this.isSubtypeOf(otheri.t2, cctxt, kctxt));
    } else if (other instanceof NamedType) {
      NamedType othern = (NamedType) other;
      if (othern.name.equals(this.name)) {
        if (this.name.equals("Iterable")) {
          return this.checkIterableSubtype(othern, cctxt, kctxt);
        } else {
          // can assume here that this.parameters and other.parameters have same length
          // since we should have already done some type validation
          for (int i = 0; i < parameters.size(); i++) {
            if (!(
                parameters.get(i).isSubtypeOf(othern.parameters.get(i), cctxt, kctxt)
                && othern.parameters.get(i).isSubtypeOf(parameters.get(i), cctxt, kctxt))) {
              return false;
            }
          }
          return true;
        }
      } else {
        Type declaredSuper = cctxt.getDeclaredSuper(this);
        KindContext myKindDecl = cctxt.getKindDecl(this);
        Type substituted = declaredSuper.substitute(this.parameters, myKindDecl);
        return substituted.isSubtypeOf(othern, cctxt, kctxt);
      }
    }
    return false;
  }

  Type getConstructibleComponent() throws UnimplementedException {
    throw new UnimplementedException();
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

  Type substitute(List<Type> types, KindContext vars) {
    List<Type> newParams = new ArrayList<Type>();
    for (Type t : parameters) {
      newParams.add(t.substitute(types, vars));
    }
    return new NamedType(this.name, newParams);
  }

  Type isValidConstructible(ClassContext cctxt, KindContext kctxt) throws
      NoSuchTypeException {
    ClassScheme scheme = cctxt.getScheme(this);
    if (scheme == null) { return null; }
    for (Type param : parameters) {
      if (!(param.isValid(cctxt, kctxt))) { return null; }
    }
    if (parameters.size() != scheme.kinds.size()) { return null; }
    if (scheme.isInterface()) { return new TopType(); }
    else { return this; }
  }

  boolean isValid(ClassContext cctxt, KindContext kctxt) throws
      NoSuchTypeException {
    Type res = this.isValidConstructible(cctxt, kctxt);
    if (res == null) { return false; }
    else { return true; }
  }
}
