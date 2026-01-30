package academy.devdojo.maratonajava.Atividades.CAtividades.Sons.Servico;

import academy.devdojo.maratonajava.Atividades.CAtividades.Sons.dominio.Animal;

public class Zoologico{
    public static void fazerAnimalEmitirSom(Animal animal){
        System.out.println("Espécie:" + animal.getEspecie());
        animal.emitirSom();
    }
}
