grammar T;

options{
        language = Java;     
       //backtrack = true;   
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
                | addTuple1
                ;
        

tuple returns [String s] : '(' value tail ')'  {$s = $value.text + $tail.text;}
                                ;       

tail returns [String s] : ',' value tail | ;

value returns [String s] :      Integer       {$s = $Integer.text;} 
                                | String        {$s = $String.text;}
                                | tuple         {$s = $tuple.text;}
                                | ID            {$s = $ID.text;}
                                
                                ;

// assignment returns [String s] : ID '=' value {h.initMap($ID.text, $value.text); }
//                                 ;

assignment returns [String s] :   i1=ID '=' Integer {h.initMapInt($i1.text, $Integer.text);}
                                | i2=ID '=' String  {h.initMapStr($i2.text, $String.text);}
                                | i3=ID '=' tuple  {h.initMapTup($i3.text, $tuple.text);}
                                | i4=ID '=' i5=ID {h.initMapID($i4.text, $i5.text);}
                                ;

print returns [String s] : 'print(' ID ')' {h.printID($ID.text);}
                          | 'print(' String ')' {h.printString($String.text);}
                          | 'print(' Integer ')' {System.out.println($Integer.text);}
                          | 'print(' tuple ')' {System.out.println($tuple.text);}
                          | 'print('id2=ID '[' Integer ']' ')' {h.printGet($id2.text,$Integer.text);}
                         ;            

addInt1 : ID '=' i1=Integer '+' addInt2 {h.addInteger($ID.text, $i1.text, $addInt2.i); }  ; //{System.out.println($i1.text + $addInt2.i);};
addInt2 returns [String i]  : (i2=Integer | i2=Integer '+') {$i=$i2.text;};

addStr1 : ID '=' i1=String '+' i2=addStr2 {h.addString($ID.text, $i1.text, $addStr2.i); } ;
addStr2 returns [String i]  :( i2=String | i2=String '+')  {$i=$i2.text;} ; 

// addTuple1 : ID '=' i1=tuple '+' i2=tuple addTuple2 {h.addTuple($ID.text, $i1.text, $addTuple2.s); } ;
// addTuple2 returns [String s]  : ('+' tuple addTuple2 | ){$s=$tuple.text;} ;

// addTuple1 : ID '=' i1=tuple addTuple2 ;//{h.addTuple($ID.text, $i1.text, $i2.text);};
// addTuple2 returns [String s]: ('+' tuple) (addTuple2 | ) ;

addTuple1 : ID '=' i1=tuple '+' tuple i2=addTuple2 {h.addTuple($ID.text, $i1.text, $i2.s);};
addTuple2 returns [String s]:     tuple {$s=$tuple.text;}
                                 | tuple '+' {$s=$tuple.text;} ;

//addID

unpacking returns [String s]  : '(' unpacking2 '=' ID ;//{h.unpack();}; 
unpacking2 returns [String s] : (ID ',' unpacking2) | (ID ')'| ')');

slicing returns [String s] :       id1=ID '=' id2=ID '[' i1=Integer ':' i2=Integer ']'  {h.slice1($id1.text, $id2.text, $i1.text, $i2.text);}  
                                |  id1=ID '=' id2=ID '[' Integer ':' ']'   {h.slice2($id1.text,$id2.text,$Integer.text);}                                        
                                |  id1=ID '=' id2=ID '[' ':' Integer ']'   {h.slice3($id1.text,$id2.text,$Integer.text);}                                         
                               ;
indexing returns [String s] :      id1=ID '=' id2=ID '[' Integer ']' {h.indexAssign($id1.text,$id2.text,$Integer.text);} 
                                |  id1=ID '[' id2=Integer ']' '=' id3=Integer {h.replaceIntStr($id1.text,$id2.text,$id3.text);}
                                |  id1=ID '[' id2=Integer ']' '=' id3=String {h.replaceIntStr($id1.text,$id2.text,$id3.text);}
                                |  id1=ID '[' id2=Integer ']' '=' id5=tuple {h.replaceTup($id1.text,$id2.text,$id5.text);}
                                  ;
fragment Digit : '0' ..'9' ;
Integer : '-'? (Digit) + ;
String : '"' (Digit | ('a'..'z'|'A'..'Z') | ' ' )* '"';
ID : ('a'..'z'| 'A'..'Z')(Digit| ('a'..'z'| 'A'..'Z'))* ;
WS : (' '|'\t'|'\n'|'\r')+ {skip();};

