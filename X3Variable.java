public class X3Variable {
  private String name;

  public X3Variable(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean equals(Object other) {
    // TODO check this cast!
    X3Variable otherVar = (X3Variable) other;
    return (otherVar.name.equals(this.name));
  }

  public int hashCode() {
    return name.hashCode();
  }
}
