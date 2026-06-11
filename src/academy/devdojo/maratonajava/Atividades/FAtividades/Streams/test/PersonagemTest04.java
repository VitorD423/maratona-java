package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;

import java.util.List;
import java.util.stream.Collectors;

public class PersonagemTest04 {
    public static void main(String[] args) {
        List<Personagem> personagens = List.of(
                new Personagem("Vitor", "Mago", 22),
                new Personagem("Arthur", "Guerreiro", 50),
                new Personagem("Merlin", "Mago", 80),
                new Personagem("Legolas", "Arqueiro", 65),
                new Personagem("Frieren", "Mago", 100),
                new Personagem("Guts", "Guerreiro", 90)
        );

        String string = personagens.stream().filter(personagem -> personagem.getNivel() > 60)
                .map(Personagem::getNome).sorted().collect(Collectors.joining(" - "));

        System.out.println(string);
    }
}
