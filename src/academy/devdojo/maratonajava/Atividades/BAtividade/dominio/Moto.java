package academy.devdojo.maratonajava.Atividades.BAtividade.dominio;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, double velocidadeMaxima, int cilindradas) {
        super(marca, velocidadeMaxima);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularImposto() {
        return velocidadeMaxima *0.05;
    }

    @Override
    public void imprimir() {
        System.out.println("Moto");
        super.imprimir();
        System.out.println("Cilindradas: " + this.cilindradas);
    }


}
