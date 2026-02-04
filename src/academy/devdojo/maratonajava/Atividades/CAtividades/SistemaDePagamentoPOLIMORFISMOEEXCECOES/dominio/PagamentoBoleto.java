package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoPOLIMORFISMOEEXCECOES.dominio;

public class PagamentoBoleto extends Pagamento implements ProcessavelPagamento{
    private String codigoBarras;

    public PagamentoBoleto(double valor, String codigoBarras) {
        super(valor);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processar() {
        if (codigoBarras == null || codigoBarras.isBlank()){
            throw new IllegalArgumentException("Codigo de barras não pode está vazio");

        }
        System.out.println("Boleto pago com sucesso");
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }
}
