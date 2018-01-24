/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerruptor;

/**
 *
 * @author tperezrodriguez
 */
public class Ejemplointerruptor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          int num=1,sw=0;
        
        while(num<=6){
            if (sw==0){
                System.out.println("Blanco");
                sw=1;
            }else{
                System.out.println("Negro");
                sw=0;
            }
            num++;
        }

    }
    
}
