package academy.devdojo.maratonajava.Atividades.FAtividades.Parametrizacao.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Parametrizacao.dominio.Personagem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class personagemTest01 {
    private static List<Personagem> personagens = List.of(
            new Personagem("Vitor",22,"Mago"),
            new Personagem("Diego",15,"Arqueiro"),
            new Personagem("Actor",30,"Guerreiro"),
            new Personagem("Gabriel",52,"Clérigo"),
            new Personagem("Lucas",41,"Druida"));

    public static void main(String[] args) {
        List<Personagem> maiorQue50 = filter(personagens,personagens -> personagens.getNivel() > 50 );
        List<Personagem> somenteMagos = filter(personagens,personagens -> personagens.getClasse().equals("Mago"));
        List<Personagem> startsWithA = filter(personagens,personagens -> personagens.getNome().startsWith("A"));
        System.out.println(maiorQue50);
        System.out.println(somenteMagos);
        System.out.println(startsWithA);
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
}
