import java.util.*;

public class X3FunctionCallExpression extends X3Expression {
  // hack hack hack to deal with the optional type paramters meaning we have to
  // build the object before we know all the values of the fields
  private X3Variable function;
  private List<X3Type> typeArguments;
  private List<X3Expression> arguments;

  public X3FunctionCallExpression(X3Variable function, List<X3Type>
      typeArguments, List<X3Expression> arguments) {
    this.function = function;
    this.typeArguments = typeArguments;
    this.arguments = arguments;
  }

  public X3Variable getFunction() {
    return function;
  }

  public List<X3Type> getTypeArguments() {
    return typeArguments;
  }

  public List<X3Expression> getArguments() {
    return arguments;
  }

  protected X3Type calculateType(X3Context context) throws NoSuchTypeException {
    throw new NoSuchTypeException();
  }

  public void accept(ASTVisitor v) {
    function.accept(v);
    v.visitX3FunctionCallExpression(this);
  }
}
