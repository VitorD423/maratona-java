package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoPOLIMORFISMOEEXCECOES.dominio;

public class PagamentoPix extends Pagamento implements ProcessavelPagamento{
    private String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processar() {
        if (chavePix == null || chavePix.isBlank()){
            throw new IllegalArgumentException("Chave pix não pode está vazia");

        }
        System.out.println("Pagamento pix efetualdo");
    }

    public String getChavePix() {
        return chavePix;
    }
}
