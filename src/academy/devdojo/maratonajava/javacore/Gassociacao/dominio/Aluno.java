package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aluno {
    private final String nome;
    private int idade;
    private Seminarios seminarios;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminarios getSeminarios() {
        return seminarios;
    }

    public Aluno(String nome, int idade, Seminarios seminarios) {
        this(nome,idade);
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setSeminarios(Seminarios seminarios) {
        this.seminarios = seminarios;
    }
}
