package academy.devdojo.maratonajava.Atividades.FAtividades.Generica.Test;

import java.util.List;

class Resultado<T>{
    T menor;
    T maior;

    public Resultado(T menor, T maior) {
        this.menor = menor;
        this.maior = maior;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "menor=" + menor +
                ", maior=" + maior +
                '}';
    }
}
public class MetodoGenericoTest {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,5,3);
        List<String> nomes = List.of("a","z","b");

        Resultado<Integer> resultadoNumeros = maxEmin(numeros);
        Resultado<String> resultadoNomes = maxEmin(nomes);
        System.out.println(resultadoNumeros);
        System.out.println(resultadoNomes);
    }

    private static <T extends Comparable<T>> Resultado<T> maxEmin(List<T> lista){
        T menor = lista.get(0);
        T maior = lista.get(0);
        for (T elemento : lista){
            if (elemento.compareTo(menor) < 0){
            menor = elemento;
            }
        }
        for (T elemento : lista){
            if (elemento.compareTo(maior) > 0){
                maior = elemento;
            }
        }
        return  new Resultado<>(menor,maior);
    }

}
