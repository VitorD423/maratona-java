package academy.devdojo.maratonajava.Atividades.BAtividade.dominio;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus(){
       double bonus = salario / 10;

        return bonus;
    }

    public void imprimir(){
        System.out.println("Funcionario");
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Bonus: " + calcularBonus());
    }
}
