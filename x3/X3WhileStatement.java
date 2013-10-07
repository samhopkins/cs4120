package x3;
import java.lang.StringBuilder;

public class X3WhileStatement extends X3Statement {
  private X3Expression test;
  private X3Statement body;

  public X3WhileStatement(X3Expression test, X3Statement body) {
    this.test = test;
    this.body = body;
  }

  public X3Expression getTest() { return test; }
  public X3Statement getBody() { return body; }

  public void accept(ASTVisitor v) {
    test.accept(v);
    body.accept(v);
    v.visitX3WhileStatement(this);
  }

  public void tokenize(StringBuilder b) {
    b.append("while (");
    test.tokenize(b);
    b.append(") ");
    body.tokenize(b);
  }
    
}
