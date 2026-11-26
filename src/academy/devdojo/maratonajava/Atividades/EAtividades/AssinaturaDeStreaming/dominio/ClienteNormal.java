package academy.devdojo.maratonajava.Atividades.EAtividades.AssinaturaDeStreaming.dominio;

public class ClienteNormal extends Cliente{
    public clienteNormal(String nome) {
        super(nome);
    }

    @Override
    public double aplicarBeneficio(double valor) {
        return valor;
    }


}
