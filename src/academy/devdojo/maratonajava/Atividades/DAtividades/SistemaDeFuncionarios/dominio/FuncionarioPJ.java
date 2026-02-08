package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDeFuncionarios.dominio;

public class FuncionarioPJ extends Funcionario{
    public FuncionarioPJ(String nome, double salarioBase, TipoFuncionario tipoFuncionario) {
        super(nome, salarioBase, tipoFuncionario);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + 500;
    }
}
