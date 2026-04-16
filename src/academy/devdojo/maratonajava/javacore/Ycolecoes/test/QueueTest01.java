package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");
        // peek sempre vai mostrar o primeiro elemento
        // poll pega o primeiro elemento da fila e remove
        //

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
