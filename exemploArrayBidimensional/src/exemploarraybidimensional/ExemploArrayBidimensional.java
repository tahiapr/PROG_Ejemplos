/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraybidimensional;

/**
 *
 * @author tperezrodriguez
 */
public class ExemploArrayBidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Notas notas= new Notas();
        
        notas.crearTaboa();
        notas.amosar();
        notas.mediaAlumno2();
        notas.mediaAlumno();
        //notas.mediaModulo();
        notas.ordenar();
        notas.amosar();
    }
    
}
