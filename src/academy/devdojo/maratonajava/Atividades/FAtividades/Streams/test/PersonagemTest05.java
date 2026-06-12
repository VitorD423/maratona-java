package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;

import java.util.*;
import java.util.stream.Collectors;

public class PersonagemTest05 {
    public static void main(String[] args) {
        List<Personagem> personagens = List.of(
                new Personagem("Vitor","Mago",22),
                new Personagem("Arthur","Guerreiro",50),
                new Personagem("Merlin","Mago",80),
                new Personagem("Legolas","Arqueiro",65),
                new Personagem("Frieren","Mago",100),
                new Personagem("Guts","Guerreiro",90)
        );

        System.out.println("Tarefa A: ");
        personagens.stream()
                .filter(personagem -> personagem.getNivel() > 50).map(Personagem::getNome)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Tarefa B: ");
        int sum = personagens.stream().filter(personagem -> personagem.getNivel() > 50)
                .mapToInt(Personagem::getNivel).sum();

        System.out.println(sum);

        System.out.println("Tarefa C: ");
        personagens.stream().max(Comparator.comparing(Personagem::getNivel)).ifPresent(System.out::println);
        System.out.println();

        System.out.println("Tarefa D: ");
        String string = personagens.stream().filter(personagem -> personagem.getClasse().equals("Mago"))
                .map(Personagem::getNome)
                .collect(Collectors.joining(" | "));
        System.out.println(string);

        System.out.println("Tarefa E 1: ");
        Map<String, List<Personagem>> mago = personagens.stream().filter(personagem -> personagem.getClasse().equals("Mago"))
                .collect(Collectors.groupingBy(Personagem::getClasse));
        System.out.println(mago);

        System.out.println();

        System.out.println("Tarefa E 2: ");
        Map<String, List<Personagem>> naoMago = personagens.stream()
                .filter(personagem -> !personagem.getClasse().equals("Mago"))
                .collect(Collectors.groupingBy(Personagem::getClasse));
        System.out.println(naoMago);
    }
}
