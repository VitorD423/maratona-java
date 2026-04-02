package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Hellsing Ultimate");
        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Attack on titan");
        mangas.add("Dragon ball Z");
        Collections.sort(mangas);
        for (String manga: mangas){
            System.out.println(manga);
        }
    }
}
