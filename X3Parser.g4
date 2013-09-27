parser grammar X3Parser ;

options { tokenVocab = X3Lexer; }

expr_lst : LPAREN RPAREN
         | LPAREN expr (COMMA expr)* RPAREN
         ;

tname_lst : LANGLE RANGLE
          | LANGLE TNAME (COMMA TNAME)* RANGLE
          ;

tvar_lst : LANGLE RANGLE
         | LANGLE TVAR (COMMA TVAR)* RANGLE
         ;

tau : TVAR 
    | TNAME tau_lst? 
    | tau AND tau 
    | THING 
    | NOTHING
    ;

tau_lst : LANGLE RANGLE
        | LANGLE tau (COMMA tau)* RANGLE
        ;

gamma : LPAREN RPAREN
      | LPAREN VNAME COLON tau (COMMA VNAME COLON tau)* RPAREN
      ;

sigma : tname_lst? gamma COLON tau ;

func_call : VNAME tau_lst? expr_lst ;

constructor_call : TNAME tau_lst? expr_lst ;

list_literal : LSQBRACKET RSQBRACKET 
             | LSQBRACKET expr (COMMA expr)* RSQBRACKET
             ;
      
expr : VNAME
     | func_call
     | expr DOT func_call
     | constructor_call
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
