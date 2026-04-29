package academy.devdojo.maratonajava.Atividades.FAtividades.Wildcard.test;


import java.util.ArrayList;
import java.util.List;
abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }

}

public class WildcardATV1 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        realizarConsulta(cachorros);
        realizarConsulta(gatos);

        System.out.println("-------------------");

        List<Animal> animais = new ArrayList<>();
        adicionarAnimais(animais);
        mostrarConsulta(animais);
    }

    private static void realizarConsulta(List<? extends Animal> animais){
        for (Animal animals : animais) {
            animals.consulta();
        }
    }
    private static void adicionarAnimais(List<? super Animal> lista){
        lista.add(new Cachorro());
        lista.add(new Cachorro());

        lista.add(new Gato());
        lista.add(new Gato());
    }

    private static void mostrarConsulta(List<? super  Animal> lista){
        for (Object obj : lista){
            Animal a = (Animal) obj;
            a.consulta();
        }
    }
}
