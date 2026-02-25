package academy.devdojo.maratonajava.Atividades.EAtividades.Eestacionamento.dominio;

public class ClienteMensalista extends Cliente{
    @Override
    public double aplicarBeneficio(double valor) {
        if (valor > 80){
            return 80;
        }
        return valor;
    }
}
