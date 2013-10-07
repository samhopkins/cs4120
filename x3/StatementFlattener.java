package x3;
import java.util.*;
public class StatementFlattener extends ASTVisitor {
  public void visitX3AppendExpression(X3AppendExpression e) { }
  public void visitX3AssignmentStatement(X3AssignmentStatement s) { }
  public void visitX3BooleanExpression(X3BooleanExpression e) { }
  public void visitX3Class(X3Class c) { } 
  public void visitX3ConstructorCallExpression(X3ConstructorCallExpression e) { }
  public void visitX3Constructor(X3Constructor c) { }
  public void visitX3Context(X3Context c) { }
  public void visitX3ForStatement(X3ForStatement s) { }
  public void visitX3FunctionCallExpression(X3FunctionCallExpression e) { }
  public void visitX3IfStatement(X3IfStatement s) { }
  public void visitX3Integer(X3Integer i) { }
  public void visitX3Interface(X3Interface i) { }
  public void visitX3ListExpression(X3ListExpression e) { }
  public void visitX3MethodCallExpression(X3MethodCallExpression e) { }
  public void visitX3MethodDecl(X3MethodDecl m) { }
  public void visitX3MethodImpl(X3MethodImpl m) { }
  public void visitX3Program(X3Program p) { }
  public void visitX3ReturnStatement(X3ReturnStatement s) { }
  public void visitX3SequenceStatement(X3SequenceStatement s) {
    List<X3Statement> statements = s.getStatements();
    Utils.log("visiting sequence of length " + statements.size());

    List<X3Statement> newStatements = new ArrayList<X3Statement>();

    for (X3Statement curr : statements) {
      if (curr instanceof X3SequenceStatement) {
        newStatements.addAll(((X3SequenceStatement) curr).getStatements());
      } else {
        newStatements.add(curr);
      }
    }

    s.setStatements(newStatements);
  }
  public void visitX3String(X3String s) { }
  public void visitX3ToplevelFunction(X3ToplevelFunction f) { }
  public void visitX3TypeBottom(X3TypeBottom t) { }
  public void visitX3TypeIntersection(X3TypeIntersection t) { }
  public void visitX3TypeName(X3TypeName t) { }
  public void visitX3TypeTop(X3TypeTop t) { }
  public void visitX3TypeVariable(X3TypeVariable t) { }
  public void visitX3VariableExpression(X3VariableExpression e) { }
  public void visitX3Variable(X3Variable v) { }
  public void visitX3WhileStatement(X3WhileStatement s) { }
  public void visitX3Method(X3Method m) { }

}

