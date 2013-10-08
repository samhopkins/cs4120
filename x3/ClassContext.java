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


}
