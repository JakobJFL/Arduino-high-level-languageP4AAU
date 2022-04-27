grammar Hlmp;
//Parse Rules
program: content+;

content: funcProc                                           #cntFuncProc
       | setupDef                                           #standardFunc
       | loopDef                                            #standardFunc
       | varDecl END                                        #cntvarDecl
       | comment                                            #cntComment;

funcProc: funcHead LBRACE body* RBRACE                      #funcDefinition
        | procHead LBRACE body* RBRACE                      #procDefinition;

funcHead: FUNC type id LPAREN RPAREN
        | FUNC type id LPAREN (parameter (',' parameter)*)? RPAREN;

procHead: PROC id LPAREN RPAREN
        | PROC id LPAREN (parameter (',' parameter)*)?  RPAREN;

id : ID                                                     #identifier;

parameters: parameter                                       #params
          | parameter ',' parameters                        #params;

parameter: type id                                          #param;

type: NUMTYPE | BOOLTYPE | PWMTYPE | PINTYPE                #types;

body: funcProc                                              #bodyStmt
    | stmt                                                  #bodyStmt
    | comment                                               #bodyComment;

stmt: varDecl END                                           #stmtVarDecl
    | assign END                                            #stmtAssign
    | returnExpr END                                        #stmtReturnExpr
    | funcCall END                                          #stmtFuncCall
    | writeFunc END                                         #stmtWriteFunc
    | readFunc END                                          #stmtReadFunc
    | ifStmt                                                #stmtIfStmt
    | whileExpr                                             #stmtWhileExpr;

varDecl: type id                                            #varDeclaration
       | type id ASSIGN expr                                #varDeclaration
       | pinLiteral                                         #varDeclPinLiteral;

expr: operand                                               #exprOperand
    | readFunc                                              #exprReadFunc
    | LPAREN expr RPAREN                                    #exprParenthesised
    | op=NEG expr                                           #exprUnaryOp
    | op=NEGATIVE expr                                      #exprMinusPrefix
    | left=expr op=(DIVIDE|MULT) right=expr                 #exprBinaryOp
    | left=expr op=(PLUS|MINUS|MODULU) right=expr           #exprBinaryOp
    | left=expr op=(LESSTHAN|GREATERTHAN) right=expr        #exprBinaryOp
    | left=expr op=(EQUAL|NOTEQUAL) right=expr              #exprBinaryOp
    | left=expr op=LOGAND right=expr                        #exprBinaryOp
    | left=expr op=LOGOR right=expr                         #exprBinaryOp;


operand: id                                                 #operandId
       | SINT                                               #operandSInt
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
   | SINT                                                   #value
   | id                                                     #valueId
   | TOGGLE                                                 #value;

ifStmt: IF LPAREN expr RPAREN LBRACE body* RBRACE elseStmt  #ifStmtDef;

elseStmt: (ELSE LBRACE body* RBRACE)?                       #elseSTtmt
        | ELSE ifStmt                                       #elseIfStmt;

whileExpr: WHILE LPAREN expr RPAREN LBRACE body* RBRACE     #whileExprDef;

setupDef: PROC SETUP LPAREN RPAREN LBRACE body* RBRACE      #setupDefinition;
loopDef: PROC LOOP LPAREN RPAREN LBRACE body* RBRACE        #loopDefinition;

comment: COMMENT                                            #commentDel
       | LINECOMMENT                                        #commentDel;

//Lexer Rules

NUMTYPE: 'Num ' ;
BOOLTYPE: 'Bool ';
PWMTYPE: 'Pwm ';
PINTYPE: 'Pin ';

RELATIONAL: LESSTHAN | GREATERTHAN | EQUAL | NOTEQUAL;
ARITHMETIC: PLUS | MINUS | DIVIDE | MULT | MODULU;
LOGICAL: LOGAND | LOGOR;
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
PINMODE: 'out' | 'in';
TOGGLE: 'TOGGLE';
BOOL: TRUE | FALSE;
TRUE: 'true';
FALSE: 'false';

IF: 'if';
ELSE: 'else';
RETURN: 'return';
WHILE: 'while';

PINNUMBER: 'D' [0-9]+ | 'A' [0-9]+;
INT: [0-9]+;
SINT: NEGATIVE? INT;
ID: [a-zA-Z_] [a-zA-Z_0-9]*;

COMMENT: '/*' .*?  '*/' -> skip;
LINECOMMENT: '//' ~( '\r' | '\n' )* -> skip;

WS: (' '|'\t'|NEWLINE)+ -> skip;
NEWLINE: ('\r\n'|'\n'|'\r');