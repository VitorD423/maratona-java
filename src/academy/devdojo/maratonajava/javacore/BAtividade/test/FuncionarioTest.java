package academy.devdojo.maratonajava.javacore.BAtividade.test;

import academy.devdojo.maratonajava.javacore.BAtividade.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.BAtividade.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Vitor",2500);
        Funcionario gerente = new Gerente("George",20000,"Ciencias");



        funcionario.imprimir();
        System.out.println("----------------");
        gerente.imprimir();
    }
}
