package academy.devdojo.maratonajava.Atividades.FAtividades.Queue.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopSemOrdenar {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(Comparator.comparing(Manga::getPreco, Comparator.reverseOrder()));
        mangas.add(new Manga(5L,"Hellsing Ultimate",19.9,0));
        mangas.add(new Manga(1L,"Berserk",9.5,5));
        mangas.add(new Manga(4L,"Pokemon",3.2,0));
        mangas.add(new Manga(3L,"Attack on titan",11.20,2));
        mangas.add(new Manga(2L,"Dragon ball Z",2.99,0));
        mangas.add(new Manga(10L,"Aaragon",2.99,0));

    for (int i = 0; i < 3 && !mangas.isEmpty(); i++) {
        System.out.println(mangas.poll());
    }

    }
}
