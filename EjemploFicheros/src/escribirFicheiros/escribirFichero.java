/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirFicheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tperezrodriguez
 */
public class escribirFichero {
    File fich; // creo objeto de tipo file para darle la ruta
    PrintWriter escribir; //para poder escribir en el fichero
    FileWriter escribir2;
    
    public void escribirFrasesPrintWriter(){
        
            try {
                /*método uno para declararlo*/
                 fich = new File("frases.txt");
                escribir = new PrintWriter(fich);
                
                /*método dos para declararlo*/
                //  escribir = new PrintWriter(new File("frases.txt"));

          escribir.println("Frase uno");
         escribir.println("Frase dos");
         escribir.println("Frase intermedia");
          escribir.println("Frase tres");
          escribir.println("Frase cuatro");

        } catch (FileNotFoundException ex) {
            System.out.println("erro de escritura");
        }
        
            finally {
                escribir.close();
            }
    }
    
    
    public void escribirFrasesconFileWriter(){
        try {
            escribir2 = new FileWriter(new File("frases2.txt"),true);
            
            escribir2.write("Frase uno\n");
          escribir2.write("Frase dos\n");
          escribir2.write("Frase tres\n");
           escribir2.close();
        } catch (IOException ex) {
            Logger.getLogger(escribirFichero.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
