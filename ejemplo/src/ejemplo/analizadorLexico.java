/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author compis
 */
public class analizadorLexico {
    
    public static void main(String argv[]) throws IOException {
       Numero analizadorLexico = null;
       
        try {
            analizadorLexico = new Numero(new java.io.FileReader("src\\ejemplo\\entrada.txt"));
            while ( ! analizadorLexico.zzAtEOF ){
            analizadorLexico.next_token();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(analizadorLexico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
