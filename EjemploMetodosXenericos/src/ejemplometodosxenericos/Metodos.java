/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplometodosxenericos;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class Metodos {
     public static <T> void amosar(ArrayList<T>lista){
        Iterator it= lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
   //borrar elemento de una determinada posicion
    public static <T> void eliminarPosicion(ArrayList<T>lista){
        int posicion =Integer.parseInt(JOptionPane.showInputDialog("¿Que posicion desexas eliminar"));
        lista.remove(posicion-1);  
    }
    
    public static <T> void eliminarElemento(ArrayList<T>lista){
        //corregir
        String elemento =JOptionPane.showInputDialog("¿Que elemento desexas eliminar");
        lista.remove(new String(elemento)); 
    }
}
