package academy.devdojo.maratonajava.Atividades.FAtividades.HashSet.dominio;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa dominio = (Pessoa) o;
        return idade == dominio.idade && Objects.equals(nome, dominio.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }



    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());
    }
}
