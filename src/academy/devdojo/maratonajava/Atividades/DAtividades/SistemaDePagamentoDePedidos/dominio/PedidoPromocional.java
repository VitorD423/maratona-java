package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.dominio;

public class PedidoPromocional extends Pedido implements Processavel{
    private final double desconto = 0.80;
    public PedidoPromocional(String cliente, double valorBase, TipoPedido tipoPedido) {
        super(cliente, valorBase, tipoPedido);
    }

    @Override
    public double calcularTotal() {
        if (getValorBase() < 50){
            throw new IllegalArgumentException("Valor do pedido promocional invalido");
        }

        return getValorBase() * desconto;
    }

    @Override
    public void processar() {
        System.out.println("Processando pedido promocional");
    }

    public double getDesconto() {
        return desconto;
    }
}
