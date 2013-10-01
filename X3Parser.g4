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

     | MINUS e1=expr  { $e = new X3MethodCallExpression(new X3Variable("negative"),
                        new ArrayList<X3Expression>(), new ArrayList<X3Type>(),
                        $e1.e); }
     | e1=expr TIMES e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         $e = new X3MethodCallExpression(new X3Variable("times"), args,
            new ArrayList<X3Type>(), $e1.e); }
     | e1=expr DIVIDE e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         $e = new X3MethodCallExpression(new X3Variable("divide"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr MINUS e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         $e = new X3MethodCallExpression(new X3Variable("minus"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr PLUS e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         $e = new X3MethodCallExpression(new X3Variable("plus"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr MOD e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         $e = new X3MethodCallExpression(new X3Variable("modulo"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr ONWARDS
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add(new X3Boolean(true);
         $e = new X3MethodCallExpression(new X3Variable("onwards"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr NONWARDS
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add(new X3Boolean(false);
         $e = new X3MethodCallExpression(new X3Variable("onwards"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr THROUGH e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.append($e2.e);
         args.append(new X3Boolean(true));
         args.append(new X3Boolean(true));
         $e = new X3MethodCallExpression(new X3Variable("through"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr NTHROUGH e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.append($e2.e);
         args.append(new X3Boolean(false));
         args.append(new X3Boolean(true));
         $e = new X3MethodCallExpression(new X3Variable("through"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr THROUGHN e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.append($e2.e);
         args.append(new X3Boolean(true));
         args.append(new X3Boolean(false));
         $e = new X3MethodCallExpression(new X3Variable("through"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr NTHROUGHN e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.append($e2.e);
         args.append(new X3Boolean(false));
         args.append(new X3Boolean(false));
         $e = new X3MethodCallExpression(new X3Variable("through"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr LANGLE e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.append($e2.e);
         args.append(new X3Boolean(true));
         $e = new X3MethodCallExpression(new X3Variable("lessThan"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr RANGLE e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.append($e1.e);
         args.append(new X3Boolean(true));
         $e = new X3MethodCallExpression(new X3Variable("lessThan"), args,
            new ArrayList<X3Type>(), $e2.e); }

     | e1=expr LEQ e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.append($e2.e);
         args.append(new X3Boolean(false));
         $e = new X3MethodCallExpression(new X3Variable("lessThan"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr GEQ e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.append($e1.e);
         args.append(new X3Boolean(false));
         $e = new X3MethodCallExpression(new X3Variable("lessThan"), args,
            new ArrayList<X3Type>(), $e2.e); }

     | e1=expr EQ e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.append($e2.e);
         $e = new X3MethodCallExpression(new X3Variable("equals"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr NEQ e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.append($e2.e);
         X3Expression equalsCall = new X3MethodCallExpression(
             new X3Variable("equals"), args, new ArrayList<X3Type>(), $e1.e); 
         $e = new X3MethodCallExpression(new X3Variable("negate"),
             new ArrayList<X3Expression>(), new ArrayList<X3Type>(),
             equalsCall); }

     | e1=expr AND e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         $e = new X3MethodCallExpression(new X3Variable("and"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | e1=expr OR e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         $e = new X3MethodCallExpression(new X3Variable("or"), args,
            new ArrayList<X3Type>(), $e1.e); }

     | LPAREN e1=expr RPAREN
       { $e = $e1.e; }
     ;

if_stmt returns [X3IfStatement s]
        : { $s = new X3IfStatement(); } 
          IF LPAREN e1=expr RPAREN sif=stmt 
          { $s.test = $e1.e; 
            $s.ifBranch = $sif.s; }
          (ELSE selse=stmtt
           { $s.elseBranch = $selse.s; } )?
        ;

stmt returns [X3Statement s]
     : { List<X3Statement> l = new ArrayList<X3Statement>(); }
       LCURLY (s1=stmt { l.append($s1.s); })* RCURLY
     | v=VNAME ASSIGN e1=expr SEMICOLON
       { $s = new X3AssignmentStatement(new X3Variable($v.text), $e1.e); }
     | i=if_stmt { $s = $i.s; }
     | WHILE LPAREN e1=expr RPAREN s1=stmt
       { $s = new X3WhileStatement($e1.e, $s1.s); }
     | FOR LPAREN v=VNAME IN e1=expr RPAREN s1=stmt
       { $s = new X3ForStatement(new X3Variable(v.test), $e1.e, $s1.s); } 
     | RETURN e1=expr SEMICOLON
       { $s = new X3ReturnStatement($e1.e); } 
     ;

interfaze returns [X3Interface i]
          : { $i = new X3Interface(); }
            INTERFACE t=TNAME 
            { $i.name = new X3TypeName(t.text); }
            (tlst=tvar_lst { $i.typeParamters = $tlst.lst; })? 
            (EXTENDS t1=tau { $i.superClass = $t1.t; })? 
            mthds=interface_impl { $i.methods = $mthds.lst; };

clazz : CLASS TNAME tvar_lst? gamma (EXTENDS tau)? class_impl ;

interface_impl returns [List<X3Method> lst]
               : { $lst = new ArrayList<X3Method>(); }
                 LCURLY (mthd=mthd_decl { $lst.append($mthd.m); })* RCURLY ;

class_impl returns [X3Class c]
           : { $c = new X3Class(); 
               X3Constructor cstrct = new X3Constructor(); }
             LCURLY (st=stmt { cstrct.body.append($st.s); })* 
             (SUPER elst=expr_lst SEMICOLON { cstrct.superCallArguments =
             $elst.lst; })? 
             (mthd=mthd_decl { $c.methods.append($mthd.m); }* RCURLY ;

toplevel_fun : FUN VNAME sigma stmt SEMICOLON ;

mthd_decl returns [X3Method m]
          : FUN v=VNAME sig=sigma body=stmt
            { $m = new X3MethodImpl(new X3Variable($v.text), $sig.s, $body.s); }
          | FUN v=VNAME sig=sigma SEMICOLON 
            { $m = new X3MethodDecl(new X3Variable($v.text), $sig.s); }
          ;

program : stmt
        | stmt program
        | toplevel_fun program
        | interfaze program
        | clazz program
        ; 

input : program EOF ;
