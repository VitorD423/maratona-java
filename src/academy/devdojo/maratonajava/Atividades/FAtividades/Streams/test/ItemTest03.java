package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Item;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemTest03 {
    public static void main(String[] args) {
        List<Item> itens = List.of(
                new Item("Espada",300,"Arma"),
                new Item("Poção",50,"Consumível"),
                new Item("Arco",200,"Arma"),
                new Item("Escudo",250,"Arma"),
                new Item("Elixir",500,"Consumível"),
                new Item("Adaga",120,"Arma"),
                new Item("Maçã",10,"Comida")
        );
        System.out.println("A");
        itens.stream().filter(item -> item.getValor() > 100).map(Item::getNome).forEach(System.out::println);
        System.out.println();

        System.out.println("B");
        String string = itens.stream().filter(item -> item.getTipo().equals("Arma")).map(Item::getNome)
                .collect(Collectors.joining(" | "));
        System.out.println(string);
        System.out.println();

        System.out.println("C");
        itens.stream().min(Comparator.comparing(Item::getValor)).ifPresent(System.out::println);
        System.out.println();

        System.out.println("D");
        Map<String, List<Item>> collect = itens.stream().collect(Collectors.groupingBy(Item::getTipo));
        System.out.println(collect);
        System.out.println();

        System.out.println("E");
        Map<String, Long> collect1 = itens.stream().collect(Collectors.groupingBy(Item::getTipo, Collectors.counting()));
        System.out.println(collect1);
        System.out.println();

        System.out.println("F");
        itens.stream().map(Item::getNome).sorted().forEach(System.out::println);
    }
}
