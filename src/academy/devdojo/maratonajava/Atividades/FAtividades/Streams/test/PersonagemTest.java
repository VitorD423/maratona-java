package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PersonagemTest {
    public static void main(String[] args) {
        List<Personagem> personagens = List.of(
                new Personagem("Vitor","Mago",22),
                new Personagem("Arthur","Guerreiro",50),
                new Personagem("Merlin","Mago",80),
                new Personagem("Legolas","Arqueiro",65),
                new Personagem("Frieren","Mago",100),
                new Personagem("Guts", "Guerreiro",90)
        );

        System.out.println("Nivel maior que 60");
        personagens.stream().filter(nv -> nv.getNivel() > 60).forEach(System.out::println);
        System.out.println();

        System.out.println("Nomes: ");
        List<String> nomes = personagens.stream().map(Personagem::getNome).toList();
        System.out.println(nomes);
        System.out.println();

        System.out.println("Soma de todos os niveis: ");
        int sum = personagens.stream().mapToInt(Personagem::getNivel).sum();
        System.out.println(sum);
        System.out.println();

        System.out.println("Personagem com maior nível: ");
        personagens.stream().reduce((n1, n2) -> n1.getNivel() >  n2.getNivel() ? n1 : n2).ifPresent(System.out::println);
        System.out.println();

        System.out.println("Apenas magos: ");
        personagens.stream().filter(personagem -> personagem.getClasse().equals("Mago"))
                .forEach(System.out::println);

        System.out.println("Nomes em uma unica string");
        personagens.stream().map(Personagem::getNome).reduce((n1, n2) -> n1 + ", " + n2).ifPresent(System.out::println);
        System.out.println();

        System.out.println("Nivel menor para o maior");
        personagens.stream().sorted(Comparator.comparing(Personagem::getNivel)).forEach(System.out::println);
        System.out.println();

        System.out.println("Calcular média dos níveis");
        double media = personagens.stream().mapToInt(Personagem::getNivel)
                .average()
                .orElse(0);
        System.out.println(media);


    }
}
