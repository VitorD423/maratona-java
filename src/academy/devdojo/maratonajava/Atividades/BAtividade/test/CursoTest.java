package academy.devdojo.maratonajava.Atividades.BAtividade.test;

import academy.devdojo.maratonajava.Atividades.BAtividade.dominio.Aluno;
import academy.devdojo.maratonajava.Atividades.BAtividade.dominio.Curso;

public class CursoTest {
    public static void main(String[] args) {
        Curso curso = new Curso("Java Backend");

        Aluno aluno1 = new Aluno("Vitor");
        Aluno aluno2 = new Aluno("Diego");
        Aluno aluno3 = new Aluno("Torres");

        Aluno[] alunos = {aluno1,aluno2,aluno3};

        aluno1.setCurso(curso);
        aluno2.setCurso(curso);
        aluno3.setCurso(curso);

        curso.setAlunos(alunos);

        curso.imprimirCurso();
        System.out.println();

        aluno1.imprimirAluno();
        System.out.println();
        aluno2.imprimirAluno();
        System.out.println();
        aluno3.imprimirAluno();

    }
}
