package academy.devdojo.maratonajava.javacore.Atividade.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private String[] materias;
    private  boolean matriculado;

    {
        System.out.println("Bloco de inicialização do aluno executado");
        materias = new String[4];

        for (int i = 0; i < materias.length ; i++) {
            materias[i] = "Matérias " + (i + 1);
        }
    }

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.matriculado = true;
    }

    public Aluno(String nome){
        this(nome,18);
    }

    public Aluno(){
        this("Aluno Padrão",16);
        this.matriculado = false;
    }


    public void imprimirAluno(){
        System.out.println("Nome do aluno: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Lista de matérias: ");

        for (String materias : this.materias){
            System.out.println(materias);
        }




        System.out.println("Matriculado: "+ this.matriculado);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
}
