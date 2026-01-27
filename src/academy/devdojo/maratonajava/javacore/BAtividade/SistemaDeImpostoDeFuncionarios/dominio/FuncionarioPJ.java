package academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeImpostoDeFuncionarios.dominio;

public class FuncionarioPJ extends Funcionario{
    @Override
    public double calcularImposto() {
        return tipoContrato.calcularImposto(salarioBase);
    }

    public FuncionarioPJ(String nome, double salarioBase, TipoContrato tipoContrato) {
        super(nome, salarioBase, tipoContrato);


    }
}
