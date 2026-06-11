package academy.devdojo.maratonajava.Atividades.AEntrevistas.Entrevista.test;

import academy.devdojo.maratonajava.Atividades.AEntrevistas.Entrevista.dominio.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class produtosTest {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Notebook","Eletrônicos",3500),
                new Produto("Mouse","Eletrônicos",80),
                new Produto("Teclado","Eletrônicos",150),
                new Produto("Cadeira","Móveis",700),
                new Produto("Mesa","Móveis",1200),
                new Produto("Headset","Eletrônicos",300)
        );

        String string = produtos.stream().filter(produto -> produto.getCategoria().equals("Eletrônicos")).map(Produto::getNome).sorted().collect(Collectors.joining(" | "));
        System.out.println(string);

        System.out.println();
        Map<String, List<Produto>> collect = produtos.stream().collect(Collectors.groupingBy(Produto::getCategoria));
        System.out.println(collect);
    }
}
