//ex1.g4

grammar ex1;		
inicio:	HELLO WORLD;

HELLO   : [hH][eE][lL][lL][oO];
WORLD	: [wW][oO][rR][lL][dD];
NEWLINE : [\r\n]+ ;

