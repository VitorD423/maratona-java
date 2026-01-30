package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDeFuncionarios.Test;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDeFuncionarios.dominio.Funcionario;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDeFuncionarios.dominio.FuncionarioCLT;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDeFuncionarios.dominio.FuncionarioFreelancer;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDeFuncionarios.dominio.FuncionarioPj;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDeFuncionarios.servico.FolhaPagamento;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new FuncionarioCLT("Vitor",8);
        Funcionario funcionario2 = new FuncionarioPj("Diego",12);
        Funcionario funcionario3 = new FuncionarioFreelancer("Torres",20,"Quadro pintado");

        FolhaPagamento.imprimirPagamento(funcionario1);
        System.out.println("-----------------------");
        FolhaPagamento.imprimirPagamento(funcionario2);
        System.out.println("-----------------------");
        FolhaPagamento.imprimirPagamento(funcionario3);
    }
}
