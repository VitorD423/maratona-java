package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDeFuncionarios.test;

import academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDeFuncionarios.dominio.*;
import academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDeFuncionarios.servico.FolhaPagamento;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionarioCLT = new FuncionarioCLT("Vitor", 3000, TipoFuncionario.CLT);
        Funcionario funcionarioPJ = new FuncionarioPJ("Diego", 3000, TipoFuncionario.PJ);
        Funcionario estagiario = new Estagiario("Mario", 2000, TipoFuncionario.ESTAGIARIO);
        Funcionario estagiarioIN = new Estagiario("Luigi", 2100, TipoFuncionario.ESTAGIARIO);

        try {
            estagiarioIN.calcularSalario();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        FolhaPagamento.processarPagamento(funcionarioCLT);
        System.out.println("---------------");
        FolhaPagamento.processarPagamento(funcionarioPJ);
        System.out.println("---------------");
        FolhaPagamento.processarPagamento(estagiario);

    }

}


