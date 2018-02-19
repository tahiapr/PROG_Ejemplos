/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficheros.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tperezrodriguez
 */
public class LeerPalabras {
    
    public void leerPalabras(){
        File file2 = new File ("src/txt/primero.txt");
        try {
            Scanner sc = new Scanner (file2).useDelimiter("\\s*,\\s*"); //para usar cualquier cosa que vaya antes y después de la coma
            
            while (sc.hasNext()) {
                System.out.println(sc.next());   
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro2: "+ ex.getMessage());
        }
    }
}
