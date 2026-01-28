package academy.devdojo.maratonajava.Atividades.BAtividade.dominio;

public class Gerente extends Funcionario{
    private final String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }


    @Override
    public double calcularBonus() {

        return salario * 0.05;
    }

    @Override
    public void imprimir() {
        System.out.println("Gerente");
        super.imprimir();
        System.out.println("Departamento: " + this.departamento);
    }
}
