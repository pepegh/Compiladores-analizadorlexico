/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author compis
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            
            Numero analizadorNumero = new Numero(new FileReader("src/ejemplo/entrada.txt"));
            
            analizadorNumero.next_token();
            
            /*analizadorNumero.tokens.forEach((token) -> {
                System.out.println(token);});*/
            
            for (int i = 0; i<analizadorNumero.tokens.size();i++){
                System.out.println("Tipo = "+analizadorNumero.tokens.get(i).getTipo() + " Lexema = "+analizadorNumero.tokens.get(i).getLexema() );
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejemplo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
