package academy.devdojo.maratonajava.Atividades.CAtividades.ParametrosPolimorficos.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;


    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}
