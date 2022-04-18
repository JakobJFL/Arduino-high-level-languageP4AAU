grammar Hlmp;
//Parse Rules
program: content;

content: funcDef?
       | funcDef content
       | setupDef loopDef content
       | loopDef setupDef content
       | varDecl END content
       | comment content;

funcDef: head LBRACE body RBRACE;

head: FUNC id LPAREN RPAREN
    | FUNC TYPE id LPAREN RPAREN
    | FUNC id LPAREN parameters RPAREN
    | FUNC TYPE id LPAREN parameters RPAREN;

id : ID;

parameters: parameter
          | parameter ',' parameters;

parameter: TYPE id;

body: stmt?
    | stmt body
    | funcDef body
    | comment body;

stmt: varDecl END
    | assign END
    | returnExpr END
    | funcCall END
    | writeFunc END
    | readFunc END
    | ifStmt
    | whileExpr;

varDecl: TYPE id
       | TYPE id ASSIGN expr
       | pinLiteral;

expr: NEG? operand (operator expr)?
    | NEG? readFunc (operator expr)?
    | NEG? LPAREN expr RPAREN (operator expr)?;

operand: id
       | sInt
       | BOOL
       | funcCall;

sInt: NEGATIVE? INT;

operator: relational | ARITHMETIC | LOGICAL;
relational: RELATIONAL;

readFunc: id READPWM LPAREN RPAREN
        | id READA LPAREN RPAREN
        | id READD LPAREN RPAREN;


pinLiteral: PIN id LBRACE PINNUMBER ',' PINMODE RBRACE;

assign: id ASSIGN expr;

returnExpr: RETURN expr;

funcCall: call | call '.' funcCall;
call: id LPAREN args RPAREN;
args: (expr (',' expr)*)?;

writeFunc: id WRITE LPAREN val RPAREN;
val: HIGH | LOW | sInt | id | TOGGLE;

ifStmt: IF LPAREN expr RPAREN LBRACE body RBRACE elseStmt;
elseStmt: (ELSE LBRACE body RBRACE)?
        | ELSE ifStmt;

whileExpr: WHILE LPAREN expr RPAREN LBRACE body RBRACE;

setupDef: FUNC SETUP LPAREN RPAREN LBRACE body RBRACE;
loopDef: FUNC LOOP LPAREN RPAREN LBRACE body RBRACE;

comment: COMMENT
       | LINECOMMENT;

//Lexer Rules

TYPE: 'Num ' | 'Bool ' | 'Pwm ';
PIN: 'Pin ';

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
BOOL: 'true' | 'false';

IF: 'if';
ELSE: 'else';
RETURN: 'return';
WHILE: 'while';

PINNUMBER: 'D' [0-9]+ | 'A' [0-9]+;
INT: [0-9]+;
ID: [a-zA-Z_] [a-zA-Z_0-9]*;

COMMENT: '/*' .*?  '*/' -> skip;
LINECOMMENT: '//' ~( '\r' | '\n' )* -> skip;

WS: (' '|'\t'|NEWLINE)+ -> skip;
NEWLINE: ('\r\n'|'\n'|'\r');