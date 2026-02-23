package academy.devdojo.maratonajava.Atividades.EAtividades.EstacionametoRegraDeNegocio.dominio;

public class ClienteVip extends Cliente{
    public ClienteVip(String nome) {
        super(nome);
    }

    @Override
    public double aplicarBeneficio(double valor, long horas) {
        valor *= 0.8;

        if (horas > 5) {
            valor *= 0.90;
        }
        return  valor;
    }
}
