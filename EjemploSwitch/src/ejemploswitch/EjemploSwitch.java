/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploswitch;

import java.util.Scanner;

/**
 *
 * @author tperezrodriguez
 */
public class EjemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Clase c1 = new Clase();

        System.out.println("****** MENÚ ******");
        System.out.println("1)LUNES \n2)MARTES \n3)MIERCOLES \n4)JUEVES \n5)VIERNES \n6)SABADO \n7)DOMINGO \n");
        System.out.println("Elige una opción");
        int op = sc.nextInt();
        c1.comparar(op);
    }
}
