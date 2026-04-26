package academy.devdojo.maratonajava.Atividades.FAtividades.NavigableMap.test;

import java.util.*;

public class RankingNavigableMap {
    public static void main(String[] args) {
        NavigableMap<Integer, List<String>> ranking = new TreeMap<>();
        ranking.computeIfAbsent(100,k -> new ArrayList<>()).add("Carlos");
        ranking.computeIfAbsent(300,k -> new ArrayList<>()).add("Ana");
        ranking.computeIfAbsent(200,k -> new ArrayList<>()).add("Carlos");
        ranking.computeIfAbsent(200,k -> new ArrayList<>()).add("Pedro");

        System.out.println("Maior pro menor: ");
        for (Map.Entry<Integer,List<String>> entry: ranking.descendingMap().entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("-------------------------");

        System.out.println("Abaixo de 200: ");
            Map.Entry<Integer, List<String>> lower = ranking.lowerEntry(200);
            System.out.println(lower.getKey() + " - " + lower.getValue());

        System.out.println("-------------------------");

        System.out.println("Acima de 200: ");
        Map.Entry<Integer, List<String>> high = ranking.higherEntry(200);
        System.out.println(high.getKey() + " - " + high.getValue());

        System.out.println("-------------------------");

        System.out.println("TOP 1 : ");
        Map.Entry<Integer, List<String>> top = ranking.lastEntry();
        System.out.println(top.getKey() + " - " + top.getValue());

        System.out.println("-------------------------");

        System.out.println("Remover o pior jogador: ");
        Map.Entry<Integer, List<String>> pior = ranking.pollFirstEntry();
        System.out.println(pior.getKey() + " - " + pior.getValue());


    }
}
