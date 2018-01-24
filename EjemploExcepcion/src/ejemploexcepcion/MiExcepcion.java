/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepcion;

/**
 *
 * @author tperezrodriguez
 */
public class MiExcepcion extends Exception{

    public MiExcepcion(){
        super("Informacion da excepcion");
    }
    public MiExcepcion(String message) {
        super(message);
    }
    
}
