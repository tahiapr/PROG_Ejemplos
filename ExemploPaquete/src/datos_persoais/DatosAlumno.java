/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos_persoais;

/**
 *
 * @author tperezrodriguez
 */
public class DatosAlumno {
    public String nome;
    public String telefono;

    public DatosAlumno(String nome, String telefono) {
        this.nome = nome;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTeléfono: " + telefono;
    }
    
    
    
}
