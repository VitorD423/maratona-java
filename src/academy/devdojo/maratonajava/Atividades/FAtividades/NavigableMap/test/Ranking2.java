package academy.devdojo.maratonajava.Atividades.FAtividades.NavigableMap.test;

import java.security.Key;
import java.util.*;

public class Ranking2 {
    public static void main(String[] args) {
        NavigableMap<Integer, List<String>> ranking = new TreeMap<>();
            ranking.computeIfAbsent(1000,k -> new ArrayList<>()).add("Vini Junior");
            ranking.computeIfAbsent(3200,k -> new ArrayList<>()).add("Pedro");
            ranking.computeIfAbsent(6666,k -> new ArrayList<>()).add("Mpabe");
            ranking.computeIfAbsent(1000,k -> new ArrayList<>()).add("Neymar");
            ranking.computeIfAbsent(200,k -> new ArrayList<>()).add("Jotaro");
            ranking.computeIfAbsent(100,k -> new ArrayList<>()).add("Dio");

            ranking.descendingMap().forEach((key, value) -> System.out.println(key + " : " + value));

            int busca = 2500;
        System.out.println("Imediatamento menor: " + ranking.lowerKey(busca));
        System.out.println("Imediatamente maior: " + ranking.higherKey(busca));
        System.out.println("Mais próxima pra baixo ou igual: " + ranking.floorKey(busca));
        System.out.println("Mais próxima pra cima ou igual: " + ranking.ceilingKey(busca));

        System.out.println("\nRemovendo menor e maior...");

        ranking.pollFirstEntry(); // remove menor pontuação
        ranking.pollLastEntry(); // remove maior pontuação

        for (Map.Entry<Integer,List<String>> entry: ranking.descendingMap().entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        String jogadorRemover = "Neymar";
        Iterator<Map.Entry<Integer, List<String>>> iterator = ranking.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, List<String>> entry = iterator.next();

            List<String> jogadores = entry.getValue();
            jogadores.contains(jogadorRemover);
            jogadores.remove(jogadorRemover);
            jogadores.isEmpty();
            iterator.remove();
            // 1. remover jogador da lista
            // 2. verificar se lista ficou vazia
            // 3. se sim → remover do mapa com iterator
        }
    }
}
