package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDePedidos.dominio;

public class PedidoEmpresa extends Pedido{
    public PedidoEmpresa(double valorBase, FormaDePagamento formaDePagamento, TipoDeCliente tipoDeCliente) {
        super(valorBase, formaDePagamento, tipoDeCliente);
    }

    @Override
    public double calcularDesconto() {
        return 0;
    }

    @Override
    public double calcularValorFinal() {
        return super.calcularValorFinal();
    }

}
