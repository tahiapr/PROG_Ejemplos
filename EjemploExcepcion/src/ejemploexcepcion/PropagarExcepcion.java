/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepcion;

import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class PropagarExcepcion {
        private int num;
    private int den;

    public PropagarExcepcion(){
    
    }
    public PropagarExcepcion(int num, int den) {
        this.num = num;
        this.den = den;
    }
    
    public void dividirPropagarExcepcion() throws ArithmeticException{
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numerador"));
        den = Integer.parseInt(JOptionPane.showInputDialog("Introduce el denominador"));
        if (den==0){
            throw new ArithmeticException("NO SE PUEDE DIVIDIR ENTRE 0");
        }
        System.out.println(num+" / "+den+" = "+num/den);
    }
}
