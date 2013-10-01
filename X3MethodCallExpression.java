import java.util.*;

public class X3MethodCallExpression extends X3FunctionCallExpression {
  private X3Expression target;
  
  public X3MethodCallExpression(X3Variable function, List<X3Type> typeArguments,
      List<X3Expression> arguments, X3Expression target) {
    super(function, typeArguments, arguments);
    this.target = target;
  }

  public static X3MethodCallExpression 
      X3FunctionCallExpressionToX3MethodCallExpression(X3Expression
      target, X3FunctionCallExpression functionCall) {
    return new X3MethodCallExpression(functionCall.function,
        functionCall.typeArguments, functionCall.arguments, target);
  }

  public X3Expression getTarget() {
    return target;
  }

  protected X3Type calculateType() throws NoSuchTypeException {
    throw new NoSuchTypeException();
  }
}
