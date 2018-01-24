/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraysobxetos;

import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class MetodosArray {
       public void amosar(Persoa[] listaPersoas){
        for(Persoa elemento:listaPersoas){
            System.out.println(elemento);
        } 
    }
    
    public Persoa[] crearArray(int tamaño){
        String nome,apelido,dni;
        Persoa[] persoas =  new Persoa[tamaño];
        for (int i=0; i<persoas.length;i++){
            nome = JOptionPane.showInputDialog("Nome");
            apelido = JOptionPane.showInputDialog("Apelido");
            dni = JOptionPane.showInputDialog("DNI");
            persoas[i] = new Persoa(nome,apelido,dni);
        }
        return persoas;
    }
    
    public Persoa buscar(Persoa[] listaPersoas, String dni){
        boolean encontrado=false; //A persoa non esta na lista
        
        for (int i=0;i<listaPersoas.length;i++){
            if (listaPersoas[i].getDni().equalsIgnoreCase(dni)){
                System.out.println("DNI encontrado");
                encontrado=true;
                return listaPersoas[i];
            }
        }
        if (encontrado==false){
            System.out.println("O dni introducido non se encontra na lista");
        }
        return null;
    }
    

}
