import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
 
     Scanner scan = new Scanner(System.in);


        System.out.print("Nome: ");
        String name = scan.nextLine();
        System.out.print("Conta: ");
        int conta = scan.nextInt();
        System.out.print("Deposito Inicial: ");
        double deposito = scan.nextDouble();
        System.out.println();      
        
        Data data = new Data(name, conta, deposito);
        
        System.out.printf("Olá %s, sua conta é a %d, e seu saldo é %.2f%n",data.getName(),data.getConta(),data.getSaldo());
        System.out.println();   

        System.out.print("Qual o valor do seu saque? ");
        double saque = scan.nextDouble();
        data.saque(saque);
        System.out.println(); 

        System.out.printf("Seu saldo atualizado é: %.2f%n",data.getSaldo());
        System.out.println();        
        
        System.out.print("Qual o valor do seu Depósito? ");
        double add = scan.nextDouble();
        data.deposito(add);
        System.out.println(); 
        System.out.printf("Seu saldo atualizado é: %.2f%n",data.getSaldo());
        
        scan.close();
}
}
