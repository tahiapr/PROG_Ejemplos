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
public class ExemploBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        BucleWhile bw = new BucleWhile();
        BucleDoWhile bdw = new BucleDoWhile();
        BucleFor bf = new BucleFor();
        int op;

        do {
            System.out.println("\t****** MENU ******\n");
            System.out.println("\t1)WHILE \n\t2)DO...WHILE\n\t3)FOR\n\t0)SALIR \n");
            System.out.print("\tElige una opcion   ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    bw.calcularWhile();
                    break;
                case 2:
                    bdw.calcularDoWhile();
                    break;
                case 3:
                    bf.calcularFor();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("La opcion intoducida no es valida");
            }
        } while (op != 0);
    }

}
