package academy.devdojo.maratonajava.Atividades.DAtividades.ProvaTecnica.dominio;

public abstract class Entrega implements Processavel{
    private String destinatario;
    private double peso;
    private TipoEntrega tipoEntrega;

    public Entrega(String destinatario, double peso, TipoEntrega tipoEntrega) {
        if (peso <= 0){
            throw new IllegalArgumentException("Peso invalido");
        }

        this.destinatario = destinatario;
        this.peso = peso;
        this.tipoEntrega = tipoEntrega;
    }

    public abstract double calcularCusto();

    public abstract void processarEntrega();

    public String getDestinatario() {
        return destinatario;
    }

    public double getPeso() {
        return peso;
    }

    public TipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }
}
