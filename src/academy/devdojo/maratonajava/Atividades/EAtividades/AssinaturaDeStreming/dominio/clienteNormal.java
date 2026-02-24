package academy.devdojo.maratonajava.Atividades.EAtividades.AssinaturaDeStreming.dominio;

public class clienteNormal extends Cliente{
    public clienteNormal(String nome) {
        super(nome);
    }

    @Override
    public double aplicarBeneficio(double valor) {
        return valor;
    }


}
