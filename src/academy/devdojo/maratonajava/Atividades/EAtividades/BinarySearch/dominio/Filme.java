package academy.devdojo.maratonajava.Atividades.EAtividades.BinarySearch.dominio;


//Crie uma lista com pelo menos 5 filmes
//Ordene por ano (Comparator)
//Use binarySearch para buscar um filme específico

import java.util.Objects;

public class Filme implements Comparable<Filme>{
    private String nome;
    private int ano;

    public Filme(String nome, int ano) {
        Objects.requireNonNull(nome,"Nome não pode ser null");
        Objects.requireNonNull(ano,"Ano não pode ser null");
        this.nome = nome;
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return ano == filme.ano && Objects.equals(nome, filme.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ano);
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                '}';
    }

    @Override
    public int compareTo(Filme filme) {
        return this.nome.compareToIgnoreCase(filme.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
