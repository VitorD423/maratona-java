package academy.devdojo.maratonajava.Atividades.FAtividades.MethodReference.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.MethodReference.Interfaces.MPredicate;
import academy.devdojo.maratonajava.Atividades.FAtividades.MethodReference.dominio.SistemaDeMagia;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;



public class SistemaDeMagiaTest {
    public static void main(String[] args) {
        List<SistemaDeMagia> magias = new ArrayList<>(List.of(
                new SistemaDeMagia("Fireball", 500),
                new SistemaDeMagia("Ice Spear", 200),
                new SistemaDeMagia("Thunder", 900),
                new SistemaDeMagia("Wind Slash", 300)
        ));
        magias.forEach(System.out::println);

        System.out.println();

        System.out.println("Magias com o dano maior que 400: ");

        List<SistemaDeMagia> maiorQue400 = filter(magias,magia -> magia.getDano() > 400);
        System.out.println(maiorQue400);

        System.out.println();

        System.out.println("Nomes: ");
        List<String> Nomes = map(magias, SistemaDeMagia::getNome);
        System.out.println(Nomes);


        BiFunction<String, Integer, SistemaDeMagia> sistemaDeMagiaBiFunction = SistemaDeMagia::new;
        System.out.println(sistemaDeMagiaBiFunction.apply("Vento",100));

        magias.sort(MagiaUtils::compareByDamage);
    }

    public class MagiaUtils {
        public static int compareByDamage(SistemaDeMagia m1, SistemaDeMagia m2){
            return Integer.compare(m1.getDano(), m2.getDano());
        }
    }



    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T e: list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }


}
