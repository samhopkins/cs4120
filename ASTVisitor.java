public abstract class ASTVisitor {
  public abstract void visitX3AppendExpression(X3AppendExpression e);
  public abstract void visitX3AssignmentStatement(X3AssignmentStatement s);
  public abstract void visitX3BooleanExpression(X3BooleanExpression e);
  public abstract void visitX3Class(X3Class c); 
  public abstract void visitX3ConstructorCallExpression(X3ConstructorCallExpression e);
  public abstract void visitX3Constructor(X3Constructor c);
  public abstract void visitX3Context(X3Context c);
  public abstract void visitX3ForStatement(X3ForStatement s);
  public abstract void visitX3FunctionCallExpression(X3FunctionCallExpression e);
  public abstract void visitX3IfStatement(X3IfStatement s);
  public abstract void visitX3Integer(X3Integer i);
  public abstract void visitX3Interface(X3Interface i);
  public abstract void visitX3ListExpression(X3ListExpression e);
  public abstract void visitX3MethodCallExpression(X3MethodCallExpression e);
  public abstract void visitX3MethodDecl(X3MethodDecl m);
  public abstract void visitX3MethodImpl(X3MethodImpl m);
  public abstract void visitX3Program(X3Program p);
  public abstract void visitX3ReturnStatement(X3ReturnStatement s);
  public abstract void visitX3SequenceStatement(X3SequenceStatement s);
  public abstract void visitX3String(X3String s);
  public abstract void visitX3ToplevelFunction(X3ToplevelFunction f);
  public abstract void visitX3TypeBottom(X3TypeBottom t);
  public abstract void visitX3TypeIntersection(X3TypeIntersection t);
  public abstract void visitX3TypeName(X3TypeName t);
  public abstract void visitX3TypeTop(X3TypeTop t);
  public abstract void visitX3TypeVariable(X3TypeVariable t);
  public abstract void visitX3VariableExpression(X3VariableExpression e);
  public abstract void visitX3Variable(X3Variable v);
  public abstract void visitX3WhileStatement(X3WhileStatement s);
  public abstract void visitX3Method(X3Method m);
}



