package x3;

import java.util.*;

class KindContext {
  List<VarType> vars;

  KindContext() {
    vars = new ArrayList<VarType>();
  }

  KindContext addKind(VarType v) {
    KindContext toReturn = new KindContext();
    toReturn.vars = new ArrayList<VarType>(vars);
    toReturn.vars.add(v);

    return toReturn;
  }
}
