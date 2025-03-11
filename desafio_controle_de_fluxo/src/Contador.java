import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        // Explicação do programa no console
        System.out.println("Este programa conta de um número até outro número de um em um.");
        System.out.println("Digite dois números inteiros, o primeiro menor que o segundo.");

        // Instanciando um objeto Scanner para capturar os números digitados pelo usuário
        Scanner terminal;
        terminal = new Scanner(System.in);

        // Capturando os números digitados pelo usuário
        System.out.println("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        // Chamando o método contar e tratando a exceção ParametrosInvalidosException
        try {
            System.out.println("Contando de " + parametroUm + " até " + parametroDois + ": ");
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            if (terminal != null) {
                terminal.close();
            }
        }
    }

    // Métdo para contar de um em um a partir do primeiro parâmetro
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Gerando uma exceção caso o primeiro parâmetro seja maior ou igual ao segundo
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }
        // Contando de um em um a partir do primeiro parâmetro
        for (int i = parametroUm; i <= parametroDois; i++) {
            if (i < parametroDois) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
    }
}
