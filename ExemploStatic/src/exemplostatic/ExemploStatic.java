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
public class ExemploStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Conta con1 = new Conta("Perico to loco","25698745F","ES09 99089 97873 097889798",4000);
        System.out.println(con1.toString());
        
        Persoa p1 = new Persoa("lolo","25698745W");
        con1.setTitular(p1);
        System.out.println(con1.toString());
        
        System.out.println(con1.saldoFinal());
        //System.out.println("xuro = "+Conta.xuro);
        //System.out.println("saldo = "+con1.saldo);
        System.out.println("xuro = "+Conta.getXuro());
    }
    
}
