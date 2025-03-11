public class ParametrosInvalidosException extends Exception {
    // Testar se o primeiro parâmetro é maior ou igual ao segundo
    public ParametrosInvalidosException() {
        super("O primeiro parâmetro deve ser menor que o segundo.");
    }
    
}
