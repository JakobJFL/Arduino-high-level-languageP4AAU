grammar Ahll;
//Parse Rules
program : setupDef loopDef content
        | loopDef setupDef content
        | content loopDef setupDef
        | content setupDef loopDef;

content : funcDef | varDecl END | funcDef content | varDecl END content;

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
     | stmt body;

funcCall : ID LPAREN args RPAREN;
args     : (expr (',' expr)*)?;

stmt : varDecl END
     | assign END
     | returnExpr END
     | funcCall END
     | pinFunction END
     | ifStmt
     | whileExpr;


assign: ID '=' expr;

pinFunction: ID '.Write' LPAREN con RPAREN;
con: HIGH | LOW | INT | ID;

varDecl : TYPE ID
        | TYPE ID '=' expr
        | pinLiteral;
expr : operand | operand operator operand | funcCall;

operand : ID
        | literal;

literal: INT | BOOL;

operator : RELATIONAL | ARITHMETIC | LOGICAL;

returnExpr : RETURN expr;

ifStmt: IF LPAREN expr RPAREN LBRACE body RBRACE elseStmt;

elseStmt : (ELSE LBRACE body RBRACE)?
         | ELSE ifStmt;

//loopStructure : whileExpr
//              | forExpr;
whileExpr : WHILE LPAREN expr RPAREN LBRACE body RBRACE;

pinLiteral: 'Pin ' ID '{'PINNUMBER','PINMODE'}';

//Lexer Rules

TYPE: 'Number ' | 'Bool ' | 'String ' | 'Pwm ';

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
ELSE: 'else';
HIGH: 'HIGH';
LOW: 'LOW';
RETURN: 'return';

PINMODE: 'out' | 'in';

IF : 'if';
WHILE : 'while';

PINNUMBER: 'D' [0-9]+ | 'A' [0-9]+;
ID: [a-zA-Z_] [a-zA-Z_0-9]* ;

INT : [0-9]+;
BOOL : 'true' | 'false';

RELATIONAL : | '<' | '>' | '==' | '!=' ;
ARITHMETIC :  '+' | '-' | '/' | '*' | '%' ;
LOGICAL : '&&' | '||' | '!';

Letter : [a-zA-Z]+;
Char : INT | [_];

WS : (' '|'\t'|NEWLINE)+ -> skip;
NEWLINE : ('\r\n'|'\n'|'\r');