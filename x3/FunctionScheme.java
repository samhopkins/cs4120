package x3;

class FunctionScheme extends CallableScheme {
  Name name;

  FunctionScheme(Name name, KindContext kinds, TypeContext vars, Type declaredType) {
    this.name = name;
    this.kinds = kinds;
    this.vars = vars;
    this.declaredType = declaredType;
  }

}

