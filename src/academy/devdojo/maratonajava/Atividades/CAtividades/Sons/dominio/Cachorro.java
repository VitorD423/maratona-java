package academy.devdojo.maratonajava.Atividades.CAtividades.Sons.dominio;

public class Cachorro extends Animal{
    public Cachorro(String especie, String som) {
        super(especie, som);
    }

    @Override
    public void emitirSom() {
        System.out.println(getSom());
    }
}
