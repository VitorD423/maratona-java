package academy.devdojo.maratonajava.Atividades.FAtividades.Lambda.Test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Lambda.dominio.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ItemTest01 {
    public static void main(String[] args) {
        List<Item> itens = List.of(new Item("Espada","Raro",100),
                                    new Item("Poção","Comum",20),
                                    new Item("Arco","Raro",750),
                                    new Item("Armadura","Raro",95),
                                    new Item("Lança","Lendario",12));

        Predicate<Item> valorMaiorQue500 = p -> p.getValor() > 500;
        List<Item> caros = itens.stream().filter(valorMaiorQue500).toList();
        caros.forEach(p -> System.out.println(p.getNome()));

        Predicate<Item> lendarios = p -> p.getRaridade().equals("Lendario");
        List<Item> raros = itens.stream().filter(lendarios).toList();
        raros.forEach(p -> System.out.println(p.getNome()));

        Predicate<Item> comecaComE = p -> p.getNome().startsWith("E");
        List<Item> starE = itens.stream().filter(comecaComE).toList();
        starE.forEach(p -> System.out.println(p.getNome()));

        forEach(itens, s -> System.out.println(s));

        List<Double> valores = map(itens,item -> item.getValor());
        System.out.println(valores);
    }


    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T e: list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }

}
