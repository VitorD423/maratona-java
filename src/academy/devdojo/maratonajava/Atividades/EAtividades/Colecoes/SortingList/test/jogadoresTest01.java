package academy.devdojo.maratonajava.Atividades.EAtividades.Colecoes.SortingList.test;

import academy.devdojo.maratonajava.Atividades.EAtividades.Colecoes.SortingList.dominio.Jogadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class jogadoresTest01 {
    public static void main(String[] args) {
        List<Jogadores> jogadores = new ArrayList<>(3);
        jogadores.add(new Jogadores("Vini Junior",250,0,1,2L));
        jogadores.add(new Jogadores("Pedro",300,1,2,4L));
        jogadores.add(new Jogadores("Neymar",2,1,2,3L));
        jogadores.add(new Jogadores("João",140,0,0,1L));


        System.out.println("Ranking completo: ");

        jogadores.sort(Comparator.comparing(Jogadores::getGolsMarcados).reversed()
                .thenComparing(Jogadores::getAssistencias, Comparator.reverseOrder())
                .thenComparing(Jogadores::getHorasJogadas, Comparator.reverseOrder())
                .thenComparing(Jogadores::getNome, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)));



        for (Jogadores jogadore : jogadores) {
            System.out.println(jogadore);
        }


//        Collections.sort(jogadores);
//        System.out.println("Ordem alfabética:");
//        for (Jogadores jogadore : jogadores) {
//            System.out.println(jogadore);
//        }
//        System.out.println("---------------------");
//        jogadores.sort(Comparator.comparing(Jogadores::getHorasJogadas).reversed());
//        System.out.println("Horas jogadas:");
//        for (Jogadores jogadore : jogadores) {
//            System.out.println(jogadore);
//        }
//        System.out.println("--------------------");
//        jogadores.sort(Comparator.comparing(Jogadores::getGolsMarcados).reversed());
//        System.out.println("Saldo de gols:");
//        for (Jogadores jogadore : jogadores) {
//            System.out.println(jogadore);
//        }
//        System.out.println("-------------------");
//        jogadores.sort(Comparator.comparing(Jogadores::getAssistencias).reversed());
//        System.out.println("Assistências:");
//        for (Jogadores jogadore : jogadores) {
//            System.out.println(jogadore);
//        }

    }
}
