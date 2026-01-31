package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeProcessamentoDePedidos.dominio;

public class PedidoBoleto extends Pedido implements Processavel{
    private String codigoDeBarras;

    public PedidoBoleto(String cliente, double valorTotal, String codigoDeBarras) {
        super(cliente, valorTotal);
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    public void processar() {
        System.out.println("Boleto gerado");
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }
}
