package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Armas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArmasTest {

   private static List<Armas> armas = new ArrayList<>(List.of(new Armas("Espada",50,"Comum")
    ,new Armas("Machado",120,"Raro"),
        new Armas("Arco", 80, "Comum"),
        new Armas("Katana", 200, "Lendario"),
        new Armas("Katana", 200, "Lendario"),
        new Armas("Adaga", 30, "Comum"),
        new Armas("Adaga", 30, "Comum"),
        new Armas("Katana", 200, "Lendario")
    ));

    public static void main(String[] args) {
        Stream<Armas> stream = armas.stream();
        System.out.println("Todas as armas: ");
        armas.forEach(System.out::println);
        System.out.println();

        System.out.println("Armas com o dano maior que 70: ");
        List<Armas> count = stream.distinct().filter(ar -> ar.getDano() > 70).collect(Collectors.toList());
        System.out.println(count);

        System.out.println();
        System.out.println("Apenas os nomes das armas: ");
        List<String> nomes = armas.stream().map(Armas::getNome).collect(Collectors.toList());
        System.out.println(nomes);

        System.out.println();
        System.out.println("As 3 primeiras: ");
        armas.stream().limit(3).forEach(System.out::println);

        System.out.println();
        System.out.println("Quantas armas têm o dano maior que 50: ");
        long count1 = armas.stream().filter(ar -> ar.getDano() >= 50).count();
        System.out.println(count1);

        System.out.println();
        armas.stream().distinct().forEach(System.out::println);


    }
}
