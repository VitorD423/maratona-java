package academy.devdojo.maratonajava.Atividades.FAtividades.Parametrizacao.dominio;

public class Personagem {
    private String nome;
    private int nivel;
    private String classe;

    public Personagem(String nome, int nivel, String classe) {
        this.nome = nome;
        this.nivel = nivel;
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", classe='" + classe + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public String getClasse() {
        return classe;
    }
}
