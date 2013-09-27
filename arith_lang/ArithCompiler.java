import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ArithCompiler {
  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("incorrect usage");
      System.exit(0);
    }
    try {
      String inputFileName = args[0];
      InputStream inputStream = new FileInputStream(inputFileName);
      ANTLRInputStream antlrInputStream = new ANTLRInputStream(inputStream);
      ArithLexer lexer = new ArithLexer(antlrInputStream);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      ArithParser parser = new ArithParser(tokens);
      ArithParser.InputContext tree = parser.input();
      System.out.println(tree.getClass().toString());
      //System.out.println(tree.toStringTree(parser));
      int result = tree.e.eval();
      System.out.println(result);
    } catch (IOException e) {
      System.out.println("file could not be opened");
    }
  }
}

    // compile stuff
    // note: ArithParser.java has a method expr(...) and a method input() that
    // will give back the parse tree context object associated with that
    // rule(?). Then on that object should be the root of the manually-created
    // parse tree!
