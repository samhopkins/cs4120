
lexer grammar X3Lexer ;

@header { package x3; }

// Syntactic Artifacts
LPAREN : '(' ;
RPAREN : ')' ;
LANGLE : '<' ;
RANGLE : '>' ;
LSQBRACKET : '[' ;
RSQBRACKET : ']' ;
LCURLY : '{' ;
RCURLY : '}' ;
COMMA : ',' ;
DOT : '.' ;
ASSIGN : ':=' ;
SEMICOLON : ';' ;
COLON : ':' ;

// Operators
BANG : '!' ;
ONWARDS : '...' ;
NONWARDS : '<..' ;
THROUGH : '..' ;
NTHROUGH : '<.' ;
THROUGHN : '.<' ;
NTHROUGHN : '<<' ;
APPEND : '++' ;
LEQ : '<=' ;
GEQ : '>=' ;
EQ : '==' ;
NEQ : '!=' ;
AND : '&' ;
OR : '|' ;
MOD : '%' ;
TIMES : '*' ;
PLUS : '+' ;
MINUS : '-' ;
DIVIDE : '/' ;


// Keywords
TRUE : 'true' ;
FALSE : 'false' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
FOR : 'for' ;
RETURN : 'return' ;
IN : 'in' ;
INTERFACE : 'interface' ;
EXTENDS : 'extends' ;
FUN : 'fun' ;
SUPER : 'super' ;
THING : 'Thing' ;
NOTHING : 'Nothing' ;
CLASS : 'class' ; 


INT : [0-9]+ ;
STRING : '\"' ~[\t\r\n]*? '\"' ;

// Comments
S_COMMENT : '#' .*? [\n\r] -> skip ;
M_COMMENT : '`' ~[`\']* (M_COMMENT ~[`\']*)* '\'' -> skip ;


// Identifiers
TVAR : [A-Z] ;
TNAME : [A-Z] [A-Za-z0-9\_]* ;
VNAME : [a-z] [A-Za-z0-9\_]* ;

// Whitespace
WS : [ \t\n\r] -> skip ;

// HACK HACK HACK HACK HACK
ERRORCHAR : . ;
