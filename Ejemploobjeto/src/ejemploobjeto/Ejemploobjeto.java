/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjeto;

/**
 *
 * @author tperezrodriguez
 */
public class Ejemploobjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Semaforo semaforo1 = new Semaforo();   //Instancio un objeto de tipo semaforo
        Semaforo semaforo2 = new Semaforo();
        Semaforo semaforo3 = new Semaforo();

        semaforo1.darCor("rojo");
        String respuesta = semaforo1.dimeCor();
        System.out.println(respuesta);

        semaforo2.darCor("amarillo");
        respuesta = semaforo2.dimeCor();
        System.out.println(respuesta);

        semaforo3.darCor("verde");
        System.out.println(semaforo3.dimeCor());

    }
}
