package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.test;

import academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.dominio.*;
import academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.servico.CentralPedidos;

public class PedidosTest {
    public static void main(String[] args) {
        Pedido pedidoNormal = new PedidoNormal("Vitor",500, TipoPedido.NORMAL);
        Pedido pedidoPromocional = new PedidoPromocional("Diego",40,TipoPedido.PROMOCIONAL);
        Pedido pedidoInternacional = new PedidoInternacional("Torres",2000,TipoPedido.INTERNACIONAL);

        CentralPedidos.processar(pedidoNormal);
        System.out.println("------------------");
        CentralPedidos.processar(pedidoPromocional);
        System.out.println("------------------");
        CentralPedidos.processar(pedidoInternacional);
        System.out.println("------------------");

        try{
          CentralPedidos.gerarResumo(pedidoNormal);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            CentralPedidos.gerarResumo(pedidoPromocional);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            CentralPedidos.gerarResumo(pedidoInternacional);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
