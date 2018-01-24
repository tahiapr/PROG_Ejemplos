/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraybasico;

import java.util.Arrays;

/**
 *
 * @author tperezrodriguez
 */
public class ExemploArrayBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                Temperatura obx1 =  new Temperatura();
        
        float[]temperaturas1 = new float[7];
        temperaturas1[0] = 18.3F;
        temperaturas1[1] = 21.2F;
        temperaturas1[2] = 19.5F;
        temperaturas1[3] = 17.8F;
        temperaturas1[4] = 22F;
        temperaturas1[5] = 16.9F;
        temperaturas1[6] = 19.5F;
        //obx1.amosar(temperaturas1);
        //obx1.amosarTemperatura(temperaturas1);
        //obx1.buscarTemperatura(temperaturas1);
        //obx1.ordenar(temperaturas1);
        //obx1.amosar(temperaturas1);
        
        
        float[]temperaturas2 = {18.3F,21.2F,19.5F,17.8F};
        //obx1.amosar(temperaturas2);
        Arrays.sort(temperaturas2);
        obx1.amosar(temperaturas2);
        
        
        float[]temperaturas3 = new float[7];
        //for (int i=0;i<temperaturas3.length;i++){
        //    temperaturas3[i] = Float.parseFloat(JOptionPane.showInputDialog("Introduce una temperatura"));
        //}
        //obx1.amosar(temperaturas3);
    }
    
}
