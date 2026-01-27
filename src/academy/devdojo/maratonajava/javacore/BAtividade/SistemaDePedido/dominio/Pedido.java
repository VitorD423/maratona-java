package academy.devdojo.maratonajava.javacore.BAtividade.SistemaDePedido.dominio;


public class Pedido {
    private final int numero;
    private double valorTotal;
    private final Cliente cliente;
    public static final double TAXA_SERVICO = 5;


    public Pedido(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public final void imprimirResumo(){
        System.out.println("Número do pedido: " + this.numero);
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Valor : " + this.valorTotal + "/ Taxa de serviço: " + TAXA_SERVICO);
    }


    public int getNumero() {
        return numero;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorToral) {
        this.valorTotal = valorToral;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
