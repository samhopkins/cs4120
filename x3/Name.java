package x3;

class Name {
  String name;

  Name(String s) { name = s; }

  String getName() { return name; }

  public boolean equals(Object other) {
    if (!(other instanceof Name)) {
      return false;
    } else {
      return name.equals(((Name) other).name);
    }
  }

  public int hashCode() { return name.hashCode(); }

}
