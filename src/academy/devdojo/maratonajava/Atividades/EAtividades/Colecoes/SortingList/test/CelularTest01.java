package academy.devdojo.maratonajava.Atividades.EAtividades.Colecoes.SortingList.test;


import academy.devdojo.maratonajava.Atividades.EAtividades.Colecoes.SortingList.dominio.Celular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CelularComparableById implements Comparator<Celular>{
    @Override
    public int compare(Celular celular1, Celular celular2) {
        return celular1.getId().compareTo(celular2.getId());
    }
}

class CelularComparableByPreco implements Comparator<Celular>{
    @Override
    public int compare(Celular celular1, Celular celular2) {
        return Double.compare(celular1.getPreco(), celular2.getPreco());
    }
}



public class CelularTest01 {
    public static void main(String[] args) {
        List<Celular> celular = new ArrayList<>(3);
        celular.add(new Celular(2L,"samsung",340));
        celular.add(new Celular(1L,"Xiaomi",210));
        celular.add(new Celular(3L,"Apple",500));
        System.out.println("Alfabetica: ");
        Collections.sort(celular);
        for (Celular celulares : celular) {
            System.out.println(celulares);
        }
        System.out.println("---------------------");

        Collections.sort(celular, new CelularComparableById());
        System.out.println("ID: ");
        for (Celular celulares : celular) {
            System.out.println(celulares);
        }

        System.out.println("---------------------------");

        Collections.sort(celular, new CelularComparableByPreco());
        System.out.println("Preço: ");
        for (Celular celulares : celular){
            System.out.println(celulares);
        }

        System.out.println("-----------------------------");
        System.out.println("Ordena por preço se empatar ordena por modelo");
        celular.sort(Comparator.comparing(Celular::getPreco).thenComparing(Celular::getModelo));
        for (Celular celulares : celular) {
            System.out.println(celulares);
        }

    }
}
