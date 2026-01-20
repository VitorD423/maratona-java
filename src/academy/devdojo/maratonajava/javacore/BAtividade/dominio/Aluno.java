package academy.devdojo.maratonajava.javacore.BAtividade.dominio;

public class Aluno {
    private final String nome;
    private Curso curso;


    public Aluno(String nome) {
        this.nome = nome;
    }


    public void imprimirAluno(){
        System.out.println("Aluno: " + this.nome);
        if (curso == null)return;
        System.out.println("Curso: " + curso.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
