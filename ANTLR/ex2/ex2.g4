grammar ex2;

prog: inicio+;

inicio: inicio LINHA { printf("Expressão %s\n", $2?"Verdadeira" : "Falsa");}
	    | NEWLINE;

		//OPERADOR : MAIOR | MENOR | MENOR_I | MAIOR_I | DIFERENTE | IGUAL ;

LINHA: INTEIRO MAIOR INTEIRO
		| INTEIRO MENOR INTEIRO
		| INTEIRO MAIOR_I INTEIRO
		| INTEIRO MENOR_I INTEIRO
		| INTEIRO DIFERENTE INTEIRO
		| INTEIRO IGUAL INTEIRO
        | NEWLINE;

INTEIRO: [0-9]+;
MAIOR:'>';
MENOR:'<';
MAIOR_I:'>=';
MENOR_I:'<=';
DIFERENTE:'<>';
IGUAL:'=';
NEWLINE : [\t\r\n]+;

