package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDeFuncionarios.dominio;

public class FuncionarioFreelancer extends Funcionario{
    private String projeto;

    public FuncionarioFreelancer(String nome, double horasTrabalhadas, String projeto) {
        super(nome, horasTrabalhadas);
        this.projeto = projeto;
    }

    @Override
    public double calcularPagamento() {
        return 2000;
    }

    public String getProjeto() {
        return projeto;
    }
}
