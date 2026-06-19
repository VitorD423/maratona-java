package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class personagemTest09 {
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
        System.out.println("1");
        personagens.stream().map(Personagem::getNome).forEach(System.out::println);
        System.out.println();

        System.out.println("2");
        personagens.stream().filter(personagem -> personagem.getNivel() >= 60)
                .map(Personagem::getNome).sorted().forEach(System.out::println);
        System.out.println();


        System.out.println("3");
        String string = personagens.stream().map(Personagem::getNome).collect(Collectors.joining(" | "));
        System.out.println(string);
        System.out.println();

        System.out.println("4");
        Map<String, Long> collect = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse, Collectors.counting()));
        System.out.println(collect);
        System.out.println();

        System.out.println("5");
        personagens.stream().max(Comparator.comparing(Personagem::getNivel)).ifPresent(System.out::println);
        System.out.println();


        System.out.println("6");
        Map<String, List<String>> collect1 = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse,
                Collectors.mapping(Personagem::getNome, Collectors.toList())));
        System.out.println(collect1);
    }
}
