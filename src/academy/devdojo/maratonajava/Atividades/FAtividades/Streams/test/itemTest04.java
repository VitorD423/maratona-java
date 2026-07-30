package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Item;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class itemTest04 {
    public static void main(String[] args) {
        List<Item> itens = List.of(
                new Item("Espada", 300, "Arma"),
                new Item("Poção", 50, "Consumível"),
                new Item("Arco", 200, "Arma"),
                new Item("Escudo", 250, "Arma"),
                new Item("Elixir", 500, "Consumível"),
                new Item("Adaga", 120, "Arma"),
                new Item("Maçã", 10, "Comida"),
                new Item("Carne", 80, "Comida")

        );

        System.out.println("Mostre apenas os nomes dos itens que custam mais de 100, em ordem alfabética.");
        System.out.println();
        itens.stream().filter(item -> item.getValor() > 100).map(Item::getNome).sorted().forEach(System.out::println);
        System.out.println();
        System.out.println("Calcule o valor médio de todos os itens.");
        System.out.println();
        //itens.stream()
        System.out.println("Mostre o item mais caro.");
        System.out.println();
        itens.stream().max(Comparator.comparing(Item::getValor)).ifPresent(System.out::println);
        System.out.println();
        System.out.println("Agrupe os itens por tipo.");
        System.out.println();
        Map<String, List<Item>> collect = itens.stream().collect(Collectors.groupingBy(Item::getTipo));
        System.out.println(collect);
        System.out.println();
        System.out.println("Conte quantos itens existem de cada tipo.");
        System.out.println();
        Map<String, Long> collect1 = itens.stream().collect(Collectors.groupingBy(Item::getTipo, Collectors.counting()));
        System.out.println(collect1);
        System.out.println();
        System.out.println("Agrupe por tipo, mas mostrando apenas os nomes dos itens.");
        System.out.println();
        Map<String, List<String>> collect2 = itens.stream().collect(Collectors.groupingBy(Item::getTipo, Collectors.mapping(Item::getNome, Collectors.toList())));
        System.out.println(collect2);


    }
}
