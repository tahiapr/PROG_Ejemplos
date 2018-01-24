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
public class Rectangulo extends Poligono{

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public void acharArea() {
        System.out.println("Area Rectangulo = "+super.getBase()*super.getAltura());
    }
    
}