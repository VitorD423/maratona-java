package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonagensTest12 {
    public static void main(String[] args) {
        List<Personagem> personagens = List.of(
                new Personagem("Vitor", "Mago", 22),
                new Personagem("Arthur", "Guerreiro", 50),
                new Personagem("Merlin", "Mago", 80),
                new Personagem("Legolas", "Arqueiro", 65),
                new Personagem("Frieren", "Mago", 100),
                new Personagem("Guts", "Guerreiro", 90),
                new Personagem("Hanzo", "Arqueiro", 45),
                new Personagem("Aqua", "Sacerdote", 55)
        );
        System.out.println("Tarefa A");
        personagens.stream().filter(personagem -> personagem.getNivel() >= 50)
                .map(Personagem::getNome).sorted().forEach(System.out::println);
        System.out.println();

        System.out.println("Tarefa B");
        String string = personagens.stream().map(Personagem::getNome).collect(Collectors.joining(" -> "));
        System.out.println(string);
        System.out.println();

        System.out.println("Tarefa C");
        personagens.stream().min(Comparator.comparing(Personagem::getNivel)).ifPresent(System.out::println);
        System.out.println();

        System.out.println("Tarefa D");
        int sum = personagens.stream().mapToInt(Personagem::getNivel).sum();
        System.out.println(sum);
        System.out.println();

        System.out.println("Tarefa E");
        double v = personagens.stream().mapToInt(Personagem::getNivel).average().orElse(0.0);
        System.out.println(v);
        System.out.println();

        System.out.println("Tarefa F");
        Map<String, List<Personagem>> collect = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse));
        System.out.println(collect);
        System.out.println();

        System.out.println("Tarefa G");
        Map<String, Long> collect1 = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse, Collectors.counting()));
        System.out.println(collect1);
        System.out.println();

        System.out.println("Tarefa H");
        Map<String, List<String>> collect2 = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse, Collectors.mapping(Personagem::getNome, Collectors.toList())));
        System.out.println(collect2);


    }
}
