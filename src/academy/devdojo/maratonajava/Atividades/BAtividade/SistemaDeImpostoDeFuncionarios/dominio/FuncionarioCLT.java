package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeImpostoDeFuncionarios.dominio;

public class FuncionarioCLT extends Funcionario{

    public FuncionarioCLT(String nome, double salarioBase, TipoContrato tipoContrato) {
        super(nome, salarioBase, tipoContrato);
    }

    @Override
    public double calcularImposto() {
        return tipoContrato.calcularImposto(salarioBase);
    }

}
