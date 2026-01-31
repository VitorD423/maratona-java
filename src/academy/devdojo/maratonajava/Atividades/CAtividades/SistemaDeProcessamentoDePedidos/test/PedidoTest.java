package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeProcessamentoDePedidos.test;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeProcessamentoDePedidos.dominio.PedidoBoleto;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeProcessamentoDePedidos.dominio.PedidoCartao;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeProcessamentoDePedidos.dominio.PedidoPix;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeProcessamentoDePedidos.servico.CentralPedidos;

public class PedidoTest {
    public static void main(String[] args) {
        PedidoPix pix = new PedidoPix("Vitor",500,"12455055");
        PedidoCartao cartao = new PedidoCartao("Diego",100,"50050");
        PedidoBoleto boleto = new PedidoBoleto("Torres",200,"44444124");

        CentralPedidos.processarPedido(pix);
        CentralPedidos.gerarRelatorio(pix);
        System.out.println("------------------");
        CentralPedidos.processarPedido(cartao);
        CentralPedidos.gerarRelatorio(cartao);
        System.out.println("------------------");
        CentralPedidos.processarPedido(boleto);
        CentralPedidos.gerarRelatorio(boleto);
    }
}
