parser grammar X3Parser ;

options { tokenVocab = X3Lexer; }

arglst : LPAREN RPAREN
       | LPAREN expr (COMMA expr)* RPAREN
       ;

call : VNAME LANGLE RANGLE arglst
     | VNAME arglst
     | VNAME LANGLE TNAME (COMMA TNAME)* RANGLE arglst
     ;

list_literal : LSQBRACKET RSQBRACKET 
             | LSQBRACKET expr (COMMA expr)* RSQBRACKET
             ;
      
expr : VNAME
     | call
     | expr DOT call
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

tvar_lst : LBRACKET RBRACKET
         | LBRACKET TNAME RBRACKET 
         | LBRACKET TNAME (COMMA TNAME)* RBRACKET
         ;

interface : INTERFACE TNAME tvar_lst EXTENDS TNAME ifc_impl
          | INTERFACE TNAME EXTENDS TNAME ifc_impl
          | INTERFACE TNAME tvar_lst ifc_impl
          | INTERFACE TNAME ifc_impl
          ;

class : CLASS TNAME sigma EXTENDS TNAME 

ifc_impl : LCURLY (fun_decl)* RCURLY ;

sigma : tvar_lst arglst COLON TNAME 
      | arglst COLON TNAME ;

fun_decl : FUN VNAME sigma fun_impl_or_semi ;

fun_impl_or_semi : stmt
                 | SEMICOLON
                 ;
