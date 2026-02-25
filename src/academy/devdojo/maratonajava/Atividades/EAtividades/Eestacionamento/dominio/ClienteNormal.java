package academy.devdojo.maratonajava.Atividades.EAtividades.Eestacionamento.dominio;

public class ClienteNormal extends Cliente{
    @Override
    public double aplicarBeneficio(double valor) {
        return valor;
    }
}
