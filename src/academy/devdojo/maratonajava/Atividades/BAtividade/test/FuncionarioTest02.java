package academy.devdojo.maratonajava.Atividades.BAtividade.test;

import academy.devdojo.maratonajava.Atividades.BAtividade.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.Atividades.BAtividade.dominio.Funcionario;
import academy.devdojo.maratonajava.Atividades.BAtividade.dominio.Gerente;

public class FuncionarioTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Vitor",2500);
        Funcionario gerente = new Gerente("Jorge",30000,"ADM");
        Funcionario desenvolvedorJunior = new Desenvolvedor("Diego",1500,"Junior");
        Funcionario desenvolvedorSenior = new Desenvolvedor("Torres",3500,"Senior");

        Funcionario[] funcionarios = {funcionario,gerente,desenvolvedorJunior,desenvolvedorSenior};

        for (Funcionario f : funcionarios) {
            System.out.println("------------");
            f.imprimir();

        }

    }
}
