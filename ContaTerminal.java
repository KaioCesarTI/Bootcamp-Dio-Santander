import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Por favor, digite o seu nome Completo: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o numero da sua Agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o numero de sua Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o seu Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque\"");
        }

    
}
