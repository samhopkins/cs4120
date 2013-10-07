package x3;
import java.lang.StringBuilder;
import java.util.*;
import java.util.logging.*;
import java.io.IOException;
public class Utils {

  public static final Logger LOGGER = Logger.getLogger("InfoLogging");
  private static FileHandler fileTxt;
  private static final SimpleFormatter formatter = new SimpleFormatter();


  public static void initLogging() throws IOException {
    fileTxt = new FileHandler("log.txt");
    // prevent console output
    LOGGER.setUseParentHandlers(false);
    LOGGER.setLevel(Level.INFO);
    fileTxt.setFormatter(formatter);
    LOGGER.addHandler(fileTxt);
  }

  public static void log(String s) {
    LOGGER.info(s);
  }

  public static void tokenizeAngleList(StringBuilder b, List<? extends Tokenizable> elts) {
    tokenizeList('<', '>', b, elts);
  }

  public static void tokenizeParenList(StringBuilder b, List<? extends Tokenizable> elts) {
    tokenizeList('(', ')', b, elts);
  }

  public static void tokenizeList(char open, char close, StringBuilder b,
      List<? extends Tokenizable> elts) {
    b.append(open);
    b.append(' ');
    if (elts.size() > 0) {
      elts.get(0).tokenize(b);
      for (int i = 1; i < elts.size(); i++) {
        Utils.log("tokenizing an element in a list ");
        b.append(", ");
        elts.get(i).tokenize(b);
      }
    }
    b.append(close);
    b.append(' ');
  }

  public static void acceptList(ASTVisitor v, Collection<? extends ASTNode> lst) {
    for (ASTNode n : lst) {
      n.accept(v);
    }
  }
}
