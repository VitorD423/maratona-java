package academy.devdojo.maratonajava.Atividades.EAtividades.AssinaturaDeStreaming.dominio;

public class ClienteVip extends Cliente{
    public clienteVip(String nome) {
        super(nome);
    }

    @Override
    public double aplicarBeneficio(double valor) {
        return valor * 0.90;
    }


}
