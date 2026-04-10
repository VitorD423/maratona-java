package academy.devdojo.maratonajava.Atividades.FAtividades.Ranking.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Ranking.dominio.Jogador;
//Faça:
//Crie uma lista
//Ordene por:
//maior pontuação
//nome (A-Z) em empate
//Remova jogadores com pontuação 0
//Tente usar binarySearch
import java.util.*;

public class Atividade3 {
    public static void main(String[] args) {

        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Leymar", 400));
        jogadores.add(new Jogador("Vini junior", 600));
        jogadores.add(new Jogador("Pedro",300));
        jogadores.add(new Jogador("Olise",900));
        jogadores.add(new Jogador("Kaka",0));

        Comparator<Jogador> comparator = Comparator.comparing(Jogador::getPontuacao)
                .reversed().thenComparing(Jogador::getNome, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
        jogadores.sort(comparator);
        jogadores.removeIf(jogador -> jogador.getPontuacao() == 0);

        for (Jogador jogadore : jogadores) {
            System.out.println(jogadore);
        }


        System.out.println();
        Jogador chave = new Jogador("vini junior",600);
        int index = Collections.binarySearch(jogadores, chave, comparator);
        System.out.println(index);

    }
}
