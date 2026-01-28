package academy.devdojo.maratonajava.Atividades.BAtividade.test;

import academy.devdojo.maratonajava.Atividades.BAtividade.dominio.Funcionario;
import academy.devdojo.maratonajava.Atividades.BAtividade.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Vitor",2500);
        Funcionario gerente = new Gerente("George",20000,"Ciencias");



        funcionario.imprimir();
        System.out.println("----------------");
        gerente.imprimir();
    }
}
