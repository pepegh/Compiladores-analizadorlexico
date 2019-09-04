/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.io.FileReader;

/**
 *
 * @author pepeg
 */
public class main {
    
    public static void main(String[] args){
    
    String[] opciones = new String[3];
            
            opciones[0] = "-d";
            opciones[1] = "src/ejemplo";
            opciones[2] = "src/ejemplo/numero.jflex";
            jflex.Main.main(opciones);
            
    }
    
}
