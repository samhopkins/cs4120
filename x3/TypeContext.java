package x3;

import java.util.*;

class TypeContext {
  Map<Name, Type> types;

  TypeContext() {
    types = new HashMap<Name, Type>();
  }

  TypeContext add(Name n, Type t) {
    TypeContext toReturn  = new TypeContext();
    toReturn.types = new HashMap<Name, Type>(this.types);
    toReturn.types.put(n, t);
    return toReturn;
  }

  boolean isSubcontextOf(TypeContext other, ClassContext cctxt, KindContext kctxt) 
      throws NoSuchTypeException {
    if (types.size() == 0 && other.types.size() == 0) {
      return true;
    } else {
      for (Name otherN : other.types.keySet()) {
        if (!(this.types.containsKey(otherN))
            || !(this.types.get(otherN).isSubtypeOf(other.types.get(otherN), cctxt, kctxt))) {
          return false;
        }
      }
      return true;
    }
  }
}
