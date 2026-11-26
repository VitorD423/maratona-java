package academy.devdojo.maratonajava.Atividades.EAtividades.EstacionamentoRegraDeNegocio.dominio;

public abstract class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public abstract double aplicarBeneficio (double valor, long horas);

    public String getNome() {
        return nome;
    }
}
