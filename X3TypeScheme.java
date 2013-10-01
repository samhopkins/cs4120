// this class is just a place to stick some stuff wile parsing
// a sigma, but we don't want to keep it around in the AST so we 
// get the stuff back out at parse-time.

import java.util.*;

public class X3TypeScheme {
  public List<X3TypeVariable> typeParameters;
  public X3Context context;
  public X3Type type;

  public X3TypeScheme(List<X3TypeVariable> a,
      X3Context b, X3Type c) {
    typeParameters = a;
    context = b;
    type = c;
  }

  public X3TypeScheme() { 
    // must initialize here since it might not get set 
    // by a parser action if brackets were dropped
    typeParameters = new ArrayList<X3TypeVariable>();
  }
}

