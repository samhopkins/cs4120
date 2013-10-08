package x3;
import java.util.*;

public class X3SequenceStatement extends X3Statement {
  private List<X3Statement> statements;

  public X3SequenceStatement(List<X3Statement> statements) {
    this.statements = statements;
  }

  public void appendStatement(X3Statement statement) {
    statements.add(statement);
  }

  public List<X3Statement> getStatements() { 
    return new ArrayList<X3Statement>(statements);
  }

  public void setStatements(List<X3Statement> lst) {
    statements = lst;
  }

  public void accept(ASTVisitor v) {
    Utils.acceptList(v, statements);
    v.visitX3SequenceStatement(this);
  }

  public void tokenize(StringBuilder b) {
    if (statements.size() != 1) {
      b.append("{ ");
    }
    for (X3Statement stmt : statements) {
      stmt.tokenize(b);
    }
    if (statements.size() != 1) {
      b.append("} ");
    }
  }
}