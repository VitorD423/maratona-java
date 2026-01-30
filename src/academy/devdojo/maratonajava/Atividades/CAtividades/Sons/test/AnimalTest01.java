package academy.devdojo.maratonajava.Atividades.CAtividades.Sons.test;

import academy.devdojo.maratonajava.Atividades.CAtividades.Sons.Servico.Zoologico;
import academy.devdojo.maratonajava.Atividades.CAtividades.Sons.dominio.Animal;
import academy.devdojo.maratonajava.Atividades.CAtividades.Sons.dominio.Cachorro;
import academy.devdojo.maratonajava.Atividades.CAtividades.Sons.dominio.Gato;
import academy.devdojo.maratonajava.Atividades.CAtividades.Sons.dominio.Passaro;

public class AnimalTest01 {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro("Cachorro","Au Au");
        Animal animal2 = new Gato("Gato","Miau");
        Animal animal3 = new Passaro("Passaro","Piu Piu");

        Zoologico.fazerAnimalEmitirSom(animal1);
        System.out.println("-----------------------------");
        Zoologico.fazerAnimalEmitirSom(animal2);
        System.out.println("-----------------------------");
        Zoologico.fazerAnimalEmitirSom(animal3);

    }
}
