package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;


    public Personagem(String nome, String classe, int nivel) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
