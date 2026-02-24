package academy.devdojo.maratonajava.Atividades.EAtividades.AssinaturaDeStreming.dominio;

public class clienteVip extends Cliente{
    public clienteVip(String nome) {
        super(nome);
    }

    @Override
    public double aplicarBeneficio(double valor) {
        return valor * 0.90;
    }


}
