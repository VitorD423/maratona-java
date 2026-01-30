package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDeFuncionarios.dominio;

public abstract class Funcionario implements Pagavel {
    private String nome;
    private double horasTrabalhadas;


    public Funcionario(String nome, double horasTrabalhadas) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
    }


    public abstract double calcularPagamento();

    public String getNome() {
        return nome;
    }

    protected double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
}
