package academy.devdojo.maratonajava.javacore.BAtividade.dominio.SistemaDePersonagem.dominio;

public enum TipoAtaque {
    CORPO_A_CORPO(2.5),
    MAGIA(10.5),
    DISTANCIA(5.8);

    private double multiplicadorDeDano;

    TipoAtaque(double multiplicadorDeDano) {
        this.multiplicadorDeDano = multiplicadorDeDano;
    }

    public double getMultiplicadorDeDano() {
        return multiplicadorDeDano;
    }
}
