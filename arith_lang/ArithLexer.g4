lexer grammar ArithLexer ;

PLUS : '+' ;
TIMES : '*' ;
INT : [0-9]+ ;
LPAREN : '(' ;
RPAREN : ')' ;

WS : [ \t\n\r] -> skip ;
