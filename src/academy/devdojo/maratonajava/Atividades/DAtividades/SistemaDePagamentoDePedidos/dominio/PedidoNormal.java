package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.dominio;

public class PedidoNormal extends Pedido implements Processavel{
    public PedidoNormal(String cliente, double valorBase, TipoPedido tipoPedido) {
        super(cliente, valorBase, tipoPedido);
    }

    @Override
    public double calcularTotal() {
        return getValorBase();
    }


    @Override
    public void processar() {
        System.out.println("Processando pedido normal");
    }
}
