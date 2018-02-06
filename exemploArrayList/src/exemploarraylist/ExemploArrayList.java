/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class ExemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList lista = new ArrayList(); //es de tipo objeto, así que le podemos meter cualquier tipo (int, float, string..) dentro
        lista.add(1);
        lista.add("aaaaaa");
        lista.add(1.6);
        lista.add("dddd");

        //para visualizarla usamos un for
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i)); //hacemos que recorra la lista con el i y que nos lo vaya mostrando
        }

//        ArrayList<Integer> listanum = new <Integer> ArrayList(); //creamos una lista de tipo Integer
        //ArrayList <Integer> listanum = new ArrayList(); puede no especificarse el Integer en el final
        //  listanum.add(2);
        //listanum.add(new Integer(3));//se puede poner de las dos maneras, esta es la extensa
        //no admite string listanum.add("hola");

        /**
         * * Hacemos un menú para añadir y visualizar elementos **
        **/
        
//        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "/**** MENÚ****/\n1) AÑADIR NÚMERO\n2) MOSTRAR NÚMERO"));
//        do {
//            switch (op) {
//                case 1:
//                    int añadirNum = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué número quieres añadir?"));
//                    listanum.add(añadirNum);
//                    break;
//                case 2:
//                    for (int i = 0; i < listanum.size(); i++) {
//                        System.out.println(listanum.get(i));
//                    }
//                    break;
//                default:
//                    System.out.println("La opcion introducida no es válida");
//            }
//            op = Integer.parseInt(JOptionPane.showInputDialog(null, "/**** MENÚ****/\n1) AÑADIR NÚMERO\n2) MOSTRAR NÚMERO"));
//        } while (op != 0); 


   Metodos obx1 = new Metodos();
        
        ArrayList <Integer> listaNumeros = new ArrayList();
        ArrayList <Integer> ArrayPares = new ArrayList();

        int op = Integer.parseInt(JOptionPane.showInputDialog(null,"******** MENU *********\n"
                + "1)Añadir elemento a la lista\n"
                + "2)Mostrar lista\n"
                + "3)Borrar elemento por posiscion\n"
                + "4)Borrar elemento especificado\n"
                + "5)Cambiar elemento por posiscion\n"
                + "6)Cambiar elemento especificado\n"
                + "7)Mostrar el numero mayor y menos\n"
                + "8) Mostrar los números pares\n"
                + "0)Salir\n"));
  
        do {
            switch(op){
                case 1: obx1.engadir (listaNumeros);
                        break;
                case 2: obx1.amosarIterator (listaNumeros);
                        break;
                case 3: int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posisción a borrar"));
                        obx1.borrarElementoPosicion(listaNumeros, posicion);
                        break;
                case 4: int elemento = Integer.parseInt(JOptionPane.showInputDialog("Introduce el elemento a borrar"));
                        obx1.borrarElemento(listaNumeros, elemento);
                        break;
                case 5: int posicion2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición del elemento a cambiar"));
                        obx1.cambiarElementoPosicion(listaNumeros, posicion2);
                        break;
                case 6: int elemento2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el elemento a cambiar"));
                        obx1.cambiarElemento(listaNumeros, elemento2);
                        break;
                case 7: obx1.mayorMenorElemento(listaNumeros);
                        System.out.println("Número mayor: "+Metodos.mayor+" Número menor: "+Metodos.menor);
                        break;
                case 8: obx1.crearPares(listaNumeros, ArrayPares);
                        System.out.println("Los números pares son: "+ ArrayPares);
                        break;
                case 0: break;
                default: System.out.println("Opción no válida");
            }
            
        op = Integer.parseInt(JOptionPane.showInputDialog(null,"******** MENU *********\n"
                + "1)Añadir elemento a la lista\n"
                + "2)Mostrar lista\n"
                + "3)Borrar elemento por posiscion\n"
                + "4)Borrar elemento especificado\n"
                + "5)Cambiar elemento por posiscion\n"
                + "6)Cambiar elemento especificado\n"
                + "7)Mostrar el numero mayor y menos\n"
                + "8) Mostrar los números pares\n"
                + "0)Salir\n"));

        } while(op!=0);
        
        
        
    }
    }


