package academy.devdojo.maratonajava.Atividades.CAtividades.ParametrosPolimorficos.test;

import academy.devdojo.maratonajava.Atividades.CAtividades.ParametrosPolimorficos.dominio.FolhaPagamento;
import academy.devdojo.maratonajava.Atividades.CAtividades.ParametrosPolimorficos.dominio.Funcionario;
import academy.devdojo.maratonajava.Atividades.CAtividades.ParametrosPolimorficos.dominio.FuncionarioCLT;
import academy.devdojo.maratonajava.Atividades.CAtividades.ParametrosPolimorficos.dominio.FuncionarioPj;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new FuncionarioCLT("Vitor",2500);
        Funcionario funcionario2 = new FuncionarioPj("Diego",4500);

        FolhaPagamento.imprimirSalario(funcionario1);
    }
}
