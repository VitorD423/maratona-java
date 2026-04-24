package academy.devdojo.maratonajava.Atividades.FAtividades.Ranking.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Ranking.dominio.Jogador;

import java.util.*;

public class SistemaRankingTest {
    public static void main(String[] args) {
        Set<Jogador> jogadoresSet = new HashSet<>();
        jogadoresSet.add(new Jogador("Leymar", 400,2L,0));
        jogadoresSet.add(new Jogador("Vini junior", 0,1L,40));
//        jogadoresSet.add(new Jogador("Pedro",300,3L,20));
//        jogadoresSet.add(new Jogador("Pedro",300,3L,20));
//        jogadoresSet.add(new Jogador("Messi",900,5L,80));
//        jogadoresSet.add(new Jogador("Olise",900,6L,80));
//        jogadoresSet.add(new Jogador("Kaka",0,4L,10));

        List<Jogador> jogadores = new ArrayList<>(jogadoresSet);

        Comparator<Jogador> comparator = Comparator.comparing(Jogador::getPontuacao).reversed()
                        .thenComparing(Jogador::getHorasJogadas, Comparator.reverseOrder()).
                thenComparing(Jogador::getNome, String.CASE_INSENSITIVE_ORDER)
                .thenComparing(Jogador::getId);
        jogadores.removeIf(jogador -> jogador.getPontuacao() == 0);
        jogadores.sort(comparator);

        int limite = Math.min(3, jogadores.size());

        System.out.println("Top " + limite + ":");
        jogadores.stream().limit(limite).forEach(jogador -> System.out.println(jogador));

        System.out.println("----------------------");

        Jogador chave = new Jogador("Olise",900,6L,80);
        int index = Collections.binarySearch(jogadores,chave,comparator);
        System.out.println("Posição do Olise no ranking: " + index);

        NavigableSet<Jogador> set = new TreeSet<>(comparator);
        set.addAll(jogadores);

        System.out.println("-------------------");
        System.out.println("Quem está logo acima de Olise no ranking: ");
            System.out.println(set.descendingSet().higher(chave));

        System.out.println("Quem está abaixo de Olise no ranking: ");
            System.out.println(set.descendingSet().lower(chave));
    }
}
