package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Nivelacao;
import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonagemTest06 {
    public static void main(String[] args) {
        List<Personagem> personagens = List.of(
                new Personagem("Vitor","Mago",22),
                new Personagem("Arthur","Guerreiro",50),
                new Personagem("Merlin","Mago",80),
                new Personagem("Legolas","Arqueiro",65),
                new Personagem("Frieren","Mago",100),
                new Personagem("Guts","Guerreiro",90)
        );

        Map<String, Map<Nivelacao, List<Personagem>>> collect = personagens.stream()
                .collect(Collectors.groupingBy(Personagem::getClasse,
                        Collectors
                                .groupingBy(ln -> ln.getNivel() < 50 ? Nivelacao.BAIXO : ln.getNivel() < 80
                                ? Nivelacao.MEDIO : Nivelacao.ALTO
                                )));


        System.out.println(collect);

        System.out.println("-------------------");
        //Outra forma:

        Map<Nivelacao, List<Personagem>> outra = personagens.stream().collect(Collectors.groupingBy(PersonagemTest06::getNivelacao));
        System.out.println(outra);

        //groupingBy(p -> p.getNivel() > 60 ? "Alto" : "Baixo")
    }

    private static Nivelacao getNivelacao(Personagem p) {
        if (p.getNivel() < 50) {
            return Nivelacao.BAIXO;
        }
        if (p.getNivel() < 80) {
            return Nivelacao.MEDIO;
        }
        return Nivelacao.ALTO;
    }
}
