package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.flatMap;

import java.util.ArrayList;
import java.util.List;

public class flatMapTest01 {
    public static void main(String[] args) {
        List<String> guerreiros = List.of("Thorin","Guts","Arthur");
        List<String> magos = List.of("Merlin","Ainz","Frieren");
        List<String> arqueiros = List.of("Legolas", "Hanzo","Sylvanas");

        List<List<String>> guildas = new ArrayList<>();
        guildas.add(guerreiros);
        guildas.add(magos);
        guildas.add(arqueiros);

        for (List<String> guilda : guildas) {
            for (String s : guilda) {
                System.out.println(s);
            }

        }

        System.out.println("----------------");
        guildas.stream().flatMap(List::stream).forEach(System.out::println);

    }
}
