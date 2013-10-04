import java.lang.StringBuilder;
public abstract class ASTNode implements Tokenizable {

  public abstract void accept(ASTVisitor v); 
  public abstract void tokenize(StringBuilder b);

}
