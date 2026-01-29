package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeAssinaturaDeCursos.dominio;

public class AssinaturaEmpresa extends Assinatura{
    public AssinaturaEmpresa(double valorBase, FormaDePagamento formaDePagamento, TipoPlano tipoPlano) {
        super(valorBase, formaDePagamento, tipoPlano);
    }

    @Override
    public double calcularBeneficioExtra() {
        return valorBase * 0.05;
    }

}
