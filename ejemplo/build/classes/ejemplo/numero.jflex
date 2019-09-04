/* archivo numero.jflex */
package ejemplo;


import java.util.ArrayList;
%%



%standalone
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

imprimir = [print]+

%%

{decimales} {
            System.out.println("Encontre un decimal Lexema: " + yytext());
            System.out.println("Encontrado en :" + yyline + "-" + yycolumn);
            tokens.add(new Token("decimal",yytext()));
            }



{imprimir} {

    System.out.println("Imprimiendo lista de tokens");

    for(int i=0;i<tokens.size();i++){
    System.out.println("Token(tipo=" + tokens.get(i).getTipo() + ", lexema= " + tokens.get(i).getLexema() +")"); 
    }
}



. {System.out.println("No es un numero");}
