package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeImpostoDeFuncionarios.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;
    protected  TipoContrato tipoContrato;

    public Funcionario(String nome, double salarioBase, TipoContrato tipoContrato) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.tipoContrato = tipoContrato;
    }

    public abstract double calcularImposto();
    public double calcularSalarioLiquido(){
        return salarioBase - calcularImposto();
    }

    public void imprimirResumo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo de Contrato: " + tipoContrato.getDescricaoTextual());
        System.out.println("Salário: " + this.salarioBase);
        System.out.println("Imposto: " + calcularImposto());
        System.out.println("Salário líquido: " + calcularSalarioLiquido());
    }

}
