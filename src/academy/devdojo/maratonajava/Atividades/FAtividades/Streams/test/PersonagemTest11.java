package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;

import java.util.List;

public class PersonagemTest11 {
    public static void main(String[] args) {
        List<Personagem> personagens = List.of(
                new Personagem("Vitor", "Mago", 22),
                new Personagem("Arthur", "Guerreiro", 50),
                new Personagem("Merlin", "Mago", 80),
                new Personagem("Legolas", "Arqueiro", 65),
                new Personagem("Frieren", "Mago", 100),
                new Personagem("Guts", "Guerreiro", 90)
        );

        personagens.stream().filter(personagem -> personagem.getNivel() > 65).forEach(System.out::println);

    }
}
