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
public class EjemploExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //CapturaExcepcion c1 = new CapturaExcepcion();
        //c1.dividirCaptura();
        //VariosCatch vc1 = new VariosCatch();
        //vc1.dividirCapturaVariosCatch();
        //ConFinally cf1 = new ConFinally();
        //cf1.dividirCapturaVariosCatchConFinally();
        //PropagarExcepcion pe1 = new PropagarExcepcion();
        //try{
        //    pe1.dividirPropagarExcepcion();
        //}catch(ArithmeticException e1){
        //    System.out.println(e1.getMessage());
        //}
        DividirConMiExcepcion dme1 = new DividirConMiExcepcion();
        try {
            dme1.dividirMiExcepcion();
        } catch (MiExcepcion e1) {
            System.out.println(e1.getMessage());
        }
    }

}
