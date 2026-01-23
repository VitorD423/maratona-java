package academy.devdojo.maratonajava.javacore.BAtividade.dominio;

public class Veiculo {
    protected String marca;
    protected double velocidadeMaxima;

    public Veiculo(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double calcularImposto(){
        return velocidadeMaxima * 0.1;
    }


    public void imprimir(){
        System.out.println("Veiculo");
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade: " + velocidadeMaxima);
        System.out.println("Imposto: " + calcularImposto());
    }
}
