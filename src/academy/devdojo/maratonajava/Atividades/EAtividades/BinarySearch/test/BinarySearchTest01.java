package academy.devdojo.maratonajava.Atividades.EAtividades.BinarySearch.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(1);
        numeros.add(9);
        numeros.add(3);
        numeros.add(7);

        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,3));
        System.out.println(Collections.binarySearch(numeros,8));

    }
}
