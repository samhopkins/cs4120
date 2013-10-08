package x3;
import java.util.*;

class ClassScheme {
  boolean interfaze;
  TypeName name;
  KindContext kinds;
  Type superType;
  List<FunctionScheme> methods;

  boolean isInterface() { return interfaze; }

  public ClassScheme(boolean isInterface, TypeName name, KindContext kinds, 
      Type superType, List<FunctionScheme> methods) {
    this.interfaze = isInterface;
    this.name  = name;
    this.kinds = kinds;
    this.superType = superType;
    this.methods = new ArrayList<FunctionScheme>(methods);
  }

}
