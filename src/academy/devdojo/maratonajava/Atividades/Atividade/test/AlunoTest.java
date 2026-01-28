package academy.devdojo.maratonajava.Atividades.Atividade.test;

import academy.devdojo.maratonajava.Atividades.Atividade.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Vitor",21);
        Aluno aluno2 = new Aluno("Vitor");
        Aluno aluno3 = new Aluno();

        aluno1.imprimirAluno();
    }
}
