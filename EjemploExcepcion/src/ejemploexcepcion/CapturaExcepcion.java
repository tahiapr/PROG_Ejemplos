/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepcion;

import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class CapturaExcepcion {
     private int num;
    private int den;

    public CapturaExcepcion(){
    
    }
    public CapturaExcepcion(int num, int den) {
        this.num = num;
        this.den = den;
    }
    
    public void dividirCaptura(){
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numerador"));
        den = Integer.parseInt(JOptionPane.showInputDialog("Introduce el denominador"));
        
        try{
            int resultado = num/den;
            System.out.println(num+" / "+den+" = "+resultado);
        }catch(ArithmeticException e1){
            System.out.println("Cuidado!!! No se puede dividir entre 0");
        }
        
    }
}
