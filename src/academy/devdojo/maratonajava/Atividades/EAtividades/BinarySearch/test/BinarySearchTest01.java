package academy.devdojo.maratonajava.Atividades.EAtividades.BinarySearch.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(6);
        numeros.add(8);
        numeros.add(10);


        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,3));
        System.out.println(Collections.binarySearch(numeros,7));

    }
}
