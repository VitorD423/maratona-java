package academy.devdojo.maratonajava.Atividades.FAtividades.Lambda.dominio;

public class Item {
    private String nome;
    private String raridade;
    private double valor;

    public Item(String nome, String raridade, double valor) {
        this.nome = nome;
        this.raridade = raridade;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", raridade='" + raridade + '\'' +
                ", valor=" + valor +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getRaridade() {
        return raridade;
    }

    public double getValor() {
        return valor;
    }
}
