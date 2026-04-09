package academy.devdojo.maratonajava.Atividades.EAtividades.BinarySearch.test;

import academy.devdojo.maratonajava.Atividades.EAtividades.BinarySearch.dominio.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FilmesByAno implements Comparator<Filme>{
    @Override
    public int compare(Filme filme1, Filme filme2) {
       return Integer.compare(filme1.getAno(),filme2.getAno());
    }
}

public class FilmeAtv02 {
    public static void main(String[] args) {

        FilmesByAno filmesByAno = new FilmesByAno();

        List<Filme> filmes = new ArrayList<>(5);
        filmes.add(new Filme("Liga da justiça",2012));
        filmes.add(new Filme("Avengers",2020));
        filmes.add(new Filme("Homem-aranha",2004));
        filmes.add(new Filme("God father",1994));
        filmes.add(new Filme("Minecraft",2025));

       Comparator<Filme> comparator = Comparator.comparing(Filme::getAno);
       filmes.sort(comparator);
       for (Filme filme : filmes) {
            System.out.println(filme);
        }

        Filme chave = new Filme("",2012);
        System.out.println(Collections.binarySearch(filmes,chave,comparator));

    }
}
