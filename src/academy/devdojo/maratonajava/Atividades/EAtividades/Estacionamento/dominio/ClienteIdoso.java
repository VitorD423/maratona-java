package academy.devdojo.maratonajava.Atividades.EAtividades.Estacionamento.dominio;

public class ClienteIdoso extends Cliente{
    @Override
    public double aplicarBeneficio(double valor) {
        return valor * 0.90;
    }
}
