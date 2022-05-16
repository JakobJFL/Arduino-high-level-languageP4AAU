grammar Hlmp;
//Parse Rules

program: setupDef loopDef content* EOF
       | loopDef setupDef content* EOF;

content: funcProc                                           #cntFuncProc
       | varDecl END                                        #cntvarDecl
       | pinLiteral END                                     #varDeclPinLiteral
       | comment                                            #cntComment;


funcProc: funcHead LBRACE body RBRACE                       #funcDefinition
        | procHead LBRACE procBody RBRACE                   #procDefinition;

funcHead: FUNC type id LPAREN (parameter (',' parameter)*)? RPAREN;
procHead: PROC id LPAREN (parameter (',' parameter)*)?  RPAREN;

parameter: type id                                          #param;

type: NUMTYPE | BOOLTYPE | PWMTYPE                          #types;

body: (funcProc body)?                                      #bodyFuncProc
    | stmt body                                             #bodyStmt
    | comment body                                          #bodyComment
    | (returnExpr END)+                                     #bodyReturn;

procBody: (funcProc procBody)?                              #procBodyFuncProc
        | stmt procBody                                     #procBodyStmt
        | comment procBody                                  #procBodyComment;

stmt: varDecl END                                           #stmtVarDecl
    | id ASSIGN expr END                                    #stmtAssign
    | whileWaitCall END                                     #stmtWhileWaitCall
    | funcCall END                                          #stmtFuncCall
    | writeFunc END                                         #stmtWriteFunc
    | readFunc END                                          #stmtReadFunc
    | ifStmt elseStmt?                                      #stmtIfStmt
    | whileExpr                                             #stmtWhileExpr;

pinLiteral: PINTYPE id LBRACE PINNUMBER ',' pinmode RBRACE  #pinLiteralDef;

varDecl: type id                                            #varDeclaration
       | type id ASSIGN expr                                #varDeclarationAssign;

expr: operand                                               #exprOperand
    | readFunc                                              #exprReadFunc
    | LPAREN expr RPAREN                                    #exprParenthesised
    | op=NEG expr                                           #exprUnaryNeg
    | left=expr op=(DIVIDE|MULT) right=expr                 #exprBinaryFloat
    | left=expr op=(PLUS|MINUS|MODULU) right=expr           #exprBinaryFloat
    | left=expr op=(LESSTHAN|GREATERTHAN) right=expr        #exprBinaryBool
    | left=expr op=(EQUAL|NOTEQUAL) right=expr              #exprBinaryBoolEqual
    | left=expr op=LOGAND right=expr                        #exprBinaryLog
    | left=expr op=LOGOR right=expr                         #exprBinaryLog;

operand: id                                                 #operandId
       | sfloat                                             #operandSFloat
       | bool                                               #operandBool
       | funcCall                                           #operandFuncCall;

readFunc: id READPWM LPAREN RPAREN                          #readFuncPWM
        | id READA LPAREN RPAREN                            #readFuncAnal
        | id READD LPAREN RPAREN                            #readFuncDig;

returnExpr: RETURN expr                                     #returnExpression;

whileWaitCall: WHILEWAIT LPAREN INT ',' id RPAREN           #whileWait;

funcCall: id LPAREN args RPAREN                             #functionCall;
args: (expr (',' expr)*)?                                   #arguments;

writeFunc: id WRITE LPAREN val RPAREN                       #writeFuncDef;

val: TRUE                                                   #value
   | FALSE                                                  #value
   | sfloat                                                 #value
   | id                                                     #valueId
   | TOGGLE                                                 #value;

ifStmt: IF LPAREN expr RPAREN LBRACE body RBRACE            #ifStmtDef;

elseStmt: (ELSE LBRACE body RBRACE)?                        #elseStmtDef;

whileExpr: WHILE LPAREN expr RPAREN LBRACE body RBRACE      #whileExprDef;

setupDef: PROC SETUP LPAREN RPAREN LBRACE procBody RBRACE   #setupDefinition;
loopDef: PROC LOOP LPAREN RPAREN LBRACE procBody RBRACE     #loopDefinition;

comment: COMMENT                                            #commentDel
       | LINECOMMENT                                        #commentDel;

pinmode: OUT | IN;
bool: TRUE | FALSE;
sfloat: INT | SFLOAT;
id : ID                                                     #identifier;

//Lexer Rules
INT: [0-9]+;

NUMTYPE: 'Num ';
BOOLTYPE: 'Bool ';
PWMTYPE: 'Pwm ';
PINTYPE: 'Pin ';

NEG: '!';
PLUS: '+';
MINUS: '-';
DIVIDE: '/';
MULT: '*';
MODULU: '%';
LESSTHAN: '<';
GREATERTHAN: '>';
EQUAL: '==';
NOTEQUAL: '!=';
LOGAND: '&&';
LOGOR: '||';

WHILEWAIT: 'whileWait';
SETUP: 'setup';
LOOP: 'loop';
FUNC: 'func ';
PROC: 'proc ';

SFLOAT: (NEGATIVE)? FLOAT;
FLOAT: [0-9]+'.'[0-9]+;

WRITE: '.Write';
READPWM: '.ReadPwm';
READA: '.ReadAnalog';
READD: '.ReadDigital';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
END: ';';
ASSIGN: '=';
NEGATIVE: '~';

TOGGLE: 'toggle';
TRUE: 'true';
FALSE: 'false';
IN: 'in';
OUT: 'out';

IF: 'if';
ELSE: 'else';
RETURN: 'return';
WHILE: 'while';
PINNUMBER: 'D' [0-9]+ | 'A' [0-9]+;

COMMENT: '/*' .*?  '*/' -> skip;
LINECOMMENT: '//' ~( '\r' | '\n' )* -> skip;

WS: (' '|'\t'|NEWLINE)+ -> skip;
NEWLINE: ('\r\n'|'\n'|'\r');

ID: [a-zA-Z_] [a-zA-Z_0-9]*;