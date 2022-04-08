grammar Ahll;
//Parse Rules
program: content;

content: funcDef?
       | funcDef content
       | setupDef loopDef content
       | loopDef setupDef content
       | varDecl END content
       | comment content;

funcDef: head LBRACE body RBRACE;

head: FUNC ID LPAREN RPAREN
    | FUNC TYPE ID LPAREN RPAREN
    | FUNC ID LPAREN parameters RPAREN
    | FUNC TYPE ID LPAREN parameters RPAREN;

parameters: parameter
          | parameter ',' parameters;

parameter: TYPE ID;

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

varDecl: TYPE ID
       | TYPE ID EQUAL expr
       | pinLiteral
       | arrayDef;

expr: NEG? operand (operator expr)?             # operandExpr
    | NEG? readFunc (operator expr)?            # readFuncExpr
    | NEG? LPAREN expr RPAREN (operator expr)?  # parensOpExpr
    | arrayStmt (operator expr)?                # arrayExpr;

operand: ID
       | NEGATIVE? INT
       | BOOL
       | funcCall;

operator: RELATIONAL | ARITHMETIC | LOGICAL;

readFunc: ID READPWM LPAREN RPAREN
        | ID READA LPAREN RPAREN
        | ID READD LPAREN RPAREN;

arrayStmt: ID LBRACKET value RBRACKET;
value: INT | ID;

pinLiteral: PIN ID LBRACE PINNUMBER ',' PINMODE RBRACE;

arrayDef: TYPE ID LBRACKET INT RBRACKET;

assign: ID EQUAL expr;

returnExpr: RETURN expr;

funcCall: call | call '.' funcCall;
call: ID LPAREN args RPAREN;
args: (expr (',' expr)*)?;

writeFunc: ID WRITE LPAREN val RPAREN;
val: HIGH | LOW | NEGATIVE? INT | ID | TOGGLE;

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

RELATIONAL: '<' | '>' | '==' | '!=';
ARITHMETIC: PLUS | MINUS | DIVIDE | MULT | MODULU;
LOGICAL: '&&' | '||';
NEG: '!';
PLUS: '+';
MINUS: '-';
DIVIDE: '/';
MULT: '*';
MODULU: '%';

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
LBRACKET: '[';
RBRACKET: ']';
END: ';';
EQUAL: '=';
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
ID: [a-zA-Z_] [a-zA-Z_0-9]*;
INT: [0-9]+;

COMMENT: '/*' .*?  '*/' -> skip;
LINECOMMENT: '//' ~( '\r' | '\n' )* -> skip;

WS: (' '|'\t'|NEWLINE)+ -> skip;
NEWLINE: ('\r\n'|'\n'|'\r');