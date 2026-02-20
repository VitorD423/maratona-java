package academy.devdojo.maratonajava.Atividades.EAtividades.PlanosDeInternetComTiposDeCliente.dominio;

public class ClienteEmpresa extends Cliente{
    public ClienteEmpresa(String nome) {
        super(nome);
    }

    @Override
    public double aplicarBeneficio(double valorPlano) {
        return valorPlano * 0.85;
    }
}
