package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.servico;

import academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.dominio.Pedido;
import academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.dominio.PedidoInternacional;
import academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.dominio.PedidoPromocional;
import academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.dominio.Processavel;

public class CentralPedidos {
    public static void  processar(Processavel processavel){
        processavel.processar();
    }

    public static void gerarResumo(Pedido pedido){
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Tipo do pedido: " + pedido.getTipoPedido());
        System.out.println("Valor final: " + pedido.calcularTotal());

        if (pedido instanceof PedidoInternacional){
            PedidoInternacional pedidoInternacional = (PedidoInternacional) pedido;
            System.out.println("Taxa: " + pedidoInternacional.getTaxa());
        }

        if (pedido instanceof PedidoPromocional){
            PedidoPromocional pedidoPromocional = (PedidoPromocional) pedido;
            System.out.println("Desconto: " + pedidoPromocional.getDesconto());
        }
    }

}
