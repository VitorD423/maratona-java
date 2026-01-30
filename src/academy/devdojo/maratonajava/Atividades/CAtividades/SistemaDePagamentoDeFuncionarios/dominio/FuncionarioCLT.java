package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDeFuncionarios.dominio;

public class FuncionarioCLT extends Funcionario{
    public FuncionarioCLT(String nome, double horasTrabalhadas) {
        super(nome, horasTrabalhadas);
    }

    @Override
    public double calcularPagamento() {
        return getHorasTrabalhadas() * 30;
    }
}
