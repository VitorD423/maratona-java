package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDeFuncionarios.dominio;

public class FuncionarioCLT extends Funcionario{
    public FuncionarioCLT(String nome, double salarioBase, TipoFuncionario tipoFuncionario) {
        super(nome, salarioBase, tipoFuncionario);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 0.9;
    }
}
