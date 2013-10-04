import java.util.*;

public class X3MethodCallExpression extends X3FunctionCallExpression {
  private X3Expression target;
  
  public X3MethodCallExpression(X3Variable function, List<X3Expression>
      arguments, List<X3Type> typeArguments,
      X3Expression target) {
    super(function, typeArguments, arguments);
    this.target = target;
  }

  public static X3MethodCallExpression 
      X3FunctionCallExpressionToX3MethodCallExpression(X3Expression
      target, X3FunctionCallExpression functionCall) {
    return new X3MethodCallExpression(functionCall.getFunction(),
      functionCall.getArguments(), functionCall.getTypeArguments(),  target);
  }

  public X3Expression getTarget() {
    return target;
  }

  protected X3Type calculateType() throws NoSuchTypeException {
    throw new NoSuchTypeException();
  }

  public void accept(ASTVisitor v) {
    target.accept(v);
    super.accept(v);
  }

  public void tokenize(StringBuilder b) {
    target.tokenize(b);
    b.append(". ");
    super.tokenize(b);
  }
}
