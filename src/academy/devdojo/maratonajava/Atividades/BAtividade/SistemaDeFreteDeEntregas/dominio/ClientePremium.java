package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeFreteDeEntregas.dominio;

public class ClientePremium extends TipoDeCliente{
    public ClientePremium(String nome, double valorBase, TipoEntrega tipoEntrega) {
        super(nome, valorBase, tipoEntrega);
    }


    @Override
    public double calcularTaxaExtra() {
        return tipoEntrega.custoEntrega(valorBase) * 0.15;
    }


}
