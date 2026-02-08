package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDeFuncionarios.dominio;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salarioBase, TipoFuncionario tipoFuncionario) {
        super(nome, salarioBase, tipoFuncionario);
    }

    @Override
    public double calcularSalario() {
        if (getSalarioBase() > 2000){
            throw new IllegalArgumentException("Salario invalido");
        }
        return getSalarioBase();
    }
}
