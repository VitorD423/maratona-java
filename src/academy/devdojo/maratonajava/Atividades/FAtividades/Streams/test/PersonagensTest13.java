package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class PersonagensTest13 {
    public static void main(String[] args) {
        List<Personagem> personagens = List.of(
                new Personagem("Vitor","Mago",22),
                new Personagem("Arthur","Guerreiro",50),
                new Personagem("Merlin","Mago",80),
                new Personagem("Legolas","Arqueiro",65),
                new Personagem("Frieren","Mago",100)
        );

        System.out.println("1. Mostrar nomes com nível acima de 50");
        personagens.stream().filter(personagem -> personagem.getNivel() > 50).map(Personagem::getNome).forEach(System.out::println);

        System.out.println();

        System.out.println("2. Criar uma String com os nomes separados por |");
        String string = personagens.stream().map(Personagem::getNome).collect(Collectors.joining(" | "));
        System.out.println(string);

        System.out.println();

        System.out.println("3. Mostrar o personagem de maior nível");
        personagens.stream().max(Comparator.comparing(Personagem::getNivel)).ifPresent(System.out::println);

        System.out.println();

        System.out.println("4. Calcular a média dos níveis");
        OptionalDouble average = personagens.stream().mapToInt(Personagem::getNivel).average();
        System.out.println(average);

        System.out.println();

        System.out.println("5. Agrupar por classe.");
        Map<String, List<Personagem>> collect = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse));
        System.out.println(collect);

        System.out.println();

        System.out.println("6. Contar quantos personagens existem por classe.");
        Map<String, Long> collect1 = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse, Collectors.counting()));
        System.out.println(collect1);

    }
}
