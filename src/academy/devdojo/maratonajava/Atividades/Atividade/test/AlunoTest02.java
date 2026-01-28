package academy.devdojo.maratonajava.Atividades.Atividade.test;


import academy.devdojo.maratonajava.Atividades.Atividade.dominio.Aluno2;
import academy.devdojo.maratonajava.Atividades.Atividade.dominio.Professor;


public class AlunoTest02 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Daniel","Historia");

        Aluno2 aluno1 = new Aluno2("Vitor",21,professor1);
        Aluno2 aluno2 = new Aluno2("Diego",70,professor1);

        aluno1.imprimeAluno();
        System.out.println();
        aluno2.imprimeAluno();


    }
}
