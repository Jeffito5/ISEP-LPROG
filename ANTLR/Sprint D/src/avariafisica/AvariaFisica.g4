grammar AvariaFisica; // nome da gramática

@parser::header { // classes a incluir
    import java.util.*;
    import java.lang.*;
    import java.io.*;
}

@parser::members { // HashMap para guardar valores das variáveis
	Map<String, Integer> memory = new HashMap<String, Integer>();

	public static void main(String[] args){
	    System.out.println("sadasdasd");
	}
}

//avariaFis -> <descrição> <local> <equipamento> <data>

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/** Regra inicial; começa o parsing aqui. */
inicio: expr+ ;
//a=descrição (opcional) / b=local (obrigatório) / c=equipamento (obrigatório) / d=data (obrigatório)
expr: a=desc ';' b=loc_equip ';' c=loc_equip ';' d=data # descLocEquipData //aceita a frase com todos os campos
    | b=loc_equip ';' c=loc_equip ';' d=data NEWLINE # locEquipData // aceita com local, equipamento e data
    | a=loc_equip ';' b=loc_equip ';' c=loc_equip ';' d=data NEWLINE {System.out.println("Dados incompletos. Tente novamente.");} #erro  // aceita com local, equipamento e data
    //| a=desc ';' b=loc_equip ';' d=data NEWLINE { System.out.println("Dados incompletos. Tente novamente.");} // não aceita com descrição, local e data
    //| c=loc_equip ';' d=data NEWLINE { System.out.println("Dados incompletos. Tente novamente.");} // não aceita com equipmento e data
    //| b=loc_equip ';' d=data NEWLINE { System.out.println("Dados incompletos. Tente novamente.");} // não aceita com local e data
    ;

data: WS dia SEPARATOR mes SEPARATOR ano
    | dia SEPARATOR mes SEPARATOR ano;

mes : JAN | FEB | MAR | APR | MAY | JUN | JUL | AUG | SEP | OCT | NOV | DEC ;

dia: DIGIT1 | DIGIT2 | TRINTA | TRINTA_E_UM | WS ;

ano: ANO4;

loc_equip: (LOCAL_EQUIPAMENTO | WS)+ ;
desc: (DESCRICAO | WS)+ ;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// lexer rule
LOCAL_EQUIPAMENTO: [A-Z]+ ;
DESCRICAO: [a-z]+ ;

//anos
ANO4 : DIGIT1 DIGIT1 DIGIT1 DIGIT1;

//meses
JAN : [0][1] ;
FEB : [0][2] ;
MAR : [0][3] ;
APR : [0][4] ;
MAY : [0][5] ;
JUN : [0][6] ;
JUL : [0][7] ;
AUG : [0][8] ;
SEP : [0][9] ;
OCT : [1][0] ;
NOV : [1][1] ;
DEC : [1][2] ;

// dias
DIGIT1 : [0-9];
DIGIT2: [1-2][0-9];
TRINTA: '30' ;
TRINTA_E_UM: '31' ;

//separadores
SEPARATOR : [/()] ;

NEWLINE:'\r'? '\n' ;  // devolve o fim de linha para
                      // terminar a expressão
WS : [ \t]+ ;

//se houver descrição tem de haver local
