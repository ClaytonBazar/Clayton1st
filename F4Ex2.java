 import java.util.Scanner;

 
public class F4Ex2 {

public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
         
        
         
        System.out.println("Introduza o seu nome");
        String dono = in.next();
        System.out.println("Introduza o seu numero de conta");
        int conta = in.nextInt();
        ContaCorrente cc = new ContaCorrente(dono,conta);
        System.out.println("Escolhe a operacao que deseja fazer ");
        System.out.println("1.Depositar");
        System.out.println("2.Levantar");
        System.out.println("3.Dados da conta");
        int opcao=in.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Introduza o valor que deseja depositar");
                double valor = in.nextDouble();
                System.out.println("A conta "+cc.getConta()+" depositou "+cc.depositar(valor));break;
        
            case 2:
                System.out.println("Introduza o valor que deseja Levantar");
                valor = in.nextDouble();
                System.out.println("A conta "+cc.getConta()+" levantou "+cc.sacar(valor)+"O saldo atual e de "+cc.getSaldo());break;
           
            case 3: 
                System.out.println(cc.mostrarDados());
        }
           
            
    }
}    
    
