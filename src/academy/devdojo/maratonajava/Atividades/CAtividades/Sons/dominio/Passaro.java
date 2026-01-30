package academy.devdojo.maratonajava.Atividades.CAtividades.Sons.dominio;

public class Passaro extends Animal{
    public Passaro(String especie, String som) {
        super(especie, som);
    }

    @Override
    public void emitirSom() {
        System.out.println(getSom());
    }
}
