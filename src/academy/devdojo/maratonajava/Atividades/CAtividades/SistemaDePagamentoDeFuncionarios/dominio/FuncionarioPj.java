package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDeFuncionarios.dominio;

public class FuncionarioPj extends Funcionario{
    public FuncionarioPj(String nome, double horasTrabalhadas) {
        super(nome, horasTrabalhadas);
    }

    @Override
    public double calcularPagamento() {
        return getHorasTrabalhadas() * 50 - 0.10;
    }


}
