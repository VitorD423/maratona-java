package academy.devdojo.maratonajava.Atividades.FAtividades.Generica.dominio;

public class Revista {
    private String nome;

    public Revista(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
