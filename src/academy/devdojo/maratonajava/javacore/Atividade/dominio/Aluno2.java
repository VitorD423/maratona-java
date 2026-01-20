package academy.devdojo.maratonajava.javacore.Atividade.dominio;

public class Aluno2 {
    private String nome;
    private int idade;
    private Professor professor;


    public Aluno2(String nome, int idade, Professor professor) {
        this.nome = nome;
        this.idade = idade;
        this.professor = professor;
    }



    public void imprimeAluno(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(professor.getNome());
        System.out.println(professor.getEspecialidade());
    }

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }


    public Professor getProfessor() {
        return professor;
    }
}
