package academy.devdojo.maratonajava.Atividades.FAtividades.Ranking.dominio;

import java.util.Objects;

public class Jogador implements Comparable<Jogador> {
    private String nome;
    private double pontuacao;
    private Long id;
    private double horasJogadas;

    public Jogador(String nome, double pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public Jogador(String nome, double pontuacao, Long id) {
        this(nome,pontuacao);
        this.id = id;
    }


    public Jogador(String nome, double pontuacao, Long id, double horasJogadas) {
        this(nome,pontuacao,id);
        this.horasJogadas = horasJogadas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return Objects.equals(id, jogador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getHorasJogadas() {
        return horasJogadas;
    }

    public void setHorasJogadas(double horasJogadas) {
        this.horasJogadas = horasJogadas;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", pontuacao=" + pontuacao +
                ", id=" + id +
                ", horasJogadas=" + horasJogadas +
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
