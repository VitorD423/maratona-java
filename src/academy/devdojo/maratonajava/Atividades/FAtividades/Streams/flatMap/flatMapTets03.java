package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapTets03 {
    public static void main(String[] args) {
        List<List<String>> inventarios = new ArrayList<>();

        List<String> bolsa1 = List.of("Espada","Poção","Escudo");
        List<String> bolsa2 = List.of("Arco","Flecha");
        List<String> bolsa3 = List.of("Cajado","Livro");

        inventarios.add(bolsa1);
        inventarios.add(bolsa2);
        inventarios.add(bolsa3);




        inventarios.stream().flatMap(List::stream).forEach(System.out::println);
        System.out.println();
        List<String> l1 = bolsa1.stream().map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        List<String> l2 = bolsa2.stream().map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        List<String> l3 = bolsa3.stream().map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());

        System.out.println("Bolsa 1: " + l1 +" Bolsa 2: "+ l2 +" Bolsa 3: "+ l3);
    }
}
