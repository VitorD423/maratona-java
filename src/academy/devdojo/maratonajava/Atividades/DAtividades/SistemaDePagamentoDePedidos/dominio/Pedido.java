package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.dominio;

public abstract class Pedido implements Processavel{
    private String cliente;
    private double valorBase;
    private TipoPedido tipoPedido;

    public Pedido(String cliente, double valorBase, TipoPedido tipoPedido) {
       if (valorBase <= 0){
           throw new IllegalArgumentException("Valor invalido");
       }
        this.cliente = cliente;
        this.valorBase = valorBase;
        this.tipoPedido = tipoPedido;
    }

    public abstract double calcularTotal();


    public String getCliente() {
        return cliente;
    }

    public double getValorBase() {
        return valorBase;
    }

    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }
}
