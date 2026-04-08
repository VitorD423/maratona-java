package academy.devdojo.maratonajava.Atividades.FAtividades.HashSet.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.HashSet.dominio.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class Atividade2 {
    public static void main(String[] args) {
        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(new Pessoa("Vitor",22));
        pessoas.add(new Pessoa("Vitor",22));
        pessoas.add(new Pessoa("Bruno",15));
        pessoas.add(new Pessoa("Vitor",22));
        pessoas.add(new Pessoa("Vitor",22));
        pessoas.add(new Pessoa("Vitor",22));
        pessoas.add(new Pessoa("Vitor",22));
        pessoas.add(new Pessoa("Vitor",22));
        pessoas.add(new Pessoa("Vitor",22));
        pessoas.add(new Pessoa("Vitor",22));
        pessoas.add(new Pessoa("Vitor",22));
        pessoas.add(new Pessoa("Vitor",22));

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

    }
}
