import java.io.*;
import java.lang.StringBuilder;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class X3Compiler {
  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("incorrect usage");
      System.exit(0);
    }
    try {
      String inputFileName = args[0];
      InputStream inputStream = new FileInputStream(inputFileName);
      ANTLRInputStream antlrInputStream = new ANTLRInputStream(inputStream);
      X3Lexer lexer = new X3Lexer(antlrInputStream);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      X3Parser parser = new X3Parser(tokens);
      X3Program treeRoot = parser.input().p;
      
      StringBuilder builder = new StringBuilder();
      treeRoot.tokenize(builder);
      String output = builder.toString();
      output = output.substring(0, output.length() - 1); // strip whitespace

      System.out.print(output);
      
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
