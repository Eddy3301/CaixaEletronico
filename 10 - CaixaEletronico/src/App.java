import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float saldo_inicial = 1000.00f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("OPERAÇÕES BANCÁRIAS: ");
        System.out.println("1 - Depósito");
        System.out.println("2 - Saque");
        System.out.println("3 - Consultar Saldo");
        System.out.println("0 - Sair");

        int opcao;

        opcao = scanner.nextInt();

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do depósito: ");
                    float deposito = scanner.nextFloat();
                    if (deposito <= 0) {
                        System.out.println("Valor de depósito inválido. O valor deve ser maior que zero.");
                    } else {
                    saldo_inicial += deposito;
                    System.out.println("Depósito realizado com sucesso!");
                    break; }
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    float saque = scanner.nextFloat();
                    if (saque > saldo_inicial) {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    } else {
                        saldo_inicial -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo_inicial);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

            System.out.println("\nOPERAÇÕES BANCÁRIAS: ");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            
        }
            System.out.println("Saindo do programa. . . ");
        
        
            
        
    }
}
