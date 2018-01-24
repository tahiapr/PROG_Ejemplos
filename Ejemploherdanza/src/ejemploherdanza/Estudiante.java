/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherdanza;

/**
 *
 * @author tperezrodriguez
 */
public class Estudiante extends Persoa {
    private String codigo;
    private int notaFinal;

  public Estudiante(String nome, String apelido, int edade, String codigo, int nota) {
        super(nome, apelido, edade);
        this.codigo=codigo;
        notaFinal=nota;
    }

    public String getCodigo(){
        return codigo;
    }
    public int getNota(){
        return notaFinal;
    }
    
    public void amosar(){
        System.out.println("Nome: "+getNome()+"\nApelido: "+getApelido()+" "
                + "\nEdade: "+getEdade()+" \nCódigo: "+codigo+" \nNota Final: "+notaFinal);
    }

    @Override
    public String toString() {
        return "Estudiante{"+super.toString() + "codigo=" + codigo + ", notaFinal=" + notaFinal + '}';
    }
    
    
}