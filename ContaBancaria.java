/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f4ex2;

/**
 *
 * @author Dell
 */
//  
public class ContaBancaria implements Imprimivel{
    protected String dono;
    protected double saldo=1000;
    protected int conta;

    public ContaBancaria(String dono, int conta) {
        this.dono = dono;
        this.conta = conta;
    }
    
    
    
    public double taxaDeOperacao(){
     return this.saldo*=0.005;   
    }
    public String Limite(Float deposito){
       this.saldo-=deposito;
        if (saldo>=-5000){
            return "operacao efectuada com sucesso, o seu saldo atual e "+this.saldo;
        }else
        return "impossivel efectuar a operacao porque atingiste o limite";
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    @Override public String mostrarDados() {
        return "ContaBancaria{" + "saldo=" + this.saldo + "\n conta=" + this.getConta() + "\n Portador: "+this.getDono()+'}';
    }

    
    
}
