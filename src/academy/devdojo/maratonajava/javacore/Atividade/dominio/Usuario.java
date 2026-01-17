package academy.devdojo.maratonajava.javacore.Atividade.dominio;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private boolean ativo;
    private String dataCadastro;


    public Usuario (int id, String nome, String email, boolean ativo, String dataCadastro){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
        this.dataCadastro = dataCadastro;
    }

    public Usuario (int id, String nome, String email){
        this(id,nome,email,true, "16/01/2026");
    }

    public Usuario (String nome, String email){
        this(0,nome,email,true,"16/01/2026");
    }

    public void imprimirUsuario(){
        System.out.print("ID do usuário: " + this.id + " | ");
        System.out.print("Nome do usuário: " + this.nome + " | ");
        System.out.print("Email do usuário: " + this.email + " | ");
        System.out.print(this.ativo + " | ");
        System.out.print("Data de cadastro: " + this.dataCadastro + " | ");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
