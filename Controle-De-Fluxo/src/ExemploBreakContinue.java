public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                System.out.println("Pulou o número " + numero);
                continue;
            }
            if (numero == 5) {
                System.out.println("Parou no número " + numero);
                break;
            }
            System.out.println(numero);
        }
    }
}
