package x3;
import java.lang.StringBuilder;

public class X3String extends X3Expression {
  private String value;

  public X3String(String value) {
    // trim the quotation marks
    this.value = value.substring(1, value.length()-1);
  }

  public String getValue() {
    return value;
  }

  protected X3Type calculateType(X3Context context) throws NoSuchTypeException {
    throw new NoSuchTypeException();
  }

  public void accept(ASTVisitor v) {
    v.visitX3String(this);
  }

  public void tokenize(StringBuilder b) {
    b.append('"');
    b.append(value);
    b.append('"');
    b.append(' ');
  }
}
