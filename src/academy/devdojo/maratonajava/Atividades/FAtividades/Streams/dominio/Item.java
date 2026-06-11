package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio;

public class Item {
    private String nome;
    private double valor;
    private String tipo;


    public Item(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Item(String nome, double valor, String tipo) {
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }


    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
