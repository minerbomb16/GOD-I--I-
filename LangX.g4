grammar LangX;

prog: stat+ EOF 
    ;

stat: 'Create' type ID '[' INT ']' ';'                    #declareArray
    | ID '[' expr ']' 'be transformed into' expr ';'       #assignArrayElem
    | 'Confess' ID '[' expr ']' ';'                        #readArrayElem
    | 'Reveal' ID ';'                                      #writeId
    | 'Create' type ID 'in the image of' expr ';'  #declareAndAssign
    | 'Create' type ID ';'                         #declare
    | ID 'be transformed into' expr ';'            #assign
    | 'Reveal' expr ';'                            #write
    | 'Confess' ID ';'                             #read
    ;

type: 'Mortal' | 'Divine' | 'SmallDivine' | 'Eternal' | 'Dogma';

expr: 'NEG' expr                 #logicNeg
    | expr op=('*' | '/') expr #mulDiv
    | expr op=('+' | '-') expr #addSub
    | expr op='AND' expr         #logicAnd
    | expr op='OR' expr          #logicOr
    | expr op='XOR' expr         #logicXor
    | ID '[' expr ']'            #arrayElem
    | 'Heven'                  #trueConst
    | 'Hell'                   #falseConst
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