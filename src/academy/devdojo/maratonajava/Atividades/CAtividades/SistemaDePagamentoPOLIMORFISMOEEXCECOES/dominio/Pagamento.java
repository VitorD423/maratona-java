package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoPOLIMORFISMOEEXCECOES.dominio;

public abstract class Pagamento implements ProcessavelPagamento{
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
