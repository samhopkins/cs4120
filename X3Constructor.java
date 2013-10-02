import java.util.*;

public class X3Constructor extends ASTNode {
  private List<X3Statement> body;
  private List<X3Expression> superCallArguments;

  public X3Constructor() { 
    body = new ArrayList<X3Statement>();
    superCallArguments = new ArrayList<X3Expression>();
  }

  public X3Constructor(List<X3Statement> body, List<X3Expression>
      superCallArguments) {
    this.body = body;
    this.superCallArguments = superCallArguments;
  }

  public List<X3Statement> getBody() { return body; }
  public List<X3Expression> getSuperCallArguments() { return superCallArguments; }

  public void accept(ASTVisitor v) {
    v.visitX3Constructor(this);
  }
}
