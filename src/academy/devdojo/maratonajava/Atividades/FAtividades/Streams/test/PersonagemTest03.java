package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonagemTest03 {
    public static void main(String[] args) {
        List<Personagem> personagens = List.of(
                new Personagem("Vitor","Mago",22),
                new Personagem("Arthur","Guerreiro",50),
                new Personagem("Merlin","Mago",80),
                new Personagem("Legolas","Arqueiro",65),
                new Personagem("Frieren","Mago",100),
                new Personagem("Guts", "Guerreiro",90)
        );

//        List<String> ordem = personagens.stream().map(Personagem::getNome).sorted().toList();
//        System.out.println(ordem);

        System.out.println(" ");
        String atv = personagens.stream().filter(nv -> nv.getNivel() > 60)
                .map(Personagem::getNome)
                .sorted().collect(Collectors.joining(" | "));


        //.reduce((n1, n2) -> n1 + " | " + n2).ifPresent(System.out::println);
        System.out.println(atv);

//        personagens.stream().filter(nv -> nv.getNivel() > 60);
    }
}
