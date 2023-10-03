import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in); 
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
            
        try {
            contar(parametroUm, parametroDois);

        }catch ( ParametrosInvalidosException e) {
            System.out.println("O primeiro parametro deve ser menor do que o segundo parametro");
        }
        }
    
    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        
    int contagem = parametroDois - parametroUm;
    for (int i = 1; i <= contagem; i++) {
        System.out.println("Imprimindo numero: " + i);
        }
    }
}