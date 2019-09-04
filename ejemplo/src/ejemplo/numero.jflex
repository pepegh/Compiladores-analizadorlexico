/* archivo numero.jflex */
package ejemplo;


import java.util.ArrayList;
%%



%cup
%class Numero


%line
%column


%{
    public ArrayList<Token> tokens;
%}

%init{
    this.tokens = new ArrayList<>();
%init}


decimales = [0-9]+
bin = [0|1|00|01|10|11]+

imprimir = "print"

findelinea = \n|\r|\r\n
ignorar = {findelinea} | [ \t\f]  

%%

{bin} {
            System.out.println("Encontre un binario Lexema: " + yytext());
            System.out.println("Encontrado en :" + yyline + "-" + yycolumn);
            tokens.add(new Token("binario",yytext()));
           }

{decimales} {
            System.out.println("Encontre un decimal Lexema: " + yytext());
            System.out.println("Encontrado en :" + yyline + "-" + yycolumn);
            tokens.add(new Token("decimal",yytext()));
            }

{ignorar}   { }


. { }
