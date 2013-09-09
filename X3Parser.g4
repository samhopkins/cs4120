parser grammar X3Parser ;

options { tokenVocab = X3Lexer; }

tname_lst_optional : (LANGLE RANGLE | LANGLE TNAME (COMMA TNAME)* RANGLE)?  ;

type_lst_optional : (LANGLE RANGLE | LANGLE type (COMMA type)* RANGLE)?  ;

expr_lst : LPAREN RPAREN
         | LPAREN expr (COMMA expr)* RPAREN
         ;

typed_var : VNAME COLON type ;

vname_lst_typed : LPAREN RPAREN
                | LPAREN typed_var (COMMA typed_var)* RPAREN
                ;

sigma : tname_list_optional vname_lst_typed COLON type ;

type : TNAME
     | TNAME LANGLE RANGLE
     | TNAME LANGLE type_lst RANGLE
     | type AND type
     | BOTTOM
     | TOP
     ;

func_call : VNAME type_lst expr_lst ;

list_literal : LSQBRACKET RSQBRACKET 
             | LSQBRACKET expr (COMMA expr)* RSQBRACKET
             ;

expr : VNAME
     | func_call
     | expr DOT func_call
     | list_literal
     | expr APPEND expr
     | TRUE
     | FALSE
     | INT
     | STRING
     | BANG expr
     | MINUS expr
     | expr TIMES expr
     | expr DIVIDE expr
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

fun_impl : FUN VNAME sigma stmt 
         | FUN VNAME sigma EQUALS expr ;

fun_decl : FUN VNAME sigma SEMICOLON
         | fun_impl
         ;

interface : INTERFACE TNAME tname_lst EXTENDS type interface_impl
          | INTERFACE TNAME tname_lst interface_impl
          ;

class : CLASS TNAME tname_lst_optional vname_lst_typed (EXTENDS type)? class_impl
      ;

interface_impl : LCURLY fun_decl* RCURLY ;

class_impl : LCURLY stmt* (SUPER expr_lst)? SEMICOLON fun_decl* RCURLY

program : stmt 
        | stmt* program 
        | (fun_impl)* program 
        | interface program 
        | class program
        ;
