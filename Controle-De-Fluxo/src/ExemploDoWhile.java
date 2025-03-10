import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Realizando chamada!");

        do {
            System.out.println("Chamando...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (tocando());
        System.out.println("Atendeu!");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(5) == 1;
        return ! atendeu;
    }
}
