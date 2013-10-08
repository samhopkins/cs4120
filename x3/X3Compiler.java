package x3;
import java.io.*;
import java.lang.StringBuilder;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Collections;
import java.util.List;

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
      InputStream inputStream = new FileInputStream(inputFileName);
      ANTLRInputStream antlrInputStream = new ANTLRInputStream(inputStream);
      X3Lexer lexer = new X3Lexer(antlrInputStream);
      lexer.removeErrorListeners();
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      Utils.log("constructing parser");
      X3Parser parser = new X3Parser(tokens);
      parser.removeErrorListeners();
      parser.addErrorListener(new X3ErrorListener());
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

      System.out.println(output);

      System.exit(0);
    } catch (IOException e) {
      Utils.log("file could not be opened");
    } finally {
      System.exit(0);
    }
  }
}

class X3ErrorListener extends BaseErrorListener {

  @Override
  public void syntaxError(Recognizer<?, ?> recognizer,
  Object offendingSymbol,
  int line, int charPositionInLine,
  String msg,
  RecognitionException e) 
  {
    List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
    Collections.reverse(stack);
    Utils.log("rule stack: "+stack);
    Utils.log("line "+line+":"+charPositionInLine+" at "+
    offendingSymbol+": "+msg);
    System.out.println("reject");
    System.exit(0);
  }
}
