package lanchonete.area.cliente;

import lanchonete.atendimento.Atendente;

public class Cliente {
    public void escolherPedido() {
        System.out.println("Escolhendo pedido...");
    }
    public void fazerPedido(Atendente atendente) {
        atendente.anotarPedido();
    }
    public void consultarSaldo() {
        System.out.println("Consultando saldo...");
    }
    public void pagarPedido(Atendente atendente) {
        atendente.cobrarPedido();
    }
    public void pegarPedidoBalcao() {
        System.out.println("Pegando pedido no balcão...");
    }
}
