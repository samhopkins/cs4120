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
}
