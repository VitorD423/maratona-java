package academy.devdojo.maratonajava.Atividades.BAtividade.dominio;

public class Veiculo {
    protected String marca;
    protected double velocidadeMaxima;

    static {
        System.out.println("Static Veiculo");
    }

    {
        System.out.println("Instance Veiculo 1");
    }
    {
        System.out.println("Instance Veiculo 2");
    }

    public Veiculo() {
        System.out.println("Constructor Veiculo");
    }

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
