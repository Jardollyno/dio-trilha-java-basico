import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        boolean executando = true;
        while (executando) {
            try {
            // Lendo os dados
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();

            // Exibindo os dados
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);
            scanner.close();
            break;
            } 
            // Tratando exceções
            catch (Exception e) {
                System.out.println("Erro: " + e);
                System.out.println("Por favor, digite os dados corretamente.");
                System.out.println("Idade e altura devem ser números inteiros e decimais, respectivamente.");
            }
        }
    }
}