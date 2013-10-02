import java.util.*;

public class X3Context {
  private Map<X3Variable, X3Type> variableTypes;

  public X3Context(Map<X3Variable, X3Type> variableTypes) {
    this.variableTypes = variableTypes;
  }

  public X3Type getType(X3Variable var) {
    return variableTypes.get(var);
  }
}
