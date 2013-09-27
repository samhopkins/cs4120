public abstract class Expr {
  public static AddExpr getAddExpr(Expr e1, Expr e2) {
    return new AddExpr(e1, e2);
  }
  public static MultExpr getMultExpr(Expr e1, Expr e2) {
    return new MultExpr(e1, e2);
  }
  public static IntExpr getIntExpr(int t) {
    return new IntExpr(t);
  }

  abstract public int eval();
}


class AddExpr extends Expr {
  private Expr e1;
  private Expr e2;

  public AddExpr(Expr e1, Expr e2) {
    this.e1 = e1;
    this.e2 = e2;
  }

  public int eval() {
    return e1.eval() + e2.eval();
  }
}

class MultExpr extends Expr {
  private Expr e1;
  private Expr e2;

  public MultExpr(Expr e1, Expr e2) {
    this.e1 = e1;
    this.e2 = e2;
  }
  
  public int eval() {
    return e1.eval() * e2.eval();
  }
}

class IntExpr extends Expr {
  private int i;

  public IntExpr(int i) {
    this.i = i;
  }

  public int eval() {
    return i;
  }
}
