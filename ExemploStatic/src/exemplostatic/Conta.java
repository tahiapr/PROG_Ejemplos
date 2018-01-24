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
public class Conta {
    private Persoa titular;
    private String numConta;
    private double saldo;
    private static float xuro = 0.04F;
    
    //CONSTRUCTORES
    public Conta(){
        titular = new Persoa();
    }
    public Conta(String nome, String dni,String numConta ,double saldo){
        titular = new Persoa();
        titular.setNome(nome);
        titular.setDni(dni);
        this.numConta=numConta;
        this.saldo=saldo;
    }
    
    //METODOS ACCESO
    public String getNumConta(){
        return numConta;
    }
    public void setNumConta(String nConta){
        numConta=nConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double s){
        saldo=s;
    }
    public Persoa getTitular(){
        return titular;
    }
    public void setTitular(Persoa titular){
        this.titular = titular;
    }
    //TOSTRING
    @Override
    public String toString(){
        return ("Titular: "+titular+", numero de conta: "+numConta+", saldo: "+saldo);
    }
    
    //METODOS
    public double ingresarSaldo(double cantidad){
        saldo=saldo+cantidad;
        return saldo;
    }
    public double quitarSaldo(double cantidad){
        saldo=saldo-cantidad;
        return saldo;
    }
    public double saldoFinal(){
        return saldo + saldo * xuro;
    }
    public static float getXuro(){
        return xuro;
    } 
}
