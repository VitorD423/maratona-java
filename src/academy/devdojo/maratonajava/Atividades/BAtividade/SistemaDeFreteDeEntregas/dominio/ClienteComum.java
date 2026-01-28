package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeFreteDeEntregas.dominio;

public class ClienteComum extends TipoDeCliente{
    public ClienteComum(String nome, double valorBase, TipoEntrega tipoEntrega) {
        super(nome, valorBase, tipoEntrega);
    }

    @Override
    public double calcularTaxaExtra() {
        return 0;
    }

    @Override
    public double calcularValorFinal() {
        return super.calcularValorFinal();
    }


}
