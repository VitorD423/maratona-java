package academy.devdojo.maratonajava.Atividades.EAtividades.EstacionametoRegraDeNegocio.dominio;

public class ClienteNormal extends Cliente{
    public ClienteNormal(String nome) {
        super(nome);
    }

    @Override
    public double aplicarBeneficio(double valor,long horas) {
        return valor;
    }
}
