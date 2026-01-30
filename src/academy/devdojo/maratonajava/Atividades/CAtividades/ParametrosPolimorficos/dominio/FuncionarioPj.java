package academy.devdojo.maratonajava.Atividades.CAtividades.ParametrosPolimorficos.dominio;

public class FuncionarioPj extends Funcionario{
    public FuncionarioPj(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.50;
    }
}
