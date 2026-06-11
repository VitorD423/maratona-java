package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Item;

import java.util.List;
import java.util.stream.Collectors;

public class ItemTest02 {
    public static void main(String[] args) {
        List<Item> itens = List.of(
                new Item("Espada",300,"Arma"),
                new Item("Poção",50,"Consumível"),
                new Item("Arco",200,"Arma"),
                new Item("Escudo",250,"Arma"),
                new Item("Elixir",500,"Consumível"),
                new Item("Adaga",120,"Arma")
        );



        String string = itens.stream().filter(item -> item.getTipo().equals("Arma"))
                .map(Item::getNome).sorted()
                .collect(Collectors.joining(" | "));

        System.out.println(string);

        double sum = itens.stream().filter(item -> item.getTipo().equals("Arma"))
                .mapToDouble(Item::getValor).sum();
        System.out.println(sum);

        //.map(Item::getValor).reduce((aDouble, aDouble2) -> aDouble + aDouble2).ifPresent(System.out::println);


    }
}
