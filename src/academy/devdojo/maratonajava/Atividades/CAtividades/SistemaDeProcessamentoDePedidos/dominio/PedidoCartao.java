package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeProcessamentoDePedidos.dominio;

public class PedidoCartao extends Pedido implements Processavel{
    private String codigoTransacao;

    public PedidoCartao(String cliente, double valorTotal, String codigoTransacao) {
        super(cliente, valorTotal);
        this.codigoTransacao = codigoTransacao;
    }

    @Override
    public void processar() {
        System.out.println("Processando pagamento bip bop");
    }

    public String getCodigoTransacao() {
        return codigoTransacao;
    }
}
