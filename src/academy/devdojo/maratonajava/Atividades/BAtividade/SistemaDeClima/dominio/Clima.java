package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeClima.dominio;

public enum Clima {
    ENSOLARADO(10,"Dia quente"),
    CHUVOSO(7,"Frio"),
    NUBLADO(5,"Dia calmo"),
    TEMPESTADE(2,"Dia complicado");

    private double multiplicadorDeEnergia;
    private String descricaoTextual;

    Clima(double multiplicadorDeEnergia, String descricaoTextual) {
        this.multiplicadorDeEnergia = multiplicadorDeEnergia;
        this.descricaoTextual = descricaoTextual;
    }

    public double getMultiplicadorDeEnergia() {
        return multiplicadorDeEnergia;
    }

    public String getDescricaoTextual() {
        return descricaoTextual;
    }
}
