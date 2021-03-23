/*-***
 * This grammar is defined for the example grammar defined in the
 *project part 1 instructions
 */

/*
 * NOTE: make sure that the java cup runtime file is in the same directory as this file
 * it is also alright if the runtime location is added to to the classpath, but just
 * putting in the same file is far easier.
 */
import java_cup.runtime.*;


%%
/*-*
 * LEXICAL FUNCTIONS:
 */

%cup
%line
%column
%unicode
%class ExampleScanner

%{

Symbol newSym(int tokenId) {
    return new Symbol(tokenId, yyline, yycolumn);
}

Symbol newSym(int tokenId, Object value) {
    return new Symbol(tokenId, yyline, yycolumn, value);
}

%}


/*-*
 * PATTERN DEFINITIONS:
 */ 

tab           = \\t
newline       = \\n
slash         = \\
letter        = [A-Za-z]
digit         = [0-9]
id            = {letter}({letter}|{digit})* 
intlit        = {digit}+
floatlit      = {digit}+ \. {digit}+
charlit       = \' [^\'\\] \'
strlit        = \" [^\n\t\\\"]* \"
inlinecomment = {slash}{slash}.*\n
blockcomment  = {slash} \* (.|\n)* \* {slash}
whitespace    = [ \n\t\r]

%%
/**
 * LEXICAL RULES:
 */
class              { return newSym(sym.CLASS, "class"); }
final              { return newSym(sym.FINAL, "final"); }

read               { return newSym(sym.READ, "read"); }
print		       { return newSym(sym.PRINT, "print"); }
printline		   { return newSym(sym.PRINTLINE, "printline"); }
return		       { return newSym(sym.RETURN, "return"); }

if		           { return newSym(sym.IF, "if"); }
else		       { return newSym(sym.ELSE, "else"); }
while		       { return newSym(sym.WHILE, "while"); }

"["                { return newSym(sym.OPEN_SQUARE, "["); }
"]"                { return newSym(sym.CLOSED_SQUARE, "]"); }
"("                { return newSym(sym.OPEN_BRACKET, "("); }
")"                { return newSym(sym.CLOSED_BRACKET, ")"); }
"{"                { return newSym(sym.OPEN_FLOWER, "{"); }
"}"                { return newSym(sym.CLOSED_FLOWER, "}"); }

void               { return newSym(sym.VOID, "void"); }
int                { return newSym(sym.INT, "int"); }
char               { return newSym(sym.CHAR, "char"); }
bool               { return newSym(sym.BOOL, "bool"); }
float              { return newSym(sym.FLOAT, "float"); }

"?"                { return newSym(sym.QUESTION, "?"); }
":"                { return newSym(sym.COLON, ":"); }
"+"                { return newSym(sym.PLUS, "+"); }
"-"                { return newSym(sym.MINUS, "-"); }
"*"                { return newSym(sym.MULT, "*"); }
"/"                { return newSym(sym.DIVIDE, "/"); }
"++"               { return newSym(sym.INCREMENT, "++"); }
"--"               { return newSym(sym.DECREMENT, "--"); }
">"                { return newSym(sym.GT, ">"); }
"<"                { return newSym(sym.LT, "<"); }
">="               { return newSym(sym.GTE, ">="); }
"<="               { return newSym(sym.LTE, "<="); }
"=="               { return newSym(sym.EQUALITY, "=="); }
"<>"               { return newSym(sym.NOTEQUAL, "<>"); }
"~"                { return newSym(sym.NOT, "~"); }
"||"               { return newSym(sym.OR, "||"); }
"&&"               { return newSym(sym.AND, "&&"); }
"="                { return newSym(sym.ASSIGN, "="); }
","                { return newSym(sym.COMMA, ","); }
";"                { return newSym(sym.SEMI, ";"); }

true               { return newSym(sym.TRUE, "true"); }
false              { return newSym(sym.FALSE, "false"); }

{id}               { return newSym(sym.ID, yytext()); }
{intlit}           { return newSym(sym.INTLIT, new Integer(yytext())); }
{floatlit}         { return newSym(sym.FLOATLIT, new Float(yytext())); }
{charlit}          { return newSym(sym.CHARLIT, new String(yytext()));}
{strlit}           { return newSym(sym.STRLIT, new String(yytext())); }

{inlinecomment}    { return newSym(sym.INLINE_COMMENT, yytext()); }
{blockcomment}     { return newSym(sym.BLOCK_COMMENT, yytext()); }
{whitespace}       { /* Ignore whitespace. */ }
.                  { System.out.println("Illegal char, '" + yytext() +
                    "' line: " + yyline + ", column: " + yychar); } 