import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        // Declaração de variáveis
        int numeroConta;
        String nomeTitular;
        String agencia;
        double saldo;

        // Criação de um objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.println("Bem-vindo(a) ao Banco XYZ!");
        System.out.println("Qual o número da conta? ");
        numeroConta = scanner.nextInt();
        System.out.println("Qual o nome do titular? ");
        nomeTitular = scanner.next();
        System.out.println("Qual a agência? ");
        agencia = scanner.next();
        System.out.println("Qual o saldo inicial? ");
        saldo = scanner.nextDouble();

        // Saída de dados
        System.out.println("Conta criada com sucesso!");
        System.out.println("Obrigado, " + nomeTitular + "! Seja bem-vindo(a) ao Banco XYZ!");
        System.out.println("Seu número da conta: " + numeroConta);
        System.out.println("Sua agência: " + agencia);
        System.out.println("Seu saldo: R$ " + saldo);

    }
}
