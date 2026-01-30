package academy.devdojo.maratonajava.Atividades.CAtividades.ParametrosPolimorficos.dominio;

public class FolhaPagamento {


    public static void imprimirSalario(Funcionario funcionario){
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Salario: " + funcionario.salarioBase);
        System.out.println("Calculo do salario" + funcionario.calcularSalario());
    };
}
