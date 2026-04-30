package academy.devdojo.maratonajava.Atividades.FAtividades.Wildcard.test;


import java.util.ArrayList;
import java.util.List;
abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal {
    private String raca;
    private int idade;

    public Cachorro(String raca, int idade){
        this.raca = raca;
        this.idade = idade;
    }

    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal {
    private String raca;
    private int idade;


    public  Gato(String raca, int idade){
        this.raca = raca;
        this.idade = idade;
    }
    @Override
    public void consulta() {
        System.out.println("Consultando gato da raça : " + this.raca + " Idade: " + idade);
    }

}

public class WildcardATV1 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro("Pitbull",12), new Cachorro("Labrador",2));
        List<Gato> gatos = List.of(new Gato("Malhado",2), new Gato("Garfild",21));

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
        lista.add(new Cachorro("Viralata",4));
        lista.add(new Cachorro("Linguiça",1));

        lista.add(new Gato("Robert",5));
        lista.add(new Gato("Kyo", 7));
    }

    private static void mostrarConsulta(List<? super  Animal> lista){
        for (Object obj : lista){
            Animal a = (Animal) obj;
            a.consulta();
        }
    }
}
