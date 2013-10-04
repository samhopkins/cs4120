import java.lang.StringBuilder;

public class X3Variable extends ASTNode {
  private String name;

  public X3Variable(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  // need these so that we can use a hashmap with variables as keys to implement
  // a context
  public boolean equals(Object other) {
    // TODO check this cast!
    X3Variable otherVar = (X3Variable) other;
    return (otherVar.name.equals(this.name));
  }

  public int hashCode() {
    return name.hashCode();
  }

  public void accept(ASTVisitor v) {
    v.visitX3Variable(this);
  }

  public void tokenize(StringBuilder b) {
    b.append(name);
    b.append(' ');
  }

}
