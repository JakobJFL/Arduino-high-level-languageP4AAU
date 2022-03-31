grammar Ahll;
//Parse Rules
program : content;

content : funcDef;

funcDef : head '{' body '}' | '{}';

head : FUNC id '()'
     | FUNC id '('parameters')'
     | FUNC type id '('parameters')';
parameters : parameter
           | parameter ',' parameters;
parameter : type id;

body : stmt ';'
     | stmt ';' body;
stmt : varDecl
     | returnstmt
     | ifstmt
     | assign;

assign: id '=' expr;

varDecl : type id | type id '=' expr;
expr : operand | operand operator operand;

operand : IDENTIFIER
        | LITERAL;

operator : RELATIONAL | ARITHMETIC | LOGICAL;

returnstmt: ;
ifstmt: ;

type: PIN | NUMBER | BOOL | STRING | PWM;
id : (LETTER | CHAR);


//Lexer Rules
WS : (' '|'\t'|NEWLINE)+ -> skip;
NEWLINE : ('\r\n'|'\n'|'\r');

FUNC: 'func ';

pinLiteral:     'Pin' pinName '{'pinNumber','pinType'}';
pinName:        IDENTIFIER;
pinNumber:      PINNUMBER;
pinType:        'output' | 'input';

PINNUMBER:      'D' [0-9]+ | 'A' [0-9]+;
IDENTIFIER:     [a-zA-Z_] [a-zA-Z_0-9]* ;

RELATIONAL : | '<' | '>' | '==' | '!=' ;
ARITHMETIC :  '+' | '-' | '/' | '*' | '%' ;
LOGICAL : '&&' | '||' | '!';

Letter : [a-zA-Z]+;
Char : Number | [_];
Number : [0-9]+;