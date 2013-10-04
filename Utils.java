public class Utils {
  public static void tokenizeAngleList(StringBuilder b, List<ASTNode> elts) {
    tokenizeHelper('<', '>', b, elts);
  }

  public static void tokenizeParenList(StringBuilder b, List<ASTNode> elts) {
    tokenizeHelper('(', ')', b, elts);
  }

  private static void tokenizeHelper(char open, char close, StringBuilder b,
      List<ASTNode> elts) {
    b.append(open);
    b.append(' ');
    if (elts.size() > 0) {
      elts.get(0).tokenize(b);
      for (int i = 1; i < elts.size(); i++) {
        b.append(", ");
        elts.get(1).tokenize(b);
      }
    }
    b.append(close);
    b.append(' ');
  }
}
