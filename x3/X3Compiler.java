package x3;
import java.io.*;
import java.lang.StringBuilder;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class X3Compiler {
  public static void main(String[] args) {
    try {
      Utils.initLogging();
    } catch (IOException e) {
      System.out.println("Could not launch logging. Aborting.");
      System.exit(0);
    }
    Utils.log("launching compiler");
    System.out.flush();
    if (args.length < 1) {
      Utils.log("incorrect usage");
      System.exit(0);
    }
    try {
      String inputFileName = args[0];
      Utils.log("opening file");
      System.out.flush();
      InputStream inputStream = new FileInputStream(inputFileName);
      ANTLRInputStream antlrInputStream = new ANTLRInputStream(inputStream);
      X3Lexer lexer = new X3Lexer(antlrInputStream);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      Utils.log("constructing parser");
      X3Parser parser = new X3Parser(tokens);
      Utils.log("getting output of parser");
      X3Program treeRoot = parser.input().p;
      Utils.log("constructing flattener");
      StatementFlattener flattener = new StatementFlattener();
      Utils.log("starting to flatten");
      treeRoot.accept(flattener);
      Utils.log("flattening done");
      
      StringBuilder builder = new StringBuilder();
      treeRoot.tokenize(builder);
      String output = builder.toString();
      output = output.substring(0, output.length() - 1); // strip whitespace

      System.out.print(output);
      
    } catch (IOException e) {
      Utils.log("file could not be opened");
    }
  }
}

    // compile stuff
    // note: ArithParser.java has a method expr(...) and a method input() that
    // will give back the parse tree context object associated with that
    // rule(?). Then on that object should be the root of the manually-created
    // parse tree!
