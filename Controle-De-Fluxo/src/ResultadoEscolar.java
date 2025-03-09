import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        double media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = scanner.nextInt();

        System.out.println("Digite a terceira nota do aluno: ");
        nota3 = scanner.nextInt();

        media = (nota1 + nota2 + nota3) / 3;

        if (media > 7) {
            System.out.println("Aprovado! Média Final: " + media);
        } else if (media < 7 && media >= 5) {
            System.out.println("Recuperação! Média Final: " + media);
        } else if (media == 7) {
            System.out.println("Escapou fedendo! Média Final: " + media);
        } else {
            System.out.println("Reprovado! Média Final: " + media);
        }

        System.out.println("Usando operador ternário: ");

        // Usando operador ternário
        String resultado = media >= 7 ? "Aprovado" : media < 7 && media >= 5 ? "Recuperação" : media == 7 ? "Escapou fedendo" : "Reprovado";
        System.out.println(resultado + "! Média Final: " + media);
    }
}
