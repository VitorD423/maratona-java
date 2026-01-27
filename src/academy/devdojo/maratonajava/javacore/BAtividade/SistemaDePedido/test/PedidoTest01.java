package academy.devdojo.maratonajava.javacore.BAtividade.SistemaDePedido.test;

import academy.devdojo.maratonajava.javacore.BAtividade.SistemaDePedido.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.BAtividade.SistemaDePedido.dominio.Pedido;

public class PedidoTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Vitor");

        Pedido pedido = new Pedido(14,cliente);
        pedido.setValorTotal(144);
        pedido.imprimirResumo();
    }
}
