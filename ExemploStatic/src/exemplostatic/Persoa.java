/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplostatic;

/**
 *
 * @author tperezrodriguez
 */
public class Persoa {
     private String nome,dni;
    
    //CONSTRUCTORES
    public Persoa(){
        
    }
    public Persoa(String nome, String dni){
        this.nome=nome;
        this.dni=dni;
    }
    
    //M.ACCESO
    public String getNome(){
        return nome;
    }
    public String getDni(){
        return dni;
    }
    public void setNome(String n){
        nome=n;
    }
    public void setDni(String d){
        dni=d;
    }
    
    //METODO TOSTRING
    @Override
    public String toString(){
        return "Nome "+nome+" e dni "+dni;  
    }
}
