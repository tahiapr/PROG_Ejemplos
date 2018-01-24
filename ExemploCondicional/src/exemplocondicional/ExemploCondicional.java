/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocondicional;

import java.util.Scanner;

/**
 *
 * @author tperezrodriguez
 */
public class ExemploCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero:");
        int num1 = sc.nextInt();
        System.out.println("Introduzca otro numero:");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Los numeros son iguales");
        } else if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println(num1 + " es menor que " + num2);
        }

        //Tamen se pode facer asi:
        //String respuesta = (num1>num2)?num1+" es mayor que "+num2:num1+" es menor que "+num2;
        //System.out.println(respuesta);
    }
}
