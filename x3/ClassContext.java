package x3;

import java.util.*;

class ClassContext {
  List<ClassScheme> classes;

  public ClassContext() {
    classes = new ArrayList<ClassScheme>();
  }

  ClassScheme getScheme(NamedType t) throws NoSuchTypeException {
    for(ClassScheme scheme : classes) {
      if scheme.matches(t) { return scheme; }
    }
    return null;
  }

  public ClassContext addClassScheme(ClassScheme s) throws NoSuchTypeException {
    // no name hiding
    for (ClassScheme s' : classes) {
      if (s'.name.equals(s.name)) {
        throw new NoSuchTypeException();
      }
    }
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
