/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficheros.lectura;

import Personas.Alumno;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tperezrodriguez
 */
public class LeerObxetos {
    Scanner sc;
    File file1;
    
    public void leerObxetos(){
        String linea;
        String [] lista ; //creamos un array para poder usar el split porque esto nos devuelve un array
        Alumno al; //instanciamos esta variable para poder crear después un objeto de tipo alumno
         ArrayList lSuspensos = new ArrayList();
        
        try {
            sc= new Scanner(new File("src/txt/alumnos.txt"));
             while(sc.hasNextLine()) {
                 linea= sc.nextLine();
                 lista = new String [2]; //le damos un tamaño al array
                lista = linea.split(", ");
                 
               al= new Alumno(lista[0], Integer.parseInt(lista[1])); //la posicion 0 es el nombre y la posicion 1  es la nota
                 System.out.println(al);
                 
                  if (Integer.parseInt(lista[1])<5) {
                      lSuspensos.add(al);
                      System.out.println(lSuspensos);//para mostrar al alumno añadido
                  }
             }
            
        } catch (FileNotFoundException ex) {
            System.out.println("erro4: "+ ex.getMessage());
        }
    }
}
