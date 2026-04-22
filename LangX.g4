grammar LangX;

prog: stat+ EOF 
    ;

stat: 'Create' type ID 'in the image of' expr ';'  #declareAndAssign
    | 'Create' type ID ';'                         #declare
    | ID 'be transformed into' expr ';'            #assign
    | 'Revelation' expr ';'                        #write
    | 'Confession' ID ';'                          #read
    ;

type: 'Mortal' | 'Divine' ;

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