package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Item;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProdutoTest01 {
    public static void main(String[] args) {
        List<Item> produtos = List.of(
                new Item("Teclado",150,"Periférico"),
                new Item("Mouse",80,"Periférico"),
                new Item("Monitor",900,"Hardware"),
                new Item("Headset",250,"Periférico"),
                new Item("SSD",400,"Hardware"),
                new Item("Webcam",120,"Acessorio")

        );

        System.out.println("1. Filtrar os produtos com preço superior a R$ 100." +
                "/ Transforme a lista para obter somente os nomes dos produtos." +
                "/Ordene os nomes em ordem alfabética.");
        produtos.stream().filter(item -> item.getValor() > 100).map(Item::getNome).sorted().forEach(System.out::println);
        System.out.println();

        produtos.stream().filter(item -> item.getTipo().equals("Periférico")).forEach(System.out::println);
        System.out.println();

        System.out.println("2. Agrupando e calculando valores");
        System.out.println("Agrupe os produtos por categoria." +
                "Conte quantos produtos existem em cada categoria." +
                "Calcule o preço médio dos produtos de cada categoria." +
                "Calcule o valor total dos produtos de cada categoria." +
                "Exiba os resultados usando um Map.");

        System.out.println();

        System.out.println("Agrupar por categoria: ");
        Map<String, Long> collect1 = produtos.stream().collect(Collectors.groupingBy(Item::getTipo, Collectors.counting()));

        System.out.println(collect1);
        System.out.println();

        System.out.println("Preço medio");
        Map<String, Double> precoMedio = produtos.stream().collect(Collectors.groupingBy(Item::getTipo, Collectors.averagingDouble(Item::getValor)));
        System.out.println(precoMedio);
        System.out.println();

        System.out.println("Valor Total: ");
        Map<String, Double> valorTotal = produtos.stream().collect(Collectors.groupingBy(Item::getTipo, Collectors.summingDouble(Item::getValor)));
        System.out.println(valorTotal);
    }
}
