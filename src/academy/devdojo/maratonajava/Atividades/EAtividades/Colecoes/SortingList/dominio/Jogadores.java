package academy.devdojo.maratonajava.Atividades.EAtividades.Colecoes.SortingList.dominio;

import java.util.Objects;

public class Jogadores implements Comparable<Jogadores>{
    private String nome;
    private  double horasJogadas;
    private int golsMarcados;
    private int assistencias;
    private Long id;

    public Jogadores(String nome, double horasJogadas, int golsMarcados, int assistencias, Long id) {
        Objects.requireNonNull(id,"Id não pode ser null");
        Objects.requireNonNull(nome,"Nome não pode ser null");
        this.nome = nome;
        this.horasJogadas = horasJogadas;
        this.golsMarcados = golsMarcados;
        this.assistencias = assistencias;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jogadores jogadores = (Jogadores) o;
        return Double.compare(horasJogadas, jogadores.horasJogadas) == 0 && Objects.equals(nome, jogadores.nome) && Objects.equals(id, jogadores.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, horasJogadas, id);
    }

    @Override
    public String toString() {
        return "Jogadores{" +
                "nome = '" + nome + '\'' +
                ", horasJogadas = " + horasJogadas +
                ", golsMarcados = " + golsMarcados +
                ", assistencias = " + assistencias +
                ", id=" + id +
                '}';
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public int getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(int assistencias) {
        this.assistencias = assistencias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorasJogadas() {
        return horasJogadas;
    }

    public void setHorasJogadas(double horasJogadas) {
        this.horasJogadas = horasJogadas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int compareTo(Jogadores jogadores) {
        return this.nome.compareToIgnoreCase(jogadores.getNome());
    }
}

