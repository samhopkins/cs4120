import java.util.*;

public class X3Program extends ASTNode {
  private List<X3ToplevelItem> lst;

  public X3Program(List<X3ToplevelItem> lst) {
    this.lst = lst;
  }

  public List<X3ToplevelItem> getToplevelItems() { 
    return new ArrayList<X3ToplevelItem>(lst);
  }

  public void accept(ASTVisitor v) {
    v.visitX3Program(this);
  }
}
