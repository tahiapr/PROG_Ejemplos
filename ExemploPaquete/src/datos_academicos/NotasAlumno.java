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
public class NotasAlumno {
    private String nome;
    float nota;

    public NotasAlumno() {
    }


    public NotasAlumno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nNota: " + nota;
    }
    
    
    
    
    
    
}
