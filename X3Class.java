import java.util.*;

public class X3Class {
  public X3TypeName name;
  public List<X3TypeVariable> typeParameters;
  public X3Type superClass;
  public X3Context constructorArguments;
  public X3Constructor constructor;
  public List<X3Method> methods;

  public X3Class() { 
    methods = new ArrayList<X3Method>();
    
  }
}
