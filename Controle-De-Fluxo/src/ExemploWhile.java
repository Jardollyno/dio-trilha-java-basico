//import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.00;
        double valorTotal = 0.00;
        double valorDoce = 0.00;
        //Random numeroRandom = new Random(); // Classe Random uma das formas de gerar números aleatórios
        //double valorDoce = numeroRandom.nextDouble() * 10; // Gera um número aleatório entre 0 e 10

        while (mesada + valorTotal >= 50.00) {
            valorDoce = numeroAleatorio();
            if (valorDoce > mesada) {
                System.out.println("Valor do doce: " + String.format("%.2f", valorDoce));
                System.out.println("Doce muito caro, não posso comprar");
                break;
            }
            mesada -= valorDoce;
            valorTotal += valorDoce;
            System.out.println("Mesada restante: " + String.format("%.2f", mesada));
            System.out.println("Valor do doce: " + String.format("%.2f", valorDoce));
        }

        System.out.println("Valor total gasto: " + String.format("%.2f", valorTotal));
        System.out.println("Dinheiro restante: " + String.format("%.2f", mesada));
      
    }

    private static double numeroAleatorio() {
        return ThreadLocalRandom.current().nextDouble(0, 10); // Gera um número aleatório entre 0 e 10 outra forma
    }
}
