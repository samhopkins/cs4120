import java.util.*;

public class X3Context extends ASTNode {
  // necessary for ordering
  private LinkedHashMap<X3Variable, X3Type> variableTypes;

  public X3Context(LinkedHashMap<X3Variable, X3Type> variableTypes) {
    this.variableTypes = variableTypes;
  }

  public X3Type getType(X3Variable var) {
    return variableTypes.get(var);
  }

  public void accept(ASTVisitor v) {
    v.visitX3Context(this);
  }

  public void tokenize(StringBuilder b) {
    List<TypedVar> typedVars = new ArrayList<TypedVar>();
    for (X3Variable key : variableTypes.keys()) {
      typedVars.add(new TypedVar(key, this.getType(key)));
    }
    Utils.tokenizeParenList(b, typedVars);
  }

  class TypedVar implements Tokenizable {
    X3Variable var;
    X3Type type;

    TypedVar(X3Variable var, X3Type type) {
      this.var = var;
      this.type = type;
    }

    public void tokenize(StringBuilder b) {
      var.tokenize(b);
      b.append(": ");
      type.tokenize(b);
    }
  }
}
