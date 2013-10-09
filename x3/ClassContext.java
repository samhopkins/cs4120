package x3;

import java.util.*;

class ClassContext {
  List<ClassScheme> classes;

  public ClassContext() {
    classes = new ArrayList<ClassScheme>();
  }

  public ClassContext addClassScheme(ClassScheme s) {
    ClassContext toReturn = new ClassContext();
    toReturn.classes = new ArrayList<ClassScheme>(classes);
    toReturn.classes.add(s);
    return toReturn;
  }

  Type getDeclaredSuper(NamedType t) throws NoSuchTypeException {
    for (ClassScheme c : classes) {
      if (c.name.name.equals(t.name)) {
        return c.superType;
      }
    }
    // looked-up types should always be in context
    throw new NoSuchTypeException();
  }

  KindContext getKindDecl(NamedType t) throws NoSuchTypeException {
    for (ClassScheme c : classes) {
      if (c.name.name.equals(t.name)) {
        return c.kinds;
      }
    }
    // looked-up types should always be in context
    throw new NoSuchTypeException();
  }

}
