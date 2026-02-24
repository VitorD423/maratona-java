package academy.devdojo.maratonajava.Atividades.EAtividades.AssinaturaDeStreming.dominio;

public abstract class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public abstract double aplicarBeneficio (double valor);
}
