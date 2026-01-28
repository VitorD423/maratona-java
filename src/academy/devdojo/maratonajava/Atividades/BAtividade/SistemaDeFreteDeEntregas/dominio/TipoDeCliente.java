package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeFreteDeEntregas.dominio;

public abstract class TipoDeCliente {
    protected String nome;
    protected double valorBase;
    protected TipoEntrega tipoEntrega;

    public TipoDeCliente(String nome, double valorBase, TipoEntrega tipoEntrega) {
        this.nome = nome;
        this.valorBase = valorBase;
        this.tipoEntrega = tipoEntrega;
    }

    public abstract double calcularTaxaExtra();
    public double calcularValorFinal(){
        return valorBase + tipoEntrega.custoEntrega(valorBase) + calcularTaxaExtra();
    }

    public void imprimirResumo(){
        System.out.println("Nome: " +  this.nome);
        System.out.println("Tipo de entrega: " + tipoEntrega.getNome());
        System.out.println("Valor Base: " + this.valorBase);
        System.out.println("Taxa extra: " + calcularTaxaExtra());
        System.out.println("Valor final: " + calcularValorFinal());
    }
}
