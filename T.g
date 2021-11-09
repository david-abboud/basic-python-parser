grammar T;

options{
        language = Java;     
        backtrack = true;   
}

@members {
        ActionRoutines h = new ActionRoutines();
 }

prog returns [String s]  : (statement)+ ;

statement :       assignment
                | print
                | unpacking
                | indexing
                | slicing  
                | addInt1 
                | addStr1
                | tupAssg
                | addID1
                | printHashmap
                ;
        

tuple returns [String s] : '(' value tail ')'  {$s = $value.text + $tail.text;}
                                ;       

tail returns [String s] : ',' value tail | ;          

tupAssg : ID '=' tuple i1=addTup {h.initMapTup($ID.text,h.addTuple($tuple.text,$i1.s));};

addTup returns [String s] : ('+' tuple i2=addTup) {$s = $s + h.addTuple($tuple.text,$i2.s);} | {$s ="";};

value returns [String s] :      Integer       {$s = $Integer.text;} 
                                | String        {$s = $String.text;}
                                | tuple         {$s = $tuple.text;}
                                | ID            {$s = $ID.text;}
                                |
                                ;

idTuple returns [String s] : '(' ID idTail ')'  {$s = $ID.text + $idTail.text;}
                                ;       

idTail returns [String s] : ',' ID idTail | ;
 
assignment returns [String s] :   i1=ID '=' Integer {h.initMapInt($i1.text, $Integer.text);}
                                | i2=ID '=' String  {h.initMapStr($i2.text, $String.text);}
                                | i4=ID '=' i5=ID {h.initMapID($i4.text, $i5.text);}
                                ;

print returns [String s] : 'print' '(' ID ')' {h.printID($ID.text);}
                        | 'print' '(' String ')' {h.printString($String.text);}
                        | 'print' '(' Integer ')' {System.out.println($Integer.text);}
                        | 'print' '(' tuple ')' {System.out.println('[' + $tuple.text.substring(1, $tuple.text.length()-1) + ']');}
                        | 'print' '('id2=ID '[' Integer ']' ')' {h.printGet($id2.text,$Integer.text);}
                        | 'print' '('')' {System.out.print("");}
                        | 'print' '(' WS ')'{System.out.print("");}
                        | 'print' '(' id3=tuple + addTup {System.out.println(h.addTuple($id3.text, $addTup.s));}
                        | 'print' '(' i1=ID '+' i2=addIDPrint ')' {System.out.println(h.addIDPrint($i1.text,$addIDPrint.i).toString());}
                        | 'print' '(' i1=Integer '+' addIntPrint ')' {System.out.println(h.addIntegerPrint($i1.text,$addIntPrint.i).toString());}
                        | 'print' '(' i1=String '+' addStrPrint ')' {System.out.println(h.addStringPrint($i1.text,$addStrPrint.i).toString());}
                       
                         ;            

addInt1 : ID '=' i1=Integer {h.initMapInt($ID.text, $i1.text);} addInt2[$ID.text]  ;
addInt2 [String I3]  : ( ('+' i2=Integer {h.addInteger($I3, $i2.text);}) addInt2[I3] ) | ('+' i2=Integer {h.addInteger($I3, $i2.text);});

addStr1 : ID '=' i1=String {h.initMapStr($ID.text, $i1.text);} addStr2[$ID.text]  ;
addStr2 [String I3] returns [String i] : ( ('+' i2=String {h.addString($I3, $i2.text);}) addStr2[I3] ) | ('+' i2=String {h.addString($I3, $i2.text);});

addID1 : i2=ID '=' i1=ID {h.initMapID($i2.text, $i1.text);} addID2[$i2.text]  ;
addID2 [String I3] returns [String i] : ( ('+' i3=ID {h.addID($I3, $i3.text);}) addID2[I3] ) | ('+' i3=ID {h.addID($I3, $i3.text);});

addIDPrint returns [String i]  :( i2=ID | i2=ID '+')  {$i=$i2.text;} ; 

addStrPrint returns [String i]  :( i2=String | i2=String '+')  {$i=$i2.text;} ; 

addIntPrint returns [String i]  :( i2=Integer | i2=Integer '+')  {$i=$i2.text;} ; 

unpacking returns [String s]  : idTuple '=' ID {h.unpack($idTuple.text,$ID.text);}
                              | idTuple '=' tuple {h.unpack2($idTuple.text,$tuple.text);}; 

slicing returns [String s] :       id1=ID '=' id2=ID '[' i1=Integer ':' i2=Integer ']'  {h.slice1($id1.text, $id2.text, $i1.text, $i2.text);}  
                                |  id1=ID '=' id2=ID '[' Integer ':' ']'   {h.slice2($id1.text,$id2.text,$Integer.text);}                                        
                                |  id1=ID '=' id2=ID '[' ':' Integer ']'   {h.slice3($id1.text,$id2.text,$Integer.text);}                                         
                               ;
indexing returns [String s] :      id1=ID '=' id2=ID '[' Integer ']' {h.indexAssign($id1.text,$id2.text,$Integer.text);} 
                                  ;
fragment Digit : '0' ..'9' ;
Integer : '-'? (Digit) + ;
String : '"' (Digit | ('a'..'z'|'A'..'Z'|'-') | ' ' )* '"';
ID : ('a'..'z'| 'A'..'Z')(Digit| ('a'..'z'| 'A'..'Z'))* ;
WS : (' '|'\t'|'\n'|'\r')+ {skip();};
Comments : ('#')~('\n'|'\r')* {skip();} ;

//Special instruction in order to print out the HashMap
printHashmap : 'tuturkeykey' {h.printHashmap();};

