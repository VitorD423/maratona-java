package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeProcessamentoDePedidos.servico;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeProcessamentoDePedidos.dominio.*;

public class CentralPedidos {

    public static void processarPedido(Processavel processavel){
        processavel.processar();
    }

    public static void gerarRelatorio(Pedido pedido){
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Valor: " + pedido.getValorTotal());


        if (pedido instanceof PedidoBoleto){
            PedidoBoleto pedidoBoleto = (PedidoBoleto) pedido;
            System.out.println("Codigo de barras:" + pedidoBoleto.getCodigoDeBarras());
        }

        if (pedido instanceof PedidoCartao){
            PedidoCartao pedidoCartao = (PedidoCartao) pedido;
            System.out.println("Codigo de transação: " + pedidoCartao.getCodigoTransacao());
        }

        if (pedido instanceof PedidoPix){
            PedidoPix pedidoPix = (PedidoPix) pedido;
            System.out.println("Chave pix: " + pedidoPix.getChavePix());
        }
    }
}
