parser grammar X3Parser

options { tokenVocab = X3Lexer; }

arglst : LPAREN RPAREN
       | LPAREN expr (COMMA expr)* RPAREN
       ;

call : VNAME LANGLE RANGLE arglst
     | VNAME arglst
     | VNAME LANGLE TNAME (COMMA TNAME)* RANGLE arglst
     ;

list_literal : LSQBRACKET expr (COMMA expr)* RSQBRACKET ;
      
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
     | WHILE LPAREN expr RPAREN
     | FOR LPAREN VNAME IN expr RPAREN stmt
     | RETURN expr SEMICOLON
     ;

