import java.util.*;

public class X3Context {
  private Map<X3Variable, X3Type> variableTypes;

  public X3Context() {
    variableTypes = new HashMap<X3Variable, X3Type>();
  }

  public X3Context add(X3Variable var, X3Type type) {
    X3Context newContext = new X3Context();
    newContext.variableTypes.addAll(this.variableTypes);
    newContext.variableTypes.put(var, type);
    return newContext;
  }

  public getType(X3Variable var) {
    return variableTypes.get(var);
  }
}
