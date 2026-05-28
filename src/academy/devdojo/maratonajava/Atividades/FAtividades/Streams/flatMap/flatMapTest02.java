package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatMapTest02 {
    public static void main(String[] args) {

        List<String> magias = List.of("Fire","Ice","Wind");
        String[] letters = magias.get(1).split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> collect = magias.stream().map(w -> w.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream(letters);
        List<String> letters2 = magias.stream().map(w -> w.split(""))
                .flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(letters2);

    }
}
