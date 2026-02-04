package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoPOLIMORFISMOEEXCECOES.dominio;

public class PagamentoCartao extends Pagamento implements ProcessavelPagamento{
    private double limite;

    public PagamentoCartao(double valor, double limite) {
        super(valor);
        this.limite = limite;
    }

    @Override
    public void processar() {
        if (getValor() > limite){
            throw new IllegalStateException("Valor não pode ser maior que o limite");
        }
        System.out.println("Pagamento por cartão efetuado com sucesso");
    }

    public double getLimite() {
        return limite;
    }
}
