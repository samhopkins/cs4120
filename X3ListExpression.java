import java.util.*;

public class X3ListExpression extends X3Expression {
  private List<X3Expression> elements;

  public X3ListExpression(List<X3Expression> elements) {
    this.elements = elements;
  }

  public List<X3Expression> getElements() {
    return elements;
  }

  public X3Type calculateType(X3Context context) throws NoSuchTypeException {
    throw new NoSuchTypeException();
  }
}
