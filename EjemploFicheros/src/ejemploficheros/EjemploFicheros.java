/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficheros;

import ejemploficheros.lectura.LeerFichero;
import ejemploficheros.lectura.LeerNumeros;
import ejemploficheros.lectura.LeerObxetos;
import ejemploficheros.lectura.LeerPalabras;
import escribirFicheiros.escribirFichero;
/**
 *
 * @author tperezrodriguez
 */
public class EjemploFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        LeerFichero obx = new LeerFichero();
//        obx.lerLineas();
//        
//        LeerPalabras obx2 = new LeerPalabras();
//        obx2.leerPalabras();
//        
//        LeerNumeros obx3 = new LeerNumeros();
//        obx3.leerNumeros();
//        obx3.sumarNumeros();
//        
//        LeerObxetos obx4 = new LeerObxetos();
//        obx4.leerObxetos();

    escribirFichero e1 = new escribirFichero();
    e1.escribirFrasesPrintWriter();
    e1.escribirFrasesconFileWriter();
    }
    
}
