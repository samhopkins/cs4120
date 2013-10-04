import java.lang.StringBuilder;
import java.util.*;
public class Utils {
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
        System.out.println("tokenizing an element in a list ");
        b.append(", ");
        elts.get(i).tokenize(b);
      }
    }
    b.append(close);
    b.append(' ');
  }
}
