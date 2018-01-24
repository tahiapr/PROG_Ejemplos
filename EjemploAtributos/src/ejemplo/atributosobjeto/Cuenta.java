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
public class Cuenta {
private Persona titular;
private double saldo;

public Cuenta (){
titular = new Persona(); //darle valores null o a 0 a las variables de los objetos
}
    
public Cuenta (String nom, String dni, double s){
    titular = new Persona();
    titular.setNombre(nom);
    titular.setDni(dni);
    saldo=s;
}    

public void setTitular(Persona a){
titular= a;    
}

public Persona getTitular() {
    return titular;
}

public void setSaldo (double saldo){
this.saldo=saldo;
}

public double getSaldo (){
return saldo;
}

@Override
public String toString(){
return titular+" "+saldo;    
}
}
