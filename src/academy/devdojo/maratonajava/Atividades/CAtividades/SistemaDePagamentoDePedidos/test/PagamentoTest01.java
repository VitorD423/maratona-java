package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDePedidos.test;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDePedidos.dominio.*;

public class PagamentoTest01 {
    public static void main(String[] args) {
        Pedido pedido1 = new PedidoComum(100, Pagamento.CARTAO, TipoDeCliente.VIP);
        Pedido pedido2 = new PedidoEmpresa(200,Pagamento.BOLETO,TipoDeCliente.VIP);

        pedido1.imprimirResumo();
        System.out.println("---------------------");
        pedido2.imprimirResumo();
    }
}
