package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeProcessamentoDePedidos.dominio;

public class PedidoPix extends Pedido implements Processavel{
    private String chavePix;

    public PedidoPix(String cliente, double valorTotal, String chavePix) {
        super(cliente, valorTotal);
        this.chavePix = chavePix;
    }

    @Override
    public void processar() {
        System.out.println("Processando Pagamento via pix ");
    }

    public String getChavePix() {
        return chavePix;
    }
}
