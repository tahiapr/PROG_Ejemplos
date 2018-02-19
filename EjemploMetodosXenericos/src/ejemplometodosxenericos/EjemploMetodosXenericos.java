/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplometodosxenericos;

import java.util.ArrayList;

/**
 *
 * @author tperezrodriguez
 */
public class EjemploMetodosXenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                ArrayList<Pantalla>lisPan = new ArrayList<>();
        ArrayList<Mouse>lisRato = new ArrayList<>();
        ArrayList<String>lisNomes = new ArrayList<>();
      
        // Metodos obx = new Metodos();
        lisPan.add(new Pantalla("samsung",17f));
        lisPan.add(new Pantalla("asus",17.5f));
        lisPan.add(new Pantalla("samsung",20f));
        lisRato.add(new Mouse("inalambrico"));
        lisRato.add(new Mouse("con cable"));
        lisNomes.add("Noa");
        lisNomes.add("Alba");
        lisNomes.add("Manuel");
        lisNomes.add("Natalia");
        lisNomes.add("Sara");
      
        Metodos.amosar(lisPan);
        Metodos.amosar(lisRato);
        Metodos.amosar(lisNomes);
//      
//      Metodos.eliminarPosicion(lisPan);
//      Metodos.amosar(lisPan);
      
        Metodos.eliminarElemento(lisPan);
        Metodos.amosar(lisPan);
    }
    
}
