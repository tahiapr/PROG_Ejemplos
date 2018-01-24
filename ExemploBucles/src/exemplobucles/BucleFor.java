/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobucles;

import java.util.Scanner;

/**
 *
 * @author tperezrodriguez
 */
public class BucleFor {
     public void calcularFor(){
        Scanner sc = new Scanner(System.in);
        
        int cont = 0;
        int suma = 0;
        int mul = 1;
        
        for(cont=0; cont<7; cont++){
            System.out.println("Introduzca un numero: ");
            int num = sc.nextInt();
            suma+=num;
            mul*=num;
        }
        
        System.out.println("Suma: "+suma+"\nMultiplicacion: "+mul);
    }
    
}
