grammar Mapping;

@parser::header {
  package org.wso2.datamapper.parsers;
  import java.util.*;
}

@lexer::header {
  package org.wso2.datamapper.parsers;
}

stat: function '(' arg '.' arg (',' arg '.' arg)* ')'               
    ;

function: ID
		;

arg: ID
   ;

ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace