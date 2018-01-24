/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos_academicos;

/**
 *
 * @author tperezrodriguez
 */
public class BoletinNotas {
    
    public void amosarBoletin(){
        NotasAlumno nota1 = new NotasAlumno();
        System.out.println("Nome: "+nota1.getNome());
        System.out.println("Notas "+ nota1.getNota());
    }
}
