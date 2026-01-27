package academy.devdojo.maratonajava.javacore.BAtividade.SistemaDePedido.dominio;

public class PedidoOnline extends Pedido {


    public PedidoOnline(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    public void calcularFrete(double distancia){

        if (distancia <= 0){
            return;
        }

        double frete = distancia * 2;
        double novoTotal = getValorTotal() + frete;
        setValorTotal(novoTotal);

    }
}
