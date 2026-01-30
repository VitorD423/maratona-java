package academy.devdojo.maratonajava.Atividades.CAtividades.Sons.dominio;

public abstract class Animal {
    private String especie;
    private String som;

    public Animal(String especie, String som) {
        this.especie = especie;
        this.som = som;
    }




    public abstract void emitirSom();



    protected String getSom() {
        return som;
    }


    public String getEspecie() {
        return especie;
    }


}


