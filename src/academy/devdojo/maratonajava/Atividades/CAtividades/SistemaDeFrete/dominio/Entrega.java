package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeFrete.dominio;

public abstract class Entrega implements CalculavelFrete{
    private String descricao;
    private double peso;

    public Entrega(String descricao, double peso) {
        this.descricao = descricao;
        this.peso = peso;
    }

    @Override
    public abstract double calcularFrete();




    public String getDescricao() {
        return descricao;
    }

    protected double getPeso() {
        return peso;
    }
}
