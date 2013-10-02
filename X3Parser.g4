parser grammar X3Parser ;

@header { import java.util.*; }

options { tokenVocab = X3Lexer; }

expr_lst returns [List<X3Expression> lst]
         : LPAREN RPAREN
           {$lst = new ArrayList<X3Expression>();}
         | {$lst = new ArrayList<X3Expression>();}
           LPAREN e1=expr {$lst.add($e1.e);} (COMMA e2=expr {$lst.add($e2.e);})* RPAREN
         ;

tvar_lst returns [List<X3TypeVariable> lst]
         : LANGLE RANGLE { $lst = new ArrayList<X3TypeVariable>(); }
         | LANGLE  { $lst = new ArrayList<X3TypeVariable>(); }
           t1=TVAR { $lst.add(new X3TypeVariable($t1.text)) ; }
           (COMMA t2=TVAR { $lst.add(new X3TypeVariable($t2.text)); })* RANGLE
         ;

tau returns [X3Type t]
    : v=TVAR 
      { $t = new X3TypeVariable($v.text); }
    | v=TNAME { List<X3Type> typeArguments = new ArrayList<X3Type>(); }
      (lst=tau_lst { typeArguments = $lst.lst; })?
      { $t = new X3TypeName($v.text, typeArguments); }
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
          LANGLE t1=tau { $lst.add($t1.t); } 
          (COMMA t2=tau { $lst.add($t2.t); })* RANGLE
        ;

gamma returns [X3Context ctxt]
      : LPAREN RPAREN { $ctxt = new X3Context(new HashMap<X3Variable, X3Type>()); }
      |  LPAREN v=VNAME COLON t=tau 
         { Map<X3Variable, X3Type> vtypes = new HashMap<X3Variable, X3Type>();
           vtypes.put(new X3Variable($v.text), $t.t); }
         (COMMA v=VNAME COLON t=tau
         { vtypes.put(new X3Variable($v.text), $t.t); })* 
         { $ctxt = new X3Context(vtypes); } RPAREN
      ;

sigma returns [X3TypeScheme s]
      : { List<X3TypeVariable> tvars = new ArrayList<X3TypeVariable>(); }
        (tlst=tvar_lst { tvars = $tlst.lst; } )? 
        g=gamma COLON t=tau 
        { $s = new X3TypeScheme(tvars, $g.ctxt, $t.t); } ;

func_call returns [X3FunctionCallExpression c]
          : { List<X3Type> typeArgs = new ArrayList<X3Type>(); }
            v=VNAME (tlst=tau_lst { typeArgs = $tlst.lst ;})?
            elst=expr_lst 
            { $c = new X3FunctionCallExpression(new X3Variable($v.text),
            typeArgs, $elst.lst); }
          ;

constructor_call returns [X3ConstructorCallExpression c]
                 : { List<X3Type> typeArgs = new ArrayList<X3Type>(); }
                   t=TNAME (tlst=tau_lst { typeArgs = $tlst.lst ;})? 
                   elst=expr_lst 
                   { $c = new X3ConstructorCallExpression(new
                     X3TypeName($t.text, typeArgs), typeArgs, $elst.lst); }
                 ;

list_literal returns [X3ListExpression l]
             : LSQBRACKET RSQBRACKET  
               { $l = new X3ListExpression(new ArrayList<X3Expression>()); }
             | { List<X3Expression> exprs = new ArrayList<X3Expression>(); }
               LSQBRACKET e1=expr { exprs.add($e1.e); } 
               (COMMA e2=expr { exprs.add($e2.e); })* RSQBRACKET
               { $l = new X3ListExpression(exprs); }
             ;
      
expr returns [X3Expression e]
     : v=VNAME { $e = new X3VariableExpression(new X3Variable($v.text)); }
     | f=func_call { $e = $f.c; }
     | c=constructor_call { $e = $c.c; }
     | e1=expr DOT f=func_call 
         { $e =
         X3MethodCallExpression.X3FunctionCallExpressionToX3MethodCallExpression(
         $e1.e, $f.c) ; }
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
         args.add(new X3BooleanExpression(true));
         $e = new X3MethodCallExpression(new X3Variable("onwards"), args,
            new ArrayList<X3Type>(), $e1.e); }
     | e1=expr NONWARDS
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add(new X3BooleanExpression(false));
         $e = new X3MethodCallExpression(new X3Variable("onwards"), args,
            new ArrayList<X3Type>(), $e1.e); }
     | e1=expr THROUGH e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         args.add(new X3BooleanExpression(true));
         args.add(new X3BooleanExpression(true));
         $e = new X3MethodCallExpression(new X3Variable("through"), args,
            new ArrayList<X3Type>(), $e1.e); }
     | e1=expr NTHROUGH e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         args.add(new X3BooleanExpression(false));
         args.add(new X3BooleanExpression(true));
         $e = new X3MethodCallExpression(new X3Variable("through"), args,
            new ArrayList<X3Type>(), $e1.e); }
     | e1=expr THROUGHN e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         args.add(new X3BooleanExpression(true));
         args.add(new X3BooleanExpression(false));
         $e = new X3MethodCallExpression(new X3Variable("through"), args,
            new ArrayList<X3Type>(), $e1.e); }
     | e1=expr NTHROUGHN e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         args.add(new X3BooleanExpression(false));
         args.add(new X3BooleanExpression(false));
         $e = new X3MethodCallExpression(new X3Variable("through"), args,
            new ArrayList<X3Type>(), $e1.e); }
     | e1=expr LANGLE e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         args.add(new X3BooleanExpression(true));
         $e = new X3MethodCallExpression(new X3Variable("lessThan"), args,
            new ArrayList<X3Type>(), $e1.e); }
     | e1=expr RANGLE e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e1.e);
         args.add(new X3BooleanExpression(true));
         $e = new X3MethodCallExpression(new X3Variable("lessThan"), args,
            new ArrayList<X3Type>(), $e2.e); }
     | e1=expr LEQ e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         args.add(new X3BooleanExpression(false));
         $e = new X3MethodCallExpression(new X3Variable("lessThan"), args,
            new ArrayList<X3Type>(), $e1.e); }
     | e1=expr GEQ e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e1.e);
         args.add(new X3BooleanExpression(false));
         $e = new X3MethodCallExpression(new X3Variable("lessThan"), args,
            new ArrayList<X3Type>(), $e2.e); }
     | e1=expr EQ e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
         $e = new X3MethodCallExpression(new X3Variable("equals"), args,
            new ArrayList<X3Type>(), $e1.e); }
     | e1=expr NEQ e2=expr
       { ArrayList<X3Expression> args = new ArrayList<X3Expression>();
         args.add($e2.e);
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
        : { X3Statement elseBranch = new X3SequenceStatement(new
            ArrayList<X3Statement>()); }
          IF LPAREN e1=expr RPAREN sif=stmt 
          (ELSE selse=stmt
           { elseBranch = $selse.s; } )?
          { $s = new X3IfStatement($e1.e, $sif.s, elseBranch); }
        ;

stmt returns [X3Statement s]
     : { List<X3Statement> l = new ArrayList<X3Statement>(); }
       LCURLY (s1=stmt { l.add($s1.s); })* RCURLY
       { $s = new X3SequenceStatement(l); }
     | v=VNAME ASSIGN e1=expr SEMICOLON
       { $s = new X3AssignmentStatement(new X3Variable($v.text), $e1.e); }
     | i=if_stmt { $s = $i.s; }
     | WHILE LPAREN e1=expr RPAREN s1=stmt
       { $s = new X3WhileStatement($e1.e, $s1.s); }
     | FOR LPAREN v=VNAME IN e1=expr RPAREN s1=stmt
       { $s = new X3ForStatement(new X3Variable($v.text), $e1.e, $s1.s); } 
     | RETURN e1=expr SEMICOLON
       { $s = new X3ReturnStatement($e1.e); } 
     ;

interfaze returns [X3Interface i]
          : { List<X3TypeVariable> typeParams = new ArrayList<X3TypeVariable>(); }
            { X3Type superType = new X3TypeTop(); }
            INTERFACE t=TNAME 
            (tlst=tvar_lst { typeParams = $tlst.lst; })? 
            (EXTENDS t1=tau { superType = $t1.t; })? 
            mthds=interface_impl
            { $i = new X3Interface(new X3TypeName($t.text, new
            ArrayList<X3Type>()), typeParams,
            superType, $mthds.lst); }
          ;

clazz returns [X3Class c]
      : { List<X3TypeVariable> typeParams = new ArrayList<X3TypeVariable>(); }
        { X3Type superType = new X3TypeTop(); }
        { List<X3Statement> cstructrBody = new ArrayList<X3Statement>(); }
        { List<X3Expression> superArgs = new ArrayList<X3Expression>(); }
        { List<X3Method> methods = new ArrayList<X3Method>(); }
        CLASS t=TNAME
        (tlst=tvar_lst { typeParams = $tlst.lst; })? g=gamma 
        (EXTENDS t1=tau { superType = $t1.t; })? 
        LCURLY (st=stmt { cstructrBody.add($st.s); })* 
        (SUPER elst=expr_lst SEMICOLON { superArgs = $elst.lst; })? 
        (mthd=mthd_decl { methods.add($mthd.m); })* RCURLY
        { $c = new X3Class(new X3TypeName($t.text, new ArrayList<X3Type>()), 
                  typeParams, superType,
                  $g.ctxt, cstructrBody, superArgs, methods); }
      ;

interface_impl returns [List<X3Method> lst]
               : { $lst = new ArrayList<X3Method>(); } LCURLY (mthd=mthd_decl {
                 $lst.add($mthd.m); })* RCURLY
               ;

toplevel_fun returns [X3ToplevelFunction f]
             : FUN v=VNAME sig=sigma st=stmt SEMICOLON 
               { $f = new X3ToplevelFunction(new X3Variable($v.text), $sig.s,
                 $st.s); }
             ;

mthd_decl returns [X3Method m]
          : FUN v=VNAME sig=sigma body=stmt
            { $m = new X3MethodImpl(new X3Variable($v.text), $sig.s, $body.s); }
          | FUN v=VNAME sig=sigma SEMICOLON 
            { $m = new X3MethodDecl(new X3Variable($v.text), $sig.s); }
          ;

program returns [X3Program p]
        : s1=stmt 
          { List<X3ToplevelItem> lst = new ArrayList<X3ToplevelItem>();
            lst.add($s1.s);
            $p = new X3Program(lst); }
        | s1=stmt p1=program 
          { List<X3ToplevelItem> lst = $p1.p.getToplevelItems();
            lst.add($s1.s);
            $p = new X3Program(lst); } 
        | t1=toplevel_fun p1=program
            { List<X3ToplevelItem> lst = $p1.p.getToplevelItems();
            lst.add($t1.f);
            $p = new X3Program(lst); } 
        | i1=interfaze p1=program
            { List<X3ToplevelItem> lst = $p1.p.getToplevelItems();
            lst.add($i1.i);
            $p = new X3Program(lst); } 
        | c1=clazz p1=program 
            { List<X3ToplevelItem> lst = $p1.p.getToplevelItems();
            lst.add($c1.c);
            $p = new X3Program(lst); } 
        ; 

input returns [X3Program p] : p1=program EOF { $p = $p1.p; };
