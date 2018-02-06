/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class Metodos {
      static int mayor;
    static int menor;
    
    public void engadir(ArrayList<Integer>lis){ //recibimos el ArrayList de tipo Integer como el que declaramos en el main
        Integer n; 
        n=Integer.parseInt(JOptionPane.showInputDialog("Número: ")); //pedimos el número por el JOption
        lis.add(n); //lo mostramos en la lista
       // lis.add(Integer.parseInt(JOptionPane.showInternalInputDialog(null, "Número: "))); podemos hacerlo directamente en un paso en ves de en 3
    }
    
    public void amosarIterator (ArrayList<Integer>list){
        Iterator it = list.iterator(); //creamos un objeto iterator y le asociamos el ArrayList
        while (it.hasNext())
            System.out.println(it.next());
    }
    
      public void borrarElementoPosicion(ArrayList <Integer> lista,int pos){
        lista.remove(pos-1);
//        for(int i=0;i<lista.size();i++){
//            if (i==(pos-1)){
//                lista.remove(i);
//            }
//        }
    }
    
    public void borrarElemento(ArrayList <Integer> lista,int ele){
        lista.remove(new Integer (ele));
//        for(int i=0;i<lista.size();i++){
//            if(lista.get(i)==ele){
//                lista.remove(i);
//            }
//        }
    }
    
    public void cambiarElementoPosicion(ArrayList <Integer> lista,int pos){
        int nuevoElemento = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nuevo elemento"));
        lista.set(pos-1,nuevoElemento);
//        for(int i=0;i<lista.size();i++){
//            if (i==(pos-1)){
//                int nuevoElemento = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el nuevo elemento"));
//                lista.remove(i);
//                lista.add(i, nuevoElemento);
//            }
//        }
    }
    
    public void cambiarElemento(ArrayList <Integer> lista,int ele){
        int nuevoElemento = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nuevo elemento"));
        int pos = lista.indexOf(ele);
        lista.set(pos, nuevoElemento);
//        for(int i=0;i<lista.size();i++){
//            if(lista.get(i)==ele){
//                int nuevoElemento = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el nuevo elemento"));
//                lista.remove(i);
//                lista.add(i, nuevoElemento);
//            }
//        }
    }
    
    public void mayorMenorElemento(ArrayList <Integer> lista){
        Comparator<? super Integer> c = null;
        lista.sort(c);
        mayor=lista.get(lista.size()-1);
        menor=lista.get(0);
    }
    
    public void crearPares (ArrayList <Integer> lista, ArrayList <Integer> ArrayPares){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)%2==0){
                ArrayPares.add(lista.get(i));
            }
        }
    }

}
