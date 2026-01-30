package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDeFuncionarios.servico;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDeFuncionarios.dominio.Funcionario;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDeFuncionarios.dominio.FuncionarioFreelancer;

public class FolhaPagamento {
    public static void imprimirPagamento(Funcionario funcionario){
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Valor pagamento: " + funcionario.calcularPagamento());
        if (funcionario instanceof FuncionarioFreelancer){
            FuncionarioFreelancer funcionarioFreelancer = (FuncionarioFreelancer)  funcionario;
            System.out.println("Nome do projeto: " + funcionarioFreelancer.getProjeto());
        }
    }
}
