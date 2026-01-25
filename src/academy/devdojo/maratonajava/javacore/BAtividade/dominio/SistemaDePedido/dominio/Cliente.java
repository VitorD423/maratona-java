package academy.devdojo.maratonajava.javacore.BAtividade.dominio.SistemaDePedido.dominio;

public class Cliente {
    private String nome;


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
