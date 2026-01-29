package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeAssinaturaDeCursos.dominio;

public abstract class Assinatura {
    protected double valorBase;
    protected FormaDePagamento formaDePagamento;
    protected TipoPlano tipoPlano;

    public Assinatura(double valorBase, FormaDePagamento formaDePagamento, TipoPlano tipoPlano) {
        this.valorBase = valorBase;
        this.formaDePagamento = formaDePagamento;
        this.tipoPlano = tipoPlano;
    }

    public abstract double calcularBeneficioExtra();

    public double calcularValorFinal(){
        return valorBase + formaDePagamento.calcularTaxa(valorBase) - tipoPlano.calcularDesconto(valorBase) - calcularBeneficioExtra();
    }

    public void imprimirResumo(){
        System.out.println("Valor Base: " + this.valorBase);
        System.out.println("Taxa pagamento: " + formaDePagamento.calcularTaxa(valorBase));
        System.out.println("Desconto plano:  " + tipoPlano.calcularDesconto(valorBase));
        System.out.println("Beneficio: " + calcularBeneficioExtra());
        System.out.println("Valor Final: " + calcularValorFinal());
    }


}
