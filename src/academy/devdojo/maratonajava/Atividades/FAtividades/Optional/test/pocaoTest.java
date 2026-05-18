package academy.devdojo.maratonajava.Atividades.FAtividades.Optional.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Optional.dominio.Pocao;
import academy.devdojo.maratonajava.Atividades.FAtividades.Optional.repositorio.PotRepo;

import java.util.Optional;

public class pocaoTest {
    public static void main(String[] args) {

        Optional<Pocao> pocaoByNome = PotRepo.findByNome("Poção Média");
        pocaoByNome.ifPresent(p -> p.setNome("Poção Média Plus"));
        System.out.println(pocaoByNome);

        Pocao pocaoById = PotRepo.findById(10).orElse(new Pocao(99,"Poção Genérica",10));
        System.out.println(pocaoById);

        Pocao pocaoSuprema = PotRepo.findByNome("Poção Suprema").orElseGet(() -> new Pocao(4, "Poção Suprema", 1000));
        System.out.println(pocaoSuprema);

        Pocao pocaoById2 = PotRepo.findById(50).orElseThrow(IllegalArgumentException::new);
    }

}
