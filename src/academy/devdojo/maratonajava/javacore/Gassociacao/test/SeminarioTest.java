package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor2;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminarios;

public class SeminarioTest {
    public static void main(String[] args) {
        Local local = new Local("Rua Principal");
        Aluno aluno1 = new Aluno("Vitor",21);
        Aluno aluno2 = new Aluno("Diego",30);
        Aluno aluno3 = new Aluno("Torres",90);
        Aluno[] alunos = {aluno1,aluno2,aluno3};

        Professor2 professor1 = new Professor2("Antonio","Ciencias");
        Professor2 professor2 = new Professor2("Adriano","Filosofia");
        Professor2 professor3 = new Professor2("Marcos","Historia");
        Professor2[] professores = {professor1,professor2,professor3};


        Seminarios seminarios1 = new Seminarios("Ciencias",alunos,local);
        Seminarios seminarios2 = new Seminarios("Ciencias",alunos,local);

        Seminarios[] seminariosDisponiveis = {seminarios1};
        professor1.setSeminarios(seminariosDisponiveis);

        professor1.imprimir();









    }
}
