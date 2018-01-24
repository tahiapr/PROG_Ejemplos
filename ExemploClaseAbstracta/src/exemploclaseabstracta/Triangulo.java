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

public class Triangulo extends Poligono{

    public Triangulo(float base, float altura) {
        super(base, altura);
    }
    
    @Override
    public void acharArea() {
        System.out.println("Area Triangulo = "+this.getBase()*super.getAltura()/2);
    }
    
}