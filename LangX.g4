grammar LangX;

prog: start+ EOF 
    ;

start: 'Create' type ID '[' INT ']' '[' INT ']' ';'                       #declareMatrix
    | ID '[' expr ']' '[' expr ']' 'be transformed into' expr ';'         #assignMatrixElem
    | 'Confess' ID '[' expr ']' '[' expr ']' ';'                          #readMatrixElem
    | 'Reveal' 'row' ID '[' INT ']' ';'                                   #writeMatrixRow
    | 'Reveal' 'column' ID '[' INT ']' ';'                                #writeMatrixColumn

    | 'Create' type ID '[' INT ']' ';'                 #declareArray
    | ID '[' expr ']' 'be transformed into' expr ';'    #assignArrayElem
    | 'Confess' ID '[' expr ']' ';'                     #readArrayElem

    | 'Reveal' ID ';'                                   #writeId
    | 'Reveal' ID '[' INT ':' INT ']' ';'               #writeArrayRange
    | 'Reveal' ID '[' INT ':' ']' ';'                   #writeArrayFrom
    | 'Reveal' ID '[' ':' INT ']' ';'                   #writeArrayTo

    | 'Create' type ID 'in the image of' expr ';'       #declareAndAssign
    | 'Create' type ID ';'                              #declare
    | ID 'be transformed into' expr ';'                 #assign
    | 'Reveal' expr ';'                                 #write
    | 'Confess' ID ';'                                  #read
    ;

type: 'Mortal' | 'Divine' | 'SmallDivine' | 'Eternal' | 'Dogma';

expr: '-' expr                  #unaryMinus
    | 'NEG' expr                #logicNeg
    | expr op=('*' | '/') expr  #mulDiv
    | expr op=('+' | '-') expr  #addSub
    | expr andOp expr           #logicAnd
    | expr orOp expr            #logicOr
    | expr op='XOR' expr        #logicXor
    | ID '[' expr ']' '[' expr ']'         #matrixElem
    | ID '[' expr ']'           #arrayElem
    | 'Heaven'                  #trueConst
    | 'Hell'                    #falseConst
    | INT                       #intConst
    | REAL                      #realConst
    | STRING                    #stringConst
    | ID                        #var
    | '(' expr ')'              #parens
    ;

andOp: 'AND' ;
orOp: 'OR' ;
STRING: '"' ~('"'|'\\')* '"' ;
INT: [0-9]+ ;
REAL: [0-9]+ '.' [0-9]+ ;
ID: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')* ;
WS: [ \t\r\n]+ -> skip ;