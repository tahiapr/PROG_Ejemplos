/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherdanza;

/**
 *
 * @author tperezrodriguez
 */
public class Ejemploherdanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Estudiante e1 = new Estudiante("Lorenzo","Robles",25,"EST3456",8);
        e1.amosar();
        System.out.println(e1.toString());
    
    }

}
