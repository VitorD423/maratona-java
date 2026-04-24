package academy.devdojo.maratonajava.Atividades.FAtividades.Set.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTestComparacao {
    public static void main(String[] args) {
        Set<Manga> hashSet = new HashSet<>();

        Set<Manga> linkedHashSet = new LinkedHashSet<>();

        Set<Manga> treeSet = new TreeSet<>(Comparator.comparing(Manga::getPreco));

        List<Manga> mangas = List.of(
                new Manga(5L,"Hellsing Ultimate",19.9),
                new Manga(1L,"Berserk",9.5),
                new Manga(4L,"Pokemon",3.2),
                new Manga(3L,"Attack on titan",11.20),
                new Manga(2L,"Dragon ball Z",2.99)
        );

        for (Manga manga : mangas) {
            hashSet.add(manga);
            linkedHashSet.add(manga);
            treeSet.add(manga);
        }

        System.out.println("HashSet");
        for (Manga manga : hashSet) {
            System.out.println(manga);
        }




    }
}
