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
public class ContaCorrente extends ContaBancaria implements Imprimivel {
      private String tipo = "Conta Corrente";
      public double sacar(double valor) {
      return (valor)-taxaDeOperacao();
      
         }

    
    public double depositar(double valor) {
     return (valor)-taxaDeOperacao();
    }
     public String Limite(float operacao){
         return null;
     }

    public String getTipo() {
        return tipo;
    }

     
    @Override
    public String mostrarDados() {
       return this.tipo;
    }
     
}
