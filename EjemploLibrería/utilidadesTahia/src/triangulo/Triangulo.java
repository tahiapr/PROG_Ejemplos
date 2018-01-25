/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author tperezrodriguez
 */
public class Triangulo {
    public static void areaTriangulo (float base, float altura) { //al ser static no hace falta crear un objeto para llamarlo
        System.out.println("Area triángulo: "+base*altura/2);
    }
}
