package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDePlanoDeStreming.dominio;

public abstract class Usuario {

    protected String nome;
    protected double valorPlano;
    protected TipoDePlano tipoDePlano;

    public Usuario(String nome, double valorPlano, TipoDePlano tipoDePlano) {
        this.nome = nome;
        this.valorPlano = valorPlano;
        this.tipoDePlano = tipoDePlano;
    }

    public abstract double calcularImposto();
    public double calcularValorFinal(){
        return valorPlano + calcularImposto();
    }

    public void imprimirResumo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Valor do plano: " + this.valorPlano);
        System.out.println("Tipo de plano: " + tipoDePlano.getNomeDoPlano());
        System.out.println("Imposto: " + calcularImposto());
        System.out.println("Valor final: " + calcularValorFinal());
    }

}
