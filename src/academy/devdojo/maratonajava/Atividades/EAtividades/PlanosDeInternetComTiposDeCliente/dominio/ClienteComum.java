package academy.devdojo.maratonajava.Atividades.EAtividades.PlanosDeInternetComTiposDeCliente.dominio;

public class ClienteComum extends Cliente{
    public ClienteComum(String nome) {
        super(nome);
    }

    @Override
    public double aplicarBeneficio(double valorPlano) {
        return valorPlano;
    }
}
