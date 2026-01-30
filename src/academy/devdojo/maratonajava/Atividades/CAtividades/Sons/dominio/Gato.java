package academy.devdojo.maratonajava.Atividades.CAtividades.Sons.dominio;

public class Gato extends Animal{
    public Gato(String especie, String som) {
        super(especie, som);
    }

    @Override
    public void emitirSom() {
        System.out.println(getSom());
    }
}
