package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    private String lerPedido() {
        System.out.println("Lendo pedido...");
        String pedido = "Lanche";
        return pedido;
    }
    public void adicionarLancheNoBalcao() {
        System.out.println("Lanche adicionado no balcão");
    }
    public void adicionarSucoNoBalcao() {
        System.out.println("Suco adicionado no balcão");
    }
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche() {
        selecionarIngredientesLanche();
        System.out.println("Preparando lanche...");
        fritarLanche();
    }
    private void prepararSuco() {
        selecionarIngredientesSuco();
        lavarFrutas();
        System.out.println("Preparando suco...");
        baterSuco();
    }
    private void prepararCombo() {
        prepararLanche();
        prepararSuco();
    }
    private void selecionarIngredientesLanche() {
        System.out.println("Selecionando ingredientes do lanche...");
    }
    private void selecionarIngredientesSuco() {
        System.out.println("Selecionando ingredientes do suco...");
    }
    private void lavarFrutas() {
        System.out.println("Lavando frutas...");
    }
    private void fritarLanche() {
        System.out.println("Fritando lanche...");
    }
    private void baterSuco() {
        System.out.println("Batendo suco...");
    }
    public void pedirParaAlmoxerifeTrocarGas(Almoxerife almoxerife) {
        almoxerife.trocarGas();
    }
    public void pedirIngredientes(Almoxerife almoxerife) {
        almoxerife.entregarIngredientes();
    }
}
