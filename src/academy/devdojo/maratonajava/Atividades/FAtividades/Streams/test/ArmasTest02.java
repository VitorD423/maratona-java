package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArmasTest02 {
    public static void main(String[] args) {

        System.out.println("Parte 1:");

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(10, 300))
                .limit(100).filter(n -> n > 150)
                .forEach(System.out::println);

        System.out.println("----------------------------");

        System.out.println("Parte 2:");
        Stream.iterate(1, n -> n + 3).filter(n -> n > 20).limit(15).limit(15)
                .forEach(System.out::println);
        //limit.filter(integer -> integer > 150).limit(10).forEach(System.out::println);

        System.out.println("Parte 3:");
        String string = Stream.iterate(1, n -> n + 2).filter(n -> n > 20).limit(15)
                .map(a -> "Nível: " + a)
                .collect(Collectors.joining(" | "));
        System.out.println(string);

    }
}
