/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f4ex2;

/**
 *
 * @author Dell
 */
public class F4Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        ContaBancaria cb = new ContaBancaria();
        cb.setDono("Nelson Bazar");
        cc.setDono("Lurdes Jasse");
        cb.setConta(213456984);
        cc.setConta(875286358);
        cp.setConta(835275257);
        
        
        System.out.println("Saldo: "+cc.getSaldo());
        System.out.println("A conta "+cc.getConta()+" de "+cc.getDono()+ " depositou "+cc.depositar(2500)+" Levantou "+cc.sacar(4000)+". A taxa de operacao foi de "+cc.taxaDeOperacao()+" e o seu saldo e de "+cc.getSaldo());
        System.out.println("A conta " + cp.getConta()+" A "+cp.Limite(3000f)+" Tipo de conta: "+cp.getTipo());
        System.out.println(cb.mostrarDados());
    }
    
}
