grammar Hlmp;
//Parse Rules

program: setupDef loopDef content*
       | loopDef setupDef content*;

content: funcProc                                           #cntFuncProc
       | varDecl END                                        #cntvarDecl
       | comment                                            #cntComment;

funcProc: funcHead LBRACE body returnExpr RBRACE            #funcDefinition
        | procHead LBRACE body RBRACE                       #procDefinition;

funcHead: FUNC type id LPAREN (parameter (',' parameter)*)? RPAREN;
procHead: PROC id LPAREN (parameter (',' parameter)*)?  RPAREN;

id : ID                                                     #identifier;

parameter: type id                                          #param;

type: NUMTYPE | BOOLTYPE | PWMTYPE | PINTYPE                #types;

body: (funcProc body)?                                      #bodyStmt
    | stmt body                                             #bodyStmt
    | comment body                                          #bodyComment;

stmt: varDecl END                                           #stmtVarDecl
    | assign END                                            #stmtAssign
    | funcCall END                                          #stmtFuncCall
    | writeFunc END                                         #stmtWriteFunc
    | readFunc END                                          #stmtReadFunc
    | ifStmt                                                #stmtIfStmt
    | whileExpr                                             #stmtWhileExpr;

varDecl: type id                                            #varDeclaration
       | type assign                                        #varDeclaration
       | pinLiteral                                         #varDeclPinLiteral;

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
       | SFLOAT                                             #operandSFloat
       | BOOL                                               #operandBool
       | funcCall                                           #operandFuncCall;

readFunc: id READPWM LPAREN RPAREN                          #readFuncPWM
        | id READA LPAREN RPAREN                            #readFuncAnal
        | id READD LPAREN RPAREN                            #readFuncDig;

pinLiteral: PINTYPE id LBRACE PINNUMBER ',' PINMODE RBRACE  #pinLiteralDef;

assign: id ASSIGN expr                                      #assignExpr;

returnExpr: RETURN expr                                     #returnExpression;

funcCall: id LPAREN args RPAREN                             #functionCall;
args: (expr (',' expr)*)?                                   #arguments;


writeFunc: id WRITE LPAREN val RPAREN                       #writeFuncDef;

val: HIGH                                                   #value
   | LOW                                                    #value
   | SFLOAT                                                 #value
   | id                                                     #valueId
   | TOGGLE                                                 #value;

ifStmt: IF LPAREN expr RPAREN LBRACE body RBRACE elseStmt   #ifStmtDef;

elseStmt: (ELSE LBRACE body RBRACE)?                        #elseSTtmt
        | ELSE ifStmt                                       #elseIfStmt;

whileExpr: WHILE LPAREN expr RPAREN LBRACE body RBRACE      #whileExprDef;

setupDef: PROC SETUP LPAREN RPAREN LBRACE body RBRACE       #setupDefinition;
loopDef: PROC LOOP LPAREN RPAREN LBRACE body RBRACE         #loopDefinition;

comment: COMMENT                                            #commentDel
       | LINECOMMENT                                        #commentDel;

//Lexer Rules

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

SETUP: 'setup';
LOOP: 'loop';
FUNC: 'func ';
PROC: 'proc ';

SFLOAT: (NEGATIVE)? FLOAT;
FLOAT : [0-9]+|[0-9]+'.'[0-9]+;

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

HIGH: 'HIGH';
LOW: 'LOW';
TOGGLE: 'TOGGLE';
BOOL: TRUE | FALSE;
TRUE: 'true';
FALSE: 'false';
PINMODE: OUT | IN;
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