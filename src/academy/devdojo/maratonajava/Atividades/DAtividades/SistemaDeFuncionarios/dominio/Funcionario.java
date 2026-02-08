package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDeFuncionarios.dominio;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;
    private  TipoFuncionario tipoFuncionario;

    public Funcionario(String nome, double salarioBase, TipoFuncionario tipoFuncionario) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.tipoFuncionario = tipoFuncionario;
    }

    public abstract double calcularSalario();

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + tipoFuncionario);
        System.out.println("Salario final: " + calcularSalario());
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }
}
