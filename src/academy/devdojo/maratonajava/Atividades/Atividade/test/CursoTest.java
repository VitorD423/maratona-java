package academy.devdojo.maratonajava.Atividades.Atividade.test;

import academy.devdojo.maratonajava.Atividades.Atividade.dominio.Curso;

public class CursoTest {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Vitor",30);
        Curso curso2 = new Curso("Diego");
        Curso curso3 = new Curso();

        curso1.imprimirCurso();
        curso2.imprimirCurso();
        curso3.imprimirCurso();
    }
}
