package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeAssinaturaDeCursos.dominio;

public class AssinaturaComun extends Assinatura{
    public AssinaturaComun(double valorBase, FormaDePagamento formaDePagamento, TipoPlano tipoPlano) {
        super(valorBase, formaDePagamento, tipoPlano);
    }

    @Override
    public double calcularBeneficioExtra() {
        return 0;
    }


}
