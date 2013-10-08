package x3;

import java.util.*;

class FunctionContext {
  List<CallableScheme> callables;

  FunctionContext() {
    callables = new ArrayList<CallableScheme>();
  }

  FunctionContext add (FunctionScheme s) {
    FunctionContext toReturn = new FunctionContext();
    toReturn.callables = new ArrayList<CallableScheme>(this.callables);
    toReturn.callables.add(s);
    return toReturn;
  }
}
