grammar Ahll;
//Parse Rules
program : content;

content : funcDef?
        | funcDef content
        | setupDef loopDef content
        | loopDef setupDef content
        | varDecl END content
        | comment content;

setupDef : FUNC SETUP LPAREN RPAREN LBRACE body RBRACE;
loopDef : FUNC LOOP LPAREN RPAREN LBRACE body RBRACE;

funcDef : head LBRACE body RBRACE;

head : FUNC ID LPAREN RPAREN
     | FUNC TYPE ID LPAREN RPAREN
     | FUNC ID LPAREN parameters RPAREN
     | FUNC TYPE ID LPAREN parameters RPAREN;

parameters : parameter
           | parameter ',' parameters;
parameter : TYPE ID;

body : stmt?
     | stmt body
     | funcDef body
     | comment body;

comment : COMMENT
        | LINECOMMENT;

funcCall : call | call '.' funcCall;
call : ID LPAREN args RPAREN;
args : (expr (',' expr)*)?;

stmt : varDecl END
     | assign END
     | returnExpr END
     | funcCall END
     | writeFunc END
     | readFunc END
     | ifStmt
     | whileExpr;

assign: ID EQUAL expr;

arrayDef : TYPE ID LBRACKET uInt RBRACKET;

writeFunc: ID WRITE LPAREN val RPAREN;
val: HIGH | LOW | sInt | ID | TOGGLE;

readFunc: ID READPWM LPAREN RPAREN
        | ID READA LPAREN RPAREN
        | ID READD LPAREN RPAREN;

varDecl : TYPE ID
        | TYPE ID EQUAL expr
        | pinLiteral
        | arrayDef;

expr : NEG? operand
     | NEG? operand operator expr
     | NEG? readFunc
     | NEG? readFunc operator expr
     | NEG? LPAREN expr RPAREN
     | NEG? LPAREN expr RPAREN operator expr
     | arrayStmt operator expr
     | arrayStmt;

operand : ID
        | NEGATIVE? INT
        | BOOL
        | funcCall;

operator : RELATIONAL | ARITHMETIC | LOGICAL;

returnExpr : RETURN expr;

ifStmt: IF LPAREN expr RPAREN LBRACE body RBRACE elseStmt;

elseStmt : (ELSE LBRACE body RBRACE)?
         | ELSE ifStmt;

arrayStmt : ID LBRACKET value RBRACKET;
value : INT | ID;

whileExpr : WHILE LPAREN expr RPAREN LBRACE body RBRACE;

pinLiteral: PIN ID LBRACE PINNUMBER ',' PINMODE RBRACE;

sInt : NEGATIVE INT | INT;
uInt : INT;

//Lexer Rules

TYPE: 'Num ' | 'Bool ' | 'Pwm ';

RELATIONAL : | '<' | '>' | '==' | '!=' ;
ARITHMETIC :  '+' | '-' | '/' | '*' | '%' ;
LOGICAL : '&&' | '||';

SETUP : 'setup';
LOOP : 'loop';
FUNC: 'func ';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACKET : '[';
RBRACKET : ']';
END : ';';
EQUAL : '=';
PIN : 'Pin ';
WRITE : '.Write';
READPWM : '.ReadPwm';
READA : '.ReadAnalog';
READD : '.ReadDigital';
ELSE: 'else';
HIGH: 'HIGH';
LOW: 'LOW';
TOGGLE: 'TOGGLE';
RETURN: 'return';
IF : 'if';
WHILE : 'while';
NEG: '!';
NEGATIVE: '~';

PINMODE: 'out' | 'in';

PINNUMBER: 'D' [0-9]+ | 'A' [0-9]+;
ID: [a-zA-Z_] [a-zA-Z_0-9]* ;

INT : [0-9]+;
BOOL : 'true' | 'false';



COMMENT : '/*' .*?  '*/' -> skip;
LINECOMMENT : '//' ~( '\r' | '\n' )* -> skip;

WS : (' '|'\t'|NEWLINE)+ -> skip;
NEWLINE : ('\r\n'|'\n'|'\r');