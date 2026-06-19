package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;

import java.util.*;
import java.util.stream.Collectors;

public class PersonagemTest10 {
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
        Map<String, Optional<Personagem>> collect1 = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse,
                Collectors.maxBy(Comparator.comparing(Personagem::getNivel))));
        System.out.println(collect1);
        System.out.println();

        System.out.println("2");
        Map<String, Optional<Personagem>> collect2 = personagens.stream().filter(personagem -> personagem.getNivel() >= 60)
                .collect(Collectors.groupingBy(Personagem::getClasse,
                        Collectors.maxBy(Comparator.comparing(Personagem::getNivel))));
        System.out.println(collect2);
        System.out.println();

        System.out.println("3");
        System.out.println("Agrupe por classe e mostre:\n" +
                "\n" +
                "apenas nomes\n" +
                "ordenados por nível (maior → menor dentro do grupo)");
        Map<String, List<String>> collect3 = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse,
                Collectors.collectingAndThen(Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparing(Personagem::getNivel).reversed())
                                .map(Personagem::getNome).toList())));
        System.out.println(collect3);

    }
}
