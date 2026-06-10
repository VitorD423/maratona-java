package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class PersonagemTest02 {
    public static void main(String[] args) {
        List<List<Personagem>> guildas = List.of(
                List.of(
                  new Personagem("Vitor","Mago",22),
                  new Personagem("Arthur","Guerreiro",50)
                ),

                List.of(
                        new Personagem("Merlin","Mago",80),
                        new Personagem("Guts","Guerreiro",90)
                ),

                List.of(
                        new Personagem("Frieren","Mago",100),
                        new Personagem("Legolas","Arqueiro",65)
                )
        );

        System.out.println("Nível acima de 60: ");
        Optional<String> ATV = guildas.stream().flatMap(Collection::stream)
                .filter(nv -> nv.getNivel() > 60)
                .map(Personagem::getNome)
                .reduce((n1, n2) -> n1 + " -> " + n2);

        ATV.ifPresent(System.out::println);




    }
}
