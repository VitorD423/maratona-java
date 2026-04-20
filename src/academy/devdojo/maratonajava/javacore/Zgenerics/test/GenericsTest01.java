package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        //Conceito type erasure apaga o tipo depois do codigo ser compilado
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");
        lista.add("Midoriya");

        for (Object o : lista) {
            System.out.println(o);
        }

    }

}
