package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Nivelacao;
import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonagemTest08 {
    public static void main(String[] args) {
        List<Personagem> personagens = List.of(
                new Personagem("Vitor","Mago",22),
                new Personagem("Arthur","Guerreiro",50),
                new Personagem("Merlin","Mago",80),
                new Personagem("Legolas","Arqueiro",65),
                new Personagem("Frieren","Mago",100),
                new Personagem("Guts","Guerreiro",90),
                new Personagem("Hanzo","Arqueiro",45)
        );
        System.out.println("Tarefa A");
        System.out.println("Mostre apenas os nomes dos personagens com nível >= 50, em ordem alfabética.");
        personagens.stream().filter(personagem -> personagem.getNivel() > 50)
                .map(Personagem::getNome).sorted().forEach(System.out::println);
        System.out.println();

        System.out.println("Tarefa B");
        System.out.println("Crie uma String com os nomes dos personagens separados por \" | \".");
        String string = personagens.stream().map(Personagem::getNome).collect(Collectors.joining(" | "));
        System.out.println(string);
        System.out.println();

        System.out.println("Tarefa C");
        System.out.println("Descubra qual classe tem mais personagens.");
        Map<String, Long> collect = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse, Collectors.counting()));
        System.out.println(collect);
        System.out.println();

        System.out.println("Tarefa D");
        System.out.println("Mostre o personagem com maior nível");
        personagens.stream().max(Comparator.comparing(Personagem::getNivel)).ifPresent(System.out::println);
        System.out.println();

        System.out.println("Tarefa E");
        System.out.println("Agrupe os personagens por classe e mostre");
        Map<String, Set<String>> grupo = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse, Collectors.mapping(Personagem::getNome, Collectors.toSet())));
        System.out.println(grupo);
        System.out.println();

        System.out.println("Agrupe por classe e depois por nível");
        Map<String, Map<Nivelacao, List<Personagem>>> nivel = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse,
                Collectors.groupingBy(ln -> ln.getNivel() < 50 ?
                        Nivelacao.BAIXO : ln.getNivel() < 80 ? Nivelacao.MEDIO : Nivelacao.ALTO)));
        System.out.println(nivel);

    }
}
