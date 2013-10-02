// this class is just a place to stick some stuff wile parsing
// a sigma, but we don't want to keep it around in the AST so we 
// get the stuff back out at parse-time.

import java.util.*;

public class X3TypeScheme {
  private List<X3TypeVariable> typeParameters;
  private X3Context context;
  private X3Type type;

  public X3TypeScheme(List<X3TypeVariable> a,
      X3Context b, X3Type c) {
    typeParameters = a;
    context = b;
    type = c;
  }

  public List<X3TypeVariable> getTypeParameters() {
    return new ArrayList<X3TypeVariable>(typeParameters);
  }
  public X3Context getContext() { return context; }
  public X3Type getType() { return type; }

}

