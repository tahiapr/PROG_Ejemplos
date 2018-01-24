/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.atributosobjeto;

/**
 *
 * @author tperezrodriguez
 */
public class Persona {
private String nombre;
private String dni;

public Persona (){
    
}

public Persona (String nombre, String dni){
this.nombre = nombre;
this.dni = dni;
}

public String getNombre (){ 
return nombre;
}

public void setNombre (String nombre){
this.nombre =  nombre;
} 

public String getDni (){ 
return dni;
}

public void setDni (String dni){
this.dni =  dni;
} 

@Override //para adaptar el método toString a mis características
public String toString(){
    return nombre +" "+ dni;
}

}
