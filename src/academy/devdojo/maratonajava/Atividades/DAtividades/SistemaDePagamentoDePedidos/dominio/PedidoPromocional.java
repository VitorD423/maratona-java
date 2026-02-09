package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.dominio;

public class PedidoPromocional extends Pedido implements Processavel{
    private static final double DESCONTO = 0.8;
    public PedidoPromocional(String cliente, double valorBase, TipoPedido tipoPedido) {
        super(cliente, valorBase, tipoPedido);
    }

    @Override
    public double calcularTotal() {
        if (getValorBase() < 50){
            throw new IllegalArgumentException("Valor do pedido promocional invalido");
        }

        return getValorBase() * DESCONTO;
    }

    @Override
    public void processar() {
        System.out.println("Processando pedido promocional");
    }

    public double getDesconto() {
        return DESCONTO;
    }
}
