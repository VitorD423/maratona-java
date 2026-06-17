package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.FaixaPreco;
import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Item;
import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArmasTest03 {
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
        System.out.println("Tarefa A");
        System.out.println("Mostre apenas os nomes dos itens que custam mais de 150.");
        itens.stream().filter(item -> item.getValor() > 150).map(Item::getNome)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Tarefa B");
        System.out.println("Crie uma única String com os nomes dos itens do tipo Arma em ordem alfabética.");
        String string = itens.stream().filter(item -> item.getTipo().equals("Arma")).map(Item::getNome).sorted().collect(Collectors.joining(" | "));
        System.out.println(string);
        System.out.println();


        System.out.println("Tarefa C");
        System.out.println("Calcule o valor total de todos os itens.");
        double sum = itens.stream().mapToDouble(Item::getValor).sum();
        System.out.println(sum);
        System.out.println();

        System.out.println("Tarefa D");
        System.out.println("Descubra qual é o item mais caro");
        itens.stream().max(Comparator.comparing(Item::getValor)).ifPresent(System.out::println);
        System.out.println();

        System.out.println("Tarefa E");
        System.out.println("Agrupe os itens por tipo");
        Map<String, List<Item>> collect = itens.stream().collect(Collectors.groupingBy(Item::getTipo));
        System.out.println(collect);
        System.out.println();

        System.out.println("Tarefa F");
        System.out.println("Agrupe os itens por tipo");
        Map<String, Map<FaixaPreco, List<Item>>> collect1 = itens.stream().collect(Collectors.groupingBy(Item::getTipo, Collectors.groupingBy(t -> t.getValor() < 100 ? FaixaPreco.BARATO :
                t.getValor() > 100 ? FaixaPreco.MEDIO : FaixaPreco.CARO)));
        System.out.println(collect1);

    }
}
