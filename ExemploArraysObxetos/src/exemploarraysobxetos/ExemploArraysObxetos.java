/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraysobxetos;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */

public class ExemploArraysObxetos {

    public static void main(String[] args) {
        MetodosArray obx1 = new MetodosArray();
        
        Persoa[] listaPersoas = {new Persoa("Laura","Diz","77461794W"),new Persoa("Pepe","Rodriguez","77489856R"),
            new Persoa("Luis","Perez","77412369F"),new Persoa("Ana","Sanchez","77458962T")};
        
        obx1.buscar(listaPersoas, "77461794W");
        
        Arrays.sort(listaPersoas);
        obx1.amosar(listaPersoas);
        
        obx1.amosar(listaPersoas);
        
        Persoa[] persoas = obx1.crearArray(4);
        obx1.amosar(persoas); 
    }
    
}