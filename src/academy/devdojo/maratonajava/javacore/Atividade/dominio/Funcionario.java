package academy.devdojo.maratonajava.javacore.Atividade.dominio;

public class Funcionario {
    private String nome;
    private double salario;
    private Departamento departamento;


    public Funcionario(String nome, double salario, Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void imprimirFuncionario(){
        System.out.println(this.nome);
        System.out.println(this.salario);
        System.out.println(departamento.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
}
