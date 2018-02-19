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
public class LeerNumeros {
   
    
    public void leerNumeros(){
            File file3 = new File("src/txt/numeros.txt");
        try {
            Scanner sc = new Scanner(file3).useDelimiter(", ");
            while(sc.hasNextInt()){
                System.out.println(sc.nextInt());
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("erro3: " + ex.getMessage());
        }
            
    }
    
    public void sumarNumeros() {
        File file3 = new File("src/txt/numeros.txt");
        int suma=0, num;
        
        try {
            Scanner sc = new Scanner(file3).useDelimiter(", ");
            while(sc.hasNextInt()){
              num= sc.nextInt();
               
            if (num%2==0){
                System.out.println("Los números a sumar son "+num);
                suma+=num;
                
            }
            
            }
            
            System.out.println("La suma de los números pares es "+suma);
            
        } catch (FileNotFoundException ex) {
            System.out.println("erro3: " + ex.getMessage());
        }
    }
}
