package academy.devdojo.maratonajava.Atividades.FAtividades.NavigableMap.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class RankingNavigableMap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> ranking = new TreeMap<>();
        ranking.put(100,"Pedro");
        ranking.put(300,"Ana");
        ranking.put(200,"Carlos");
        ranking.put(200,"Pedro");

        System.out.println("Maior pro menor: ");
        for (Map.Entry<Integer,String> entry: ranking.descendingMap().entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("-------------------------");

        System.out.println("Abaixo de 200: ");
            Map.Entry<Integer, String> lower = ranking.lowerEntry(200);
            System.out.println(lower.getKey() + " - " + lower.getValue());

        System.out.println("-------------------------");

        System.out.println("Acima de 200: ");
        Map.Entry<Integer, String> high = ranking.higherEntry(200);
        System.out.println(high.getKey() + " - " + high.getValue());

        System.out.println("-------------------------");

        System.out.println("TOP 1 : ");
        Map.Entry<Integer, String> top = ranking.lastEntry();
        System.out.println(top.getKey() + " - " + top.getValue());

    }
}
