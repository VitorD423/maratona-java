package academy.devdojo.maratonajava.Atividades.FAtividades.Map.Atv1.Teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            System.out.println(entry.getKey().getNome());
            for (Consumidor consumidor : entry.getValue()){
                System.out.println(consumidor.getNome());
            }
        }
// computeIfAbsent → garantir que existe
// merge → atualizar o valor

    }
}
