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
public class Semaforo {
    //Atributos

    private String cor;

    //Metodos de acceso
    public void darCor(String c) {
        cor = c;
    }

    public String dimeCor() {
        return cor;
    }
}
