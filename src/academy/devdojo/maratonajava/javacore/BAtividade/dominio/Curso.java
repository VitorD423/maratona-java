package academy.devdojo.maratonajava.javacore.BAtividade.dominio;

public class Curso {
        private final String nome;
        private Aluno[] alunos;

    public Curso(String nome) {
        this.nome = nome;
    }




    public void imprimirCurso(){
        System.out.println("Curso: " + this.nome);
        if (alunos == null)return;

        System.out.println("Alunos: ");
        for (Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }

    }


    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


    public String getNome() {
        return nome;
    }
}
