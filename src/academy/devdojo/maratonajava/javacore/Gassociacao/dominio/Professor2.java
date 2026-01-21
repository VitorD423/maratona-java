package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor2 {
    private final String nome;
    private String especialidade;
    private Seminarios[] seminarios;

    public Professor2(String nome) {
        this.nome = nome;
    }

    public Professor2(String nome, String especialiadade) {
        this.nome = nome;
        this.especialidade = especialiadade;
    }

    public Professor2(String nome, String especialidade, Seminarios[] seminarios) {
        this(nome,especialidade);
        this.seminarios = seminarios;
    }



    public void imprimir(){
        System.out.println("----------");

        System.out.println("Professor: "+this.nome);

        if (this.seminarios == null)return;

        System.out.println("## Seminários cadastrados ##");

        for (Seminarios seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue; ;
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno :"+aluno.getNome()+" idade: " + aluno.getIdade());
            }

        }

    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setSeminarios(Seminarios[] seminarios) {
        this.seminarios = seminarios;
    }
}
