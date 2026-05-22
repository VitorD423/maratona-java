package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio;

import java.util.Objects;

public class Armas {
    private String nome;
    private int dano;
    private String raridade;

    public Armas(String nome, int dano, String raridade) {
        this.nome = nome;
        this.dano = dano;
        this.raridade = raridade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Armas armas = (Armas) o;
        return dano == armas.dano && Objects.equals(nome, armas.nome) && Objects.equals(raridade, armas.raridade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dano, raridade);
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    public String getRaridade() {
        return raridade;
    }

    @Override
    public String toString() {
        return "Armas{" +
                "nome='" + nome + '\'' +
                ", dano=" + dano +
                ", raridade='" + raridade + '\'' +
                '}';
    }
}
