grammar Mapping;

@parser::header {
  package org.wso2.datamapper.parsers;
  import java.util.*;
}

@lexer::header {
  package org.wso2.datamapper.parsers;
}

stat: (outputelement '=' function )+            
    ;
    
outputelement: ID (DOT ID)*
             ;

function: functionname '(' arg (',' arg)* ')'
		;
		
functionname:ID
            ;

arg: ID (DOT ID)*
   ;

DOT : [.];
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace