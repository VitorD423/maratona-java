package academy.devdojo.maratonajava.Atividades.DAtividades.CadastroDeUsuários.dominio;
public class Usuario {
    private String nome;
    private String email;
    private int idade;

    public Usuario(String nome, String email, int idade) {

        if (nome.isBlank()){
            throw new NomeInvalidoException("Nome invalido");
        }

        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }
}
