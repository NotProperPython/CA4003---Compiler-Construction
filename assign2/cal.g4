grammar 				cal;

prog:					decl_list function_list  main;

decl_list:              decl SEMI decl_list
                        |;

decl:                   var_decl
                        | const_decl;

type:                   Integer | Boolean | Void;



var_decl:               Variable ID COLON type;

const_decl:             Constant ID COLON type ASSIGN expression;

function_list:          function function_list
                        |;

function:               type ID LBR parameter_list RBR Is
                        decl_list
                        Begin
                        statement_block
                        Return LBR expression RBR SEMI
                        End;

parameter_list:         nemp_parameter_list
                        |;

nemp_parameter_list:    ID COLON type                                   # NempParam
                        | ID COLON type COMMA nemp_parameter_list       # NempParamList
                        ;      

main:                   Main 
                        Begin 
                        decl_list 
                        statement_block 
                        End;

statement_block:        statement statement_block
                        |
                        ;

statement:              ID ASSIGN expression SEMI                           
                        | ID LBR arg_list RBR SEMI
                        | Begin statement_block End
                        | If condition Begin statement_block End
                        | Else Begin statement_block End
                        | While condition Begin statement_block End
                        | Sskip SEMI 
                        ;

expression:             fragment_ binary_arith_op fragment_
                        | LBR expression RBR
                        | ID LBR arg_list RBR
                        | fragment_
                        |
                        ;

binary_arith_op:        op=(PLUS | MINUS);

fragment_:              ID 
                        | MINUS ID 
                        | NUMBER 
                        | True 
                        | False  
                        | binary_arith_op fragment_
                        | LBR expression RBR
                        | ID LBR arg_list RBR
                        ;

condition:              NOT condition 
                        | LBR condition RBR
                        | expression comp_op expression
                        | condition op=(OR | AND) condition
                        ;

comp_op:                EQUAL | NOT_EQUAL | LESS_THAN | LESS_THAN_EQUAL_TO | GREATER_THAN | GREATER_THAN_EQUAL_TO;

arg_list:               nemp_arg_list
                        |;

nemp_arg_list:          ID | ID COMMA nemp_arg_list;
							


fragment ZERO:              [0];
fragment DIGIT: 			[0-9];
fragment LETTER: 			[a-zA-Z];
fragment UnderScore:		'_';


fragment A: 				'a' | 'A';
fragment B: 				'b' | 'B';
fragment C: 				'c' | 'C';
fragment D: 				'd' | 'D';
fragment E: 				'e' | 'E';
fragment F: 				'f' | 'F';
fragment G: 				'g' | 'G';
fragment H: 				'h' | 'H';
fragment I: 				'i' | 'I';
fragment J: 				'j' | 'J';
fragment K: 				'k' | 'K';
fragment L: 				'l' | 'L';
fragment M: 				'm' | 'M';
fragment N: 				'n' | 'N';
fragment O: 				'o' | 'O';
fragment P: 				'p' | 'P';
fragment Q: 				'q' | 'Q';
fragment R: 				'r' | 'R';
fragment S: 				's' | 'S';
fragment T: 				't' | 'T';
fragment U: 				'u' | 'U';
fragment V: 				'v' | 'V';
fragment W: 				'w' | 'W';
fragment X: 				'x' | 'X';
fragment Y: 				'y' | 'Y';
fragment Z: 				'z' | 'Z';


Begin: 				    	B E G I N;
Is: 						I S;
Variable: 					V A R I A B L E;
Constant: 					C O N S T A N T;
Return: 					R E T U R N;
Integer: 					I N T E G E R;
Boolean: 					B O O L E A N;
Void: 						V O I D;
Main: 						M A I N;
If: 						I F;
Else: 						E L S E;
True: 						T R U E;
False: 			    		F A L S E;
While: 				    	W H I L E;
Sskip: 				    	S K I P;
End: 						E N D;

COMMA: 			    		',';
SEMI: 						';';
COLON: 			    		':';
ASSIGN: 					':=';
LBR: 						'(';
RBR: 						')';
PLUS: 						'+';
MINUS: 			    		'-';
NOT: 						'~';
OR: 						'|';
AND: 						'&';
EQUAL: 			    		'=';
NOT_EQUAL: 		    		'!=';
LESS_THAN: 		    		'<';
LESS_THAN_EQUAL_TO: 		'<=';
GREATER_THAN: 				'>';
GREATER_THAN_EQUAL_TO:		'>=';



ID: 						LETTER ( LETTER | DIGIT | UnderScore )*;
NUMBER: 					ZERO | MINUS? [1-9] (DIGIT)*;
BOOLEAN:					'true' | 'false';


WS:							[ \t\n\r]+ -> skip;
COMMENT: 					'/*' (COMMENT|.)*? '*/' -> skip;
LINE_COMMENT: 				'//' ~[\r\n]* -> skip;