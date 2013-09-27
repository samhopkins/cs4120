parser grammar ArithParser ;

options { tokenVocab = ArithLexer; }

expr returns [Expr e] 
  : i=INT
    { $e = Expr.getIntExpr($i.int); }
  | e1=expr TIMES e2=expr
    { $e = Expr.getMultExpr($e1.e, $e2.e); }
  | e1=expr PLUS e2=expr
    { $e = Expr.getAddExpr($e1.e, $e2.e); }
  | LPAREN e1=expr RPAREN
    { $e = $e1.e ;}
  ; 

input returns [Expr e]
  : e1=expr EOF 
    { $e = $e1.e ;}
  ;
