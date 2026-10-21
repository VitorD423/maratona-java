package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Item;

import java.util.List;

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

        System.out.println("Filtrar os produtos com preço superior a R$ 100." +
                "/ Transforme a lista para obter somente os nomes dos produtos." +
                "/Ordene os nomes em ordem alfabética.");
        produtos.stream().filter(item -> item.getValor() > 100).map(Item::getNome).sorted().forEach(System.out::println);
        System.out.println();

        produtos.stream().filter(item -> item.getTipo().equals("Periférico")).forEach(System.out::println);





    }
}
