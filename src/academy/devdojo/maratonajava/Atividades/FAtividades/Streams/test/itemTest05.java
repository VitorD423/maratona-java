package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Item;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class itemTest05 {
    public static void main(String[] args) {
        List<Item> itens = List.of(
                new Item("Espada", 300, "Arma"),
                new Item("Poção", 50, "Consumível"),
                new Item("Arco", 200, "Arma"),
                new Item("Escudo", 250, "Arma"),
                new Item("Elixir", 500, "Consumível"),
                new Item("Adaga", 120, "Arma"),
                new Item("Maçã", 10, "Comida"),
                new Item("Carne", 80, "Comida"),
                new Item("Peixe", 150, "Comida")
        );

        System.out.println("A. Mostre os nomes dos itens que custam 150 ou mais.");
        itens.stream().filter(item -> item.getValor() >= 150).map(Item::getNome).forEach(System.out::println);

        System.out.println();

        System.out.println("B. Crie uma String contendo os nomes de todos os itens separados por: ->");
        String string = itens.stream().map(Item::getNome).collect(Collectors.joining(" -> "));
        System.out.println(string);

        System.out.println();

        System.out.println("C. Mostre o item de menor valor.");
        itens.stream().min(Comparator.comparing(Item::getValor)).ifPresent(System.out::println);

        System.out.println();

        System.out.println("D. Calcule a soma total dos valores dos itens.");
        double sum = itens.stream().mapToDouble(Item::getValor).sum();
        System.out.println(sum);

        System.out.println();

        System.out.println("E. Calcule a média dos valores dos itens.");
        itens.stream().mapToDouble(Item::getValor).average().ifPresent(System.out::println);

        System.out.println();

        System.out.println("F. Agrupe os itens por tipo");
        Map<String, List<Item>> collect = itens.stream().collect(Collectors.groupingBy(Item::getTipo));
        System.out.println(collect);

        System.out.println();

        System.out.println("G. Conte quantos itens existem em cada tipo.");
        Map<String, Long> collect1 = itens.stream().collect(Collectors.groupingBy(Item::getTipo, Collectors.counting()));
        System.out.println(collect1);

        System.out.println();

        System.out.println("H. Agrupe por tipo mostrando apenas os nomes.");
        Map<String, List<String>> collect2 = itens.stream().collect(Collectors.groupingBy(Item::getTipo, Collectors.mapping(Item::getNome, Collectors.toList())));
        System.out.println(collect2);


    }
}
