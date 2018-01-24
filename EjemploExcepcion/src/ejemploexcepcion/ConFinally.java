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
public class ConFinally {
        private int num;
    private int den;

    public ConFinally(){
    
    }
    public ConFinally(int num, int den) {
        this.num = num;
        this.den = den;
    }
    
    public void dividirCapturaVariosCatchConFinally(){
        
        try{
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numerador"));
            den = Integer.parseInt(JOptionPane.showInputDialog("Introduce el denominador"));
      
            int resultado = num/den;
            System.out.println(num+" / "+den+" = "+resultado);
        }catch(ArithmeticException e1){
            System.out.println("Cuidado!!! No se puede dividir entre 0");
        }catch(NumberFormatException e2){
            System.out.println("Cuidado!!! Lo que has intoducido no es un numero");
        }
        finally{
            System.out.println("Esta sentencia se ejecuta siempre");
        }
    }
}
