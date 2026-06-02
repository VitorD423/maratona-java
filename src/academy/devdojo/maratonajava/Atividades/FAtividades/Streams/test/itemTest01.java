package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Item;

import java.util.List;
import java.util.Optional;

public class itemTest01 {
    public static void main(String[] args) {
        List<Item> itens = List.of(
                new Item("Espada", 100),
                new Item("Poção", 20),
                new Item("Arco", 150),
                new Item("Escudo", 80),
                new Item("Katana", 300)
        );

        int total = itens.stream().map(Item::getValor)
                .reduce(0,Integer::sum);
        System.out.println(total);

        System.out.println("----------------------");

      Item maisCaro = itens.stream().reduce((i1,i2) -> i1.getValor() > i2.getValor() ? i1 : i2)
              .orElse(null);
        System.out.println(maisCaro);

        System.out.println("----------------------");

        itens.stream().map(Item::getNome).reduce((n1,n2) -> n1 + ", " + n2).ifPresent(System.out::println);

        System.out.println("----------------------");

        long multiplicar = itens.stream().map(Item::getValor).mapToLong(Integer::longValue)
                .reduce(1,(n1,n2) -> n1 * n2);
        System.out.println(multiplicar);
    }
}