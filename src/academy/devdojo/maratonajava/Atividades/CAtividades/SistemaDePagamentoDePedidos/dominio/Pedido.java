package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDePedidos.dominio;

public abstract class Pedido{
    protected double valorBase;
    protected FormaDePagamento formaDePagamento;
    protected TipoDeCliente tipoDeCliente;


    public Pedido(double valorBase, FormaDePagamento formaDePagamento, TipoDeCliente tipoDeCliente) {
        this.valorBase = valorBase;
        this.formaDePagamento = formaDePagamento;
        this.tipoDeCliente = tipoDeCliente;
    }

    public abstract double calcularDesconto();
    public double calcularValorFinal(){
        return valorBase + formaDePagamento.calcularTaxa(valorBase) - calcularDesconto();
    }

    public void imprimirResumo(){
        System.out.println("Valor base: " + this.valorBase);
        System.out.println("Taxa do pagamento: " + formaDePagamento.calcularTaxa(valorBase));
        System.out.println("Desconto: " + calcularDesconto());
        System.out.println("Valor final: " + calcularValorFinal());
    }
}
