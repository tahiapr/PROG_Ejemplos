/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplothis;

/**
 *
 * @author tperezrodriguez
 */
public class Ejemplothis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Rectangulo rec1 = new Rectangulo(8,9);
        System.out.println("Rec1 --> "+rec1.toString());
        
        Rectangulo rec2 = new Rectangulo(6);
        System.out.println("Rec2 --> "+rec2.toString());
        
        Rectangulo rect1 = rec1.incrementar();
        System.out.println("Rect1 --> "+rect1.toString());
        
        rec2.mudarBase();
        System.out.println("Rec2 --> "+rec2.toString());
    }
    
}
