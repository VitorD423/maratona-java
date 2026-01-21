package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminarios {
    private final String titulo;
    private Aluno[] alunos;
    private Local local;


    public Seminarios(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;

    }

    public Seminarios(String titulo, Aluno[] alunos, Local local) {
        this(titulo,local);
        this.alunos = alunos;

    }


    public Aluno[] getAlunos() {
        return alunos;
    }

    public Local getLocal() {
        return local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
