package academy.devdojo.maratonajava.Atividades.FAtividades.Optional.repositorio;

import academy.devdojo.maratonajava.Atividades.FAtividades.Optional.dominio.Pocao;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PotRepo {
    private static List<Pocao> pocaos = List.of(
            new Pocao(1, "Poção Pequena", 50),
            new Pocao(2, "Poção Média", 150),
            new Pocao(3, "Poção Grande", 300)
    );

    public static Optional<Pocao> findById(Integer id){
        return findBy(p -> p.getId().equals(id));
    }

    public static Optional<Pocao> findByNome(String nome){
        return findBy(p -> p.getNome().equals(nome));
    }


    private static Optional<Pocao> findBy(Predicate<Pocao> predicate){
        Pocao found = null;
        for (Pocao pocao : pocaos) {
            if (predicate.test(pocao)){
                found = pocao;
            }
        }
        return Optional.ofNullable(found);
    }
}
