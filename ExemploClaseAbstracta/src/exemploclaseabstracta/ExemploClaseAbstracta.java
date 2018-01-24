/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclaseabstracta;

/**
 *
 * @author tperezrodriguez
 */
public class ExemploClaseAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               //Poligono pol1 = new Poligono(); Poligono no se puede instanciar porque es abstracta
        Triangulo tr1 = new Triangulo(4F,5F);
        Rectangulo rec1 = new Rectangulo(4F,5F);
        
        tr1.acharArea(); 
        rec1.acharArea();
    }
    
}
