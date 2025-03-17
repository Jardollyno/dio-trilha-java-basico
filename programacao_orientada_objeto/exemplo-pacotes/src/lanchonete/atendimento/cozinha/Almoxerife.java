package lanchonete.atendimento.cozinha;

public class Almoxerife {
    private void controlarEntrada() {
        System.out.println("Controlando entrada de itens...");
    }
    private void controlarSaida() {
        System.out.println("Controlando saída de itens...");
    }
    void trocarGas() {
        System.out.println("Trocando gás...");
    }
    void entregarIngredientes() {
        System.out.println("Entregando ingredientes...");
        controlarSaida();
    }
}
