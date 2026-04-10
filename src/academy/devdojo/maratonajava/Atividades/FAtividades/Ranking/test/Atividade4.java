package academy.devdojo.maratonajava.Atividades.FAtividades.Ranking.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Ranking.dominio.Jogador;

import java.util.HashSet;
import java.util.Set;

public class Atividade4 {
    public static void main(String[] args) {
        Set<Jogador> jogadores = new HashSet<>();
        jogadores.add(new Jogador("Vini junior",323,4L));
        jogadores.add(new Jogador("Vini junior",323,5L));
        jogadores.add(new Jogador("Jotaro",333,1L));
        jogadores.add(new Jogador("Jotaro",333,3L));
        jogadores.add(new Jogador("Leima",222,6L));

        for (Jogador jogadore : jogadores) {
            System.out.println(jogadore);
        }

    }
}
