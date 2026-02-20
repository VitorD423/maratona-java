package academy.devdojo.maratonajava.Atividades.EAtividades.PlanosDeInternetComTiposDeCliente.dominio;

public class ClientePremium extends Cliente{
    public ClientePremium(String nome) {
        super(nome);
    }

    @Override
    public double aplicarBeneficio(double valorPlano) {
        return valorPlano * 0.80;
    }
}
