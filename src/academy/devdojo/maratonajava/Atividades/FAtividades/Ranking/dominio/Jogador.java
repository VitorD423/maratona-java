package academy.devdojo.maratonajava.Atividades.FAtividades.Ranking.dominio;

import java.util.Objects;

public class Jogador implements Comparable<Jogador> {
    private String nome;
    private double pontuacao;
    private Long id;

    public Jogador(String nome, double pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public Jogador(String nome, double pontuacao, Long id) {
        this(nome,pontuacao);
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return nome != null && nome.equalsIgnoreCase(jogador.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", pontuacao=" + pontuacao +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public int compareTo(Jogador jogador) {
        return this.nome.compareTo(jogador.getNome());
    }
}
