/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import datos_academicos.NotasAlumno;

/**
 *
 * @author tperezrodriguez
 */
public class Alumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NotasAlumno notas = new NotasAlumno("Ana Sotillo López", 3);
        System.out.println(notas.toString());
    }
    
}
