import java.util.*;

public class X3Class extends X3ToplevelItem {
  public X3TypeName name;
  public List<X3TypeVariable> typeParameters;
  public X3Type superType;
  public X3Context constructorArguments;
  public X3Constructor constructor;
  public List<X3Method> methods;

  public X3Class() { 
    methods = new ArrayList<X3Method>();
    
  }
}
