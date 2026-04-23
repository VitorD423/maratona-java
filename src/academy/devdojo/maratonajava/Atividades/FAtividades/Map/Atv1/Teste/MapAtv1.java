package academy.devdojo.maratonajava.Atividades.FAtividades.Map.Atv1.Teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class MapAtv1 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        Consumidor consumidor3 = new Consumidor("Vitor Diego");
        Consumidor consumidor4 = new Consumidor("Pedro");
        Consumidor consumidor5 = new Consumidor("Leimar");

        Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L,"Berserk",9.5);
        Manga manga3 = new Manga(4L,"Pokemon",3.2);
        Manga manga4 = new Manga(3L,"Attack on titan",11.20);
        Manga manga5 = new Manga(2L,"Dragon ball Z",2.99);

        List<Consumidor> consumidorMangas1List = List.of(consumidor1,consumidor3,consumidor4);
        List<Consumidor> consumidorMangas2List = List.of(consumidor2,consumidor5);

        Map<Manga, List<Consumidor>> mangaConsumidorMap = new HashMap<>();

        mangaConsumidorMap.put(manga5,consumidorMangas1List);
        mangaConsumidorMap.put(manga3,consumidorMangas2List);

        for (Map.Entry<Manga, List<Consumidor>> entry : mangaConsumidorMap.entrySet()){
            System.out.println("Nome do manga: " + entry.getKey().getNome());
            for (Consumidor consumidor : entry.getValue()){
                System.out.println("Consumidores: " + consumidor.getNome());
            }
        }
// computeIfAbsent → garantir que existe
// merge → atualizar o valor
        Map<Manga, Integer> contador = new HashMap<>();
        for (Map.Entry<Manga, List<Consumidor>> entry : mangaConsumidorMap.entrySet()){
            for (Consumidor consumidor : entry.getValue()){
                contador.merge(entry.getKey(), 1, Integer::sum);
            }
        }

        System.out.println("Contagem: ");
        int max = Collections.max(contador.values());
        for (Map.Entry<Manga, Integer> entry : contador.entrySet()){
            if(entry.getValue() == max){
            System.out.println("Manga com mais consumidores: " + entry.getKey().getNome() + " - " + entry.getValue());
            }
        }

        List<Map.Entry<Manga, Integer>> lista = new ArrayList<>(contador.entrySet());
        lista.sort(((e1, e2) -> e2.getValue().compareTo(e1.getValue())));

        int posicao = 1;
        for (Map.Entry<Manga, Integer> entry : lista){
            System.out.println("Ranking: " + posicao + "º - " + entry.getKey().getNome() + " - " + entry.getValue());
            posicao++;
        }
    }
}
