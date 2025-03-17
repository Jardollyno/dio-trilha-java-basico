import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxerife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        Atendente atendente = new Atendente();
        Cliente cliente = new Cliente();
        Almoxerife almoxerife = new Almoxerife();

        // Ações do cliente
        // Publicas
        cliente.escolherPedido();
        cliente.fazerPedido(atendente);
        cliente.pegarPedidoBalcao();
        // Privadas
        cliente.consultarSaldo();
        cliente.pagarPedido(atendente);

        // Ações do atendente
        // Publicas
        atendente.anotarPedido();
        atendente.pegarPedidoCozinha();
        atendente.pegarPedidoBalcao();
        atendente.servindoMesa();
        atendente.cobrarPedido();

        // Privadas
        // atendente.trocarGas();

        // Ações do cozinheiro
        // Publicas
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        // Privadas
        //cozinheiro.prepararLanche();
        //cozinheiro.prepararSuco();
        //cozinheiro.prepararCombo();
        //cozinheiro.selecionarIngredientesLanche();
        //cozinheiro.selecionarIngredientesSuco();
        //cozinheiro.lavarFrutas();
        //cozinheiro.fritarLanche();
        //cozinheiro.baterSuco();

        // Visíveis somente para o atendimento (default)
        //cozinheiro.pedirParaAtendenteTrocarGas(atendente);
        cozinheiro.pedirParaAlmoxerifeTrocarGas(almoxerife);
        cozinheiro.pedirIngredientes(almoxerife);

        // Ações do almoxerife
        //Publicas
        almoxerife.controlarEntrada();
        almoxerife.controlarSaida();

        // Privadas
        // almoxerife.trocarGas();
        // almoxerife.entregarIngredientes();

    }
}
