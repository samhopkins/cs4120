import java.util.*;

public class X3SequenceStatement extends X3Statement {
  private List<X3Statement> statements;

  public X3SequenceStatement(List<X3Statement> statements) {
    this.statements = statements;
  }

  public void appendStatement(X3Statement statement) {
    statements.add(statement);
  }
}
