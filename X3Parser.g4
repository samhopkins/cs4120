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

sigma : tname_lst_optional vname_lst_typed COLON type ;

type : TNAME
     | TNAME type_lst_optional
     | type AND type
     | BOTTOM
     | TOP
     ;

func_call : VNAME type_lst_optional expr_lst ;

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
     | expr MINUS expr
     | expr PLUS expr
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
         | FUN VNAME sigma EQUALS expr SEMICOLON
         ;

fun_decl : FUN VNAME sigma SEMICOLON
         | fun_impl
         ;

lnterface : INTERFACE TNAME tname_lst_optional EXTENDS type interface_impl
          | INTERFACE TNAME tname_lst_optional interface_impl
          ;

clazz: CLASS TNAME tname_lst_optional vname_lst_typed (EXTENDS type)? class_impl
      ;

interface_impl : LCURLY fun_decl* RCURLY ;

class_impl : LCURLY stmt* (SUPER expr_lst)? SEMICOLON fun_decl* RCURLY ;

program : stmt 
        | stmt program 
        | fun_impl program 
        | lnterface program 
        | clazz program
        ;

input : program EOF ;
