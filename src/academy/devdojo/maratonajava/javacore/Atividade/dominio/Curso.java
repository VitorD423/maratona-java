package academy.devdojo.maratonajava.javacore.Atividade.dominio;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private  String[] modulos;
    private boolean ativo;


    {
        System.out.println("Bloco de inicialização executado");
        modulos = new String[5];

        for (int i = 0; i < modulos.length; i++) {
            modulos[i] = "Módulo " + (i +1);
        }
    }

    public Curso(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ativo = true;
    }

    public Curso(String nome){
        this(nome,40);
    }

    public Curso(){
        this("Curso Padrão",20);
        this.ativo = false;
    }

    public void imprimirCurso(){
        System.out.println("Nome do curso: "+ this.nome);
        System.out.println("Carga horaria: "+ this.cargaHoraria);
        System.out.println("Status: "+ this.ativo);
        System.out.println("lista de módulos: ");
        for (String modulo : this.modulos) {
            System.out.print(modulo);
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String[] getModulos() {
        return modulos;
    }

    public void setModulos(String[] modulos) {
        this.modulos = modulos;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
