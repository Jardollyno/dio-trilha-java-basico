import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) throws Exception {
        // Definindo as variáveis
        double saldo = 1000.0;
        double valorSolicitado;
        
        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando o saque
        System.out.println("Digite o valor do saque: ");
        valorSolicitado = scanner.nextDouble();

        // Verificando se o saldo é suficiente
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }
}
