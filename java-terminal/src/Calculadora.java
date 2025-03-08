/**
 * @author Jardollyno
 * @version 1.0
 * @since 07/03/2025
 */

public class Calculadora {

    /**
     * Método que realiza a soma de dois numeros inteiros
     * @param a -> Numero inteiro
     * @param b -> Numero inteiro
     * @return a + b -> Soma dos numeros
     */
    
    public int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();
        System.out.println("Soma: " + calc.soma(5, 5));
    }
}
