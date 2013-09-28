import java.util.*;

public class X3ConstructorCallExpression extends X3Expression {
  // hack hack hack to deal with the optional type paramters meaning we have to
  // build the object before we know all the values of the fields
  public X3TypeName constructor;
  public List<X3Type> typeArguments;
  public List<X3Expression> arguments;

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
}
