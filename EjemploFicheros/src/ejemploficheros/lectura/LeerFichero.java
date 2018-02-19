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
public class LeerFichero {

    Scanner sc;

    public void lerLineas() {

       File file1 = new File ("src/txt/primero.txt"); //con un directorio dentro de la carpeta src
        // File file1 = new File("primero.txt"); //si tienes el texto dentro de la carpeta del proyecto
        try {
            sc = new Scanner(file1);

            while (sc.hasNextLine()) { //mientras haya una línea en el fichero, la leo
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Erro1: " + ex.getMessage());
        }
    }
}
