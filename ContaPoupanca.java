/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f4ex2;

/**
 *
 * @author Dell
 */
//Implementacao do exercicio 3 e 4
public class ContaPoupanca extends ContaBancaria implements Imprimivel{
    private String tipo = "Conta Poupanca";

    public ContaPoupanca(String dono, int conta) {
        super(dono, conta);
    }

    
    public String getTipo() {
        return tipo;
    }
    
    
     @Override
    public String mostrarDados() {
        return "Dados da Conta \nTipo:"+ this.tipo + "\nsaldo=" + this.saldo + "\nconta=" + this.getConta() + "\n Portador: "+this.getDono();
    }
}
