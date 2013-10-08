package x3;
import java.util.*;

public class X3ConstructorCallExpression extends X3Expression {
  private X3TypeName constructor;
  private List<X3Expression> arguments;

  public X3ConstructorCallExpression(X3TypeName constructor,
      List<X3Expression> arguments) {
    this.constructor = constructor;
    this.arguments = arguments;
  }

  public X3TypeName getFunction() {
    return constructor;
  }

  public List<X3Expression> getArguments() {
    return arguments;
  }

  protected X3Type calculateType(X3Context context) throws NoSuchTypeException {
    throw new NoSuchTypeException();
  }

  public void accept(ASTVisitor v) {
    constructor.accept(v);
    Utils.acceptList(v, arguments);
    v.visitX3ConstructorCallExpression(this);
  }

  public void tokenize(StringBuilder b) {
    constructor.tokenize(b);
    Utils.tokenizeParenList(b, arguments);
  }
}