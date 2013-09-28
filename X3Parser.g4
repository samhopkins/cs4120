parser grammar X3Parser ;

@header { import java.util.*; }

options { tokenVocab = X3Lexer; }

expr_lst returns [List<X3Expression> lst]
         : LPAREN RPAREN
           {$lst = new ArrayList<X3Expression>();}
         | {$lst = new ArrayList<X3Expression>();}
           LPAREN e1=expr {$lst.add(e1.e);} (COMMA e2=expr {$lst.add(e2.e);})* RPAREN
         ;

tvar_lst returns [List<X3TypeVariable> lst]
         : LANGLE RANGLE { $lst = new ArrayList<X3TypeVariable>(); }
         | LANGLE  { $lst = new ArrayList<X3TypeVariable>(); }
           t1=TVAR { $lst.add(new X3TypeVariable($t1.text)) ; }
           (COMMA t2=TVAR { $lst.add(new X3TypeVariable($t2.text)); })* RANGLE
         ;

tau returns [X3Type t]
    : v=TVAR 
      { $t = new X3TypeVariable(v.text); }
    | v=TNAME { $t = new X3TypeName(v.text); } 
      (lst=tau_lst { $t.setTypeArguments($lst.lst); })?
    | t1=tau AND t2=tau 
      { $t = new X3TypeIntersection($t1.t, $t2.t); }
    | THING 
      { $t = new X3TypeTop(); }
    | NOTHING
      { $t = new X3TypeBottom(); }
    ;

tau_lst returns [List<X3Type> lst]
        : LANGLE RANGLE { $lst = new ArrayList<X3Type>(); }
        | { $lst = new ArrayList<X3Type>(); } 
          LANGLE t1=tau { $list.add($t1.t); } 
          (COMMA t2=tau { $list.add($t2.t); })* RANGLE
        ;

gamma returns [X3Context ctxt]
      : LPAREN RPAREN { $ctxt = new X3Context(); }
      | { $ctxt = new X3Context(); }
         LPAREN v=VNAME COLON t=tau 
         { $ctxt = new X3Context();
           $ctxt = $ctxt.add(new X3Variable($v.text), $t.t) }
         (COMMA v=VNAME COLON t=tau
         { $ctxt = $ctxt.add(new X3Variable($v.text), $t.t) })* RPAREN
      ;

sigma returns [X3TypeScheme s]
      : { $s = new X3TypeScheme(); } 
        (tlst=tvar_lst { $s.typeParameters = $tlst.lst; } )? 
        g=gamma COLON t=tau 
        { $s.context = $g.ctxt; $s.type = $t.t; } ;

func_call returns [X3FunctionCallExpression c]
          : { $c = new X3FunctionCallExpression(); } 
            v=VNAME (tlst=tau_lst { $c.typeArguments = $tlst.lst ;})? 
            elst=expr_lst { $c.function = new X3Variable(v.text) ;
                            $c.arguments = $elst.lst;} ;

constructor_call returns [X3ConstructorCallExpression c]
                 : { $c = new X3ConstructorCallExpression(); } 
                   t=TNAME (tlst=tau_lst { $c.typeArguments = $tlst.lst ;})? 
                   elst=expr_lst { $c.constructor = new X3TypeVariable(t.text) ;
                                   $c.arguments = $elst.lst;} ;

list_literal returns [X3ListExpression l]
             : LSQBRACKET RSQBRACKET  
               { $l = new X3ListExpression(new ArrayList<X3Expression>()); }
             | { $l = new X3ListExpression(new ArrayList<X3Expression>()); }
               LSQBRACKET e1=expr { $l.add($e1.e); } 
               (COMMA e2=expr { $l.add($e2.e); })* RSQBRACKET
             ;
      
expr returns [X3Expression e]
     : v=VNAME { $e = new X3VariableExpression(new X3Variable(v.text)); }
     | f=func_call { $e = f.c; }
     | c=constructor_call { $e = c.c; }
     | e1=expr DOT f=func_call 
         { $e =
         X3MethodCallExpression.X3FuctionCallExpressionToX3MethodCallExpression(
         $f.c, $e1.e) ; }
     | l=list_literal { $e = $l.l; }
     | e1=expr APPEND e2=expr { $e = new X3AppendExpression($e1.e, $e2.e) ; }
     | TRUE { $e = new X3BooleanExpression(true); }
     | FALSE { $e = new X3BooleanExpression(false); }
     | i=INT { $e = new X3Integer($i.int); }
     | s=STRING { $e = new X3String($s.text); }
     | BANG e1=expr { $e = new X3MethodCallExpression(new X3Variable("negate"),
                        new ArrayList<X3Expression>(), new ArrayList<X3Type>(),
                        $e1.e); }

     | MINUS expr
     | expr TIMES expr
     | expr DIVIDE expr
     | expr MINUS expr
     | expr PLUS expr
     | expr MOD expr
     | expr ONWARDS
     | expr NONWARDS
     | expr THROUGH expr
     | expr NTHROUGH expr
     | expr THROUGHN expr
     | expr NTHROUGHN expr
     | expr LANGLE expr
     | expr RANGLE expr
     | expr LEQ expr
     | expr GEQ expr
     | expr EQ expr
     | expr NEQ expr
     | expr AND expr
     | expr OR expr
     | LPAREN expr RPAREN
     ;

if_stmt : IF LPAREN expr RPAREN stmt ELSE stmt
        | IF LPAREN expr RPAREN stmt
        ;

stmt : LCURLY stmt* RCURLY
     | VNAME ASSIGN expr SEMICOLON
     | if_stmt
     | WHILE LPAREN expr RPAREN stmt
     | FOR LPAREN VNAME IN expr RPAREN stmt
     | RETURN expr SEMICOLON
     ;

interfaze : INTERFACE TNAME tvar_lst? (EXTENDS tau)? interface_impl ;

clazz : CLASS TNAME tvar_lst? gamma (EXTENDS tau)? class_impl ;

interface_impl : LCURLY (fun_decl)* RCURLY ;

class_impl : LCURLY stmt* (SUPER expr_lst SEMICOLON)? fun_decl* RCURLY ;

toplevel_fun : FUN VNAME sigma stmt SEMICOLON ;

fun_decl : FUN VNAME sigma fun_impl_or_semi ;

fun_impl_or_semi : stmt
                 | SEMICOLON
                 ;

program : stmt
        | stmt program
        | toplevel_fun program
        | interfaze program
        | clazz program
        ; 

input : program EOF ;
