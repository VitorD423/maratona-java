package academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Comprado{" +
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
