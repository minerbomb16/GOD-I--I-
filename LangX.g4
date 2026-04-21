grammar LangX;

prog: stat+ EOF 
    ;

stat: type ID '=' expr ';'     #declareAndAssign
    | type ID ';'              #declare
    | ID '=' expr ';'          #assign
    | 'oswiec' expr ';'        #write
    | 'wysluchaj' ID ';'       #read
    ;

type: 'skromny' | 'boski'
    ;

expr: expr op=('*' | '/') expr #mulDiv
    | expr op=('+' | '-') expr #addSub
    | INT                      #intConst
    | REAL                     #realConst
    | ID                       #var
    | '(' expr ')'             #parens
    ;

INT: [0-9]+ ;
REAL: [0-9]+ '.' [0-9]+ ;
ID: ('a'..'z'|'A'..'Z')+ ;
WS: [ \t\r\n]+ -> skip ;