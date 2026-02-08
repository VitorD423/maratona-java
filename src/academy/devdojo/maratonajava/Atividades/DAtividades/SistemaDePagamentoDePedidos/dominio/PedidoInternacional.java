package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.dominio;

public class PedidoInternacional extends Pedido implements Processavel{
    private final int taxa = 100;

    public PedidoInternacional(String cliente, double valorBase, TipoPedido tipoPedido) {
        super(cliente, valorBase, tipoPedido);
    }

    @Override
    public double calcularTotal() {
        if (getValorBase() > 1000){
            throw new IllegalStateException("Pedido internacional excedi os limites");
        }

        return getValorBase() + taxa;
    }

    @Override
    public void processar() {
        System.out.println("Pedido internacional sendo processado");
    }

    public int getTaxa() {
        return taxa;
    }
}
