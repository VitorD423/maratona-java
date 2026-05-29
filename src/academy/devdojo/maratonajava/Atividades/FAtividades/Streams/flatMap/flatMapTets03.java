package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.flatMap;

import java.util.ArrayList;
import java.util.List;

public class flatMapTets03 {
    public static void main(String[] args) {
        List<List<String>> inventarios = new ArrayList<>();

        List<String> bolsa1 = List.of("Espada","Poção","Escudo");
        List<String> bolsa2 = List.of("Arco","Flecha");
        List<String> bolsa3 = List.of("Cajado","Livro");

        inventarios.add(bolsa1);
        inventarios.add(bolsa2);
        inventarios.add(bolsa3);
    }
}
