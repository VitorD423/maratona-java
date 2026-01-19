package academy.devdojo.maratonajava.javacore.Atividade.test;

import academy.devdojo.maratonajava.javacore.Atividade.dominio.Departamento;
import academy.devdojo.maratonajava.javacore.Atividade.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Departamento departamento1 = new Departamento("Tecnologia");

        Funcionario funcionario1 = new Funcionario("Vitor",2500,departamento1);
        Funcionario funcionario2 = new Funcionario("Diego",1400,departamento1);

        funcionario1.imprimirFuncionario();
        System.out.println();
        funcionario2.imprimirFuncionario();


    }
}
