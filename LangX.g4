grammar LangX;

prog: stat+ EOF 
    ;

stat: 'Create' type ID 'in the image of' expr ';'  #declareAndAssign
    | 'Create' type ID ';'                         #declare
    | ID 'be transformed into' expr ';'            #assign
    | 'Reveal' expr ';'                            #write
    | 'Confess' ID ';'                             #read
    ;

type: 'Mortal' | 'Divine' | 'SmallDivine' | 'Eternal' ;

expr: expr op=('*' | '/') expr #mulDiv
    | expr op=('+' | '-') expr #addSub
    | INT                      #intConst
    | REAL                     #realConst
    | STRING                   #stringConst
    | ID                       #var
    | '(' expr ')'             #parens
    ;

STRING: '"' ~('"'|'\\')* '"' ;
INT: [0-9]+ ;
REAL: [0-9]+ '.' [0-9]+ ;
ID: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')* ;
WS: [ \t\r\n]+ -> skip ;