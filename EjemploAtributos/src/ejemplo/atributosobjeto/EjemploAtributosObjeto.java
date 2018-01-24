
package ejemplo.atributosobjeto;


public class EjemploAtributosObjeto {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta  objCuenta = new Cuenta ("millonetis", "111111", 10000000);
        System.out.println(objCuenta.toString());
        
        Cuenta objCuenta2 = new Cuenta ();
        Persona persona1 = new Persona ("Pepa", "8456G");
        objCuenta2.setTitular(persona1);
        objCuenta2.setSaldo(300);
        System.out.println(objCuenta2.toString());
    }
    
}
